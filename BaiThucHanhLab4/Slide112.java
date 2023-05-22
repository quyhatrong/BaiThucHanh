package BaiThucHanhLab4;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

public class Slide112 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập tên sinh viên (nhập rỗng để dừng): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Nhập điểm sinh viên: ");
            double score = scanner.nextDouble();
            scanner.nextLine();

            Student student = new Student(name, score);
            studentList.add(student);
        }

        int countRetake = 0;
        System.out.println("\nThông tin sinh viên phải thi lại:");
        for (Student student : studentList) {
            if (student.getScore() <= 5) {
                countRetake++;
                System.out.println("Tên: " + student.getName() + ", Điểm: " + student.getScore());
            }
        }
        System.out.println("Số sinh viên phải thi lại: " + countRetake);

        double maxScore = Double.MIN_VALUE;
        System.out.println("\nThông tin sinh viên có điểm cao nhất:");
        for (Student student : studentList) {
            if (student.getScore() > maxScore) {
                maxScore = student.getScore();
            }
        }
        for (Student student : studentList) {
            if (student.getScore() == maxScore) {
                System.out.println("Tên: " + student.getName() + ", Điểm: " + student.getScore());
            }
        }

        System.out.print("\nNhập tên sinh viên cần tìm kiếm: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        System.out.println("\nThông tin sinh viên tìm kiếm:");
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Tên: " + student.getName() + ", Điểm: " + student.getScore());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên '" + searchName + "'");
        }
    }
}
