import java.util.LinkedList;
import java.util.Scanner;

public class HTQ688cau1 {
    Scanner sc = new Scanner(System.in);
    LinkedList linkList = new LinkedList<>();
    private String name;
    private int age;
    private String sex;

    public void EnterData() {
        System.out.println("Nhap vao ten sinh vien: ");
        name = sc.nextLine();
        System.out.println("Nhap vao tuoi sinh vien: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao gioi tinh sinh vien: ");
        sex = sc.nextLine();
    }

    public void Display() {
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Tuoi sinh vien: " + age);
        System.out.println("Gioi tinh sinh vien: " + sex);
    }

    public void SearchByName(){
        System.out.println();
    }



}
