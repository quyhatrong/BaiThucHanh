package BaiThucHanh0905.Lists;

import java.util.LinkedList;
import java.util.Scanner;

import BaiThucHanh0905.Student;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien " + (i + 1) + ":");
            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            Student student = new Student(fullName, age);
            students.add(student);
        }

        
        System.out.println("Thong tin sinh vien da nhap:");
        for (Student student : students) {
            student.inThongTin();
            System.out.println();
        }

        scanner.close();
    }
}


