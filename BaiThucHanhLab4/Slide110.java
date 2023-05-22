package BaiThucHanhLab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong dãy số: ");
        int n = scanner.nextInt();
        System.out.println("Nhập dãy số:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int max = Collections.max(numbers);
        System.out.println("Số nguyên lớn nhất trong dãy: " + max);

        System.out.print("Nhập số nguyên để xoá khỏi dãy số: ");
        int deleteNum = scanner.nextInt();
        numbers.removeIf(num -> num == deleteNum);

        Collections.sort(numbers);
        System.out.println("Dãy số sau khi sắp xếp:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
