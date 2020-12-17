package Segment1.Second;

public class Student implements Comparable {
    private String Sno;
    private String Sname;
    private double math;
    private double chinese;
    private double english;

    public Student(String sno, String sname) {
        this.Sno = sno;
        this.Sname = sname;
    }

    public Student(String sno, String sname, double math, double chinese, double english) {
        this.Sno = sno;
        this.Sname = sname;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }

    public String getSno() {
        return Sno;
    }

    public void setSno(String sno) {
        Sno = sno;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    //计算总成绩
    public double count_total_grade() {
        double total = this.math + this.chinese + this.english;
        return (double)Math.round(total * 1000) / 1000;
    }

    @Override
    public String toString() {
        return "Sno:" + Sno + '\t' +
                "Sname:" + Sname + '\t' +
                "math:" + math + '\t' +
                "chinese:" + chinese + '\t' +
                "english:" + english + '\t' +
                "total:" + this.count_total_grade() + " ";
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        double total1 = this.count_total_grade();
        double total2 = s.count_total_grade();

        if (total1 > total2) {
            return -1;
        } else if (total1 < total2) {
            return 1;
        } else {
            return 0;
        }
    }
}
