package BaiThucHanh0905.Lists;

import java.util.ArrayList;
import java.util.Scanner;

import BaiThucHanh0905.Student;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap thong tin sinh vien " + i + ":");
            System.out.print("Full Name: ");
            String fullName = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            Student student = new Student(fullName, age);
            st.add(student);
        }

        System.out.println("Thong tin sinh vien da nhap:");
        for (Student student : st) {
            student.inThongTin();
            System.out.println();
        }

        sc.close();
    }
}
