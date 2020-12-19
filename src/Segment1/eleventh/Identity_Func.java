package Segment1.eleventh;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Identity_Func {
    //判断身份证id是否有效
    public static boolean is_valid_id(String id) {
        if (id.length() != 18)
            return false;
        for (int i = 0; i < 17; i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9')
                return false;
        }
        if ((id.charAt(17) < '0' || id.charAt(17) > '9') && id.charAt(17) != 'X')
            return false;
        return true;
    }

    public static String[] get_info_from_id(String id) throws Exception {
        if (!is_valid_id(id)) {
            throw new Exception("身份证号不正确");
        }
        String[] result = new String[5];
        //分别表示获取省份、年龄、属相、星座、性别
        result[0] = get_province(id);
        result[1] = get_age(id);
        result[2] = get_aniaml(id);
        result[3] = get_constellation(id);
        result[4] = get_gender(id);
        return result;
    }

    //保存身份证前两位数与省份名的映射`
    public static Map<String, String> city_codes = new HashMap<String, String>();
    //保存属相的映射，已知1900年为鼠年，根据出生年份距离1900年差值计算属相
    public static Map<Integer, String> year_animal = new HashMap<Integer, String>();

    static {
        city_codes.put("11", "北京");
        city_codes.put("12", "天津");
        city_codes.put("13", "河北");
        city_codes.put("14", "山西");
        city_codes.put("15", "内蒙古");
        city_codes.put("21", "辽宁");
        city_codes.put("22", "吉林");
        city_codes.put("23", "黑龙江");
        city_codes.put("31", "上海");
        city_codes.put("32", "江苏");
        city_codes.put("33", "浙江");
        city_codes.put("34", "安徽");
        city_codes.put("35", "福建");
        city_codes.put("36", "江西");
        city_codes.put("37", "山东");
        city_codes.put("41", "河南");
        city_codes.put("42", "湖北");
        city_codes.put("43", "湖南");
        city_codes.put("44", "广东");
        city_codes.put("45", "广西");
        city_codes.put("46", "海南");
        city_codes.put("50", "重庆");
        city_codes.put("51", "四川");
        city_codes.put("52", "贵州");
        city_codes.put("53", "云南");
        city_codes.put("54", "西藏");
        city_codes.put("61", "陕西");
        city_codes.put("62", "甘肃");
        city_codes.put("63", "青海");
        city_codes.put("64", "宁夏");
        city_codes.put("65", "新疆");
        city_codes.put("71", "台湾");
        city_codes.put("81", "香港");
        city_codes.put("82", "澳门");
        city_codes.put("91", "国外");

        year_animal.put(0, "鼠");
        year_animal.put(1, "牛");
        year_animal.put(2, "虎");
        year_animal.put(3, "兔");
        year_animal.put(4, "龙");
        year_animal.put(5, "蛇");
        year_animal.put(6, "马");
        year_animal.put(7, "羊");
        year_animal.put(8, "猴");
        year_animal.put(9, "鸡");
        year_animal.put(10, "狗");
        year_animal.put(11, "猪");
    }

    //根据身份证号获取省份
    public static String get_province(String id) throws Exception {
        String p_id = id.substring(0, 2);
        if (p_id == null) {
            throw new Exception("身份证号不正确");
        }
        return city_codes.get(p_id);
    }

    //根据身份证号获取年龄
    public static String get_age(String id) {
        String year_birth = id.substring(6, 10);
        Calendar date = Calendar.getInstance();
        int year_cur = date.get(Calendar.YEAR);
        int age = year_cur - Integer.parseInt(year_birth);
        return String.valueOf(age);
    }

    //根据身份证号获取属相
    public static String get_aniaml(String id) {
        String year_birth = id.substring(6, 10);
        //已知1900年为鼠年
        int year_diff = Integer.parseInt(year_birth) - 1900;//表示出生年份与1900的差值
        String animal = year_animal.get(year_diff % 12);
        return animal;
    }

    //根据身份证号获取星座
    public static String get_constellation(String id) {
        int month = Integer.parseInt(id.substring(10, 12));
        int day = Integer.parseInt(id.substring(12, 14));
        String value="";

        if(((month==3)   && (day >=21)) || ((month==4)  &&(day<=19))) value="白羊座";
        if(((month==4)   && (day >=20)) || ((month==5)  &&(day<=20))) value="金牛座";
        if(((month==5)   && (day >=21)) || ((month==6)  &&(day<=21))) value="双子座";
        if(((month==6)   && (day >=22)) || ((month==7)  &&(day<=22))) value="巨蟹座";
        if(((month==7)   && (day >=23)) || ((month==8)  &&(day<=22))) value="狮子座";
        if(((month==8)   && (day >=23)) || ((month==9)  &&(day<=22))) value="处女座";
        if(((month==9)   && (day >=23)) || ((month==10) &&(day<=23))) value="天秤座";
        if(((month==10)  && (day >=24)) || ((month==11) &&(day<=22))) value="天蝎座";
        if(((month==11)  && (day >=23)) || ((month==12) &&(day<=21))) value="射手座";
        if(((month==12)  && (day >=22)) || ((month==1)  &&(day<=19))) value="摩羯座";
        if(((month==1)   && (day >=20)) || ((month==2)  &&(day<=18))) value="水瓶座";
        if(((month==2)   && (day >=19)) || ((month==3)  &&(day<=20))) value="双鱼座";

        return value;
    }

    //根据身份证获取性别
    public static String get_gender(String id) {
        String gender = null;
        char c = id.charAt(id.length() - 2);
        int sex = Integer.parseInt(String.valueOf(c));
        if(sex % 2 == 0){
            gender = "女";
        } else {
            gender = "男";
        }
        return gender;
    }

    public static void main(String[] args) throws Exception {
        String id = "21038119980607651X";
        String s = get_province(id);
        System.out.println(s);

        s = get_age(id);
        System.out.println(s);

        s = get_aniaml(id);
        System.out.println(s);
    }

}
