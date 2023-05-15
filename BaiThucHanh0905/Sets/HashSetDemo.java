package BaiThucHanh0905.Sets;

import java.util.HashSet;
import java.util.Scanner;
import BaiThucHanh0905.Student;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhap thong tin sinh vien " + i + ":");
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

        
        while (true) {
            System.out.println("Chon 1 option:");
            System.out.println("1. Them sinh vien moi");
            System.out.println("2. Cap nhat thong tin sinh vien");
            System.out.println("3. Xoa thong tin sinh vien");
            System.out.println("4. Hien thi tat ca thong tin sinh vien");
            System.out.println("5. Thoat");
            System.out.print("Nhap option cua ban: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin sinh vien:");
                    System.out.print("Full Name: ");
                    String newFullName = scanner.nextLine();
                    System.out.print("Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();

                    Student newStudent = new Student(newFullName, newAge);
                    students.add(newStudent);
                    System.out.println("Sinh vien moi da duoc them.");
                    break;

                case 2:
                    System.out.println("Nhap vao full name moi cua sinh vien: ");
                    String fullNameToUpdate = scanner.nextLine();
                    boolean found = false;
                    for (Student student : students) {
                        if (student.getFullName().equalsIgnoreCase(fullNameToUpdate)) {
                            System.out.println("Nhap vao age moi cua sinh vien:");
                            int newStudentAge = scanner.nextInt();
                            scanner.nextLine(); 
                            student.setAge(newStudentAge);
                            found = true;
                            System.out.println("Thong tin sinh vien da duoc update.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;

                case 3:
                    System.out.println("Nhap vao full name sinh vien can xoa: ");
                    String fullNameToRemove = scanner.nextLine();
                    boolean removed = false;
                    for (Student student : students) {
                        if (student.getFullName().equalsIgnoreCase(fullNameToRemove)) {
                            students.remove(student);
                            removed = true;
                            System.out.println("Thong tin sinh vien nay da duoc xoa.");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;

                case 4:
                    System.out.println("Thong tin sinh vien da duoc nhap:");
                    for (Student student : students) {
                        student.inThongTin();
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Thoat ra.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Hay nhap vao so hop le !!!");
                }
            }
        }
}
