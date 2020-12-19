package Segment1.Fifth;

public class Student {
    private int no;
    private String name;
    private String gender;
    private String major;
    private int grade;

    public Student(int no, String name, String gender, String major, int grade) {
        this.no = no;
        this.name = name;
        this.gender = gender;
        this.major = major;
        this.grade = grade;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
