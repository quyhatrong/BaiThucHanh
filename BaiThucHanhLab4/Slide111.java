package BaiThucHanhLab4;

import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong danh sách: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các số nguyên dương:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }

        double tbc = (double) sum / count;
        System.out.println("Trung bình cộng của các số chẵn: " + tbc);
    }
}