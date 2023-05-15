package BaiThucHanh0905;

public class Student {
    private String fullName;
    private int age;

    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void inThongTin() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }   

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
