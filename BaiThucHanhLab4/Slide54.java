package BaiThucHanhLab4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hasint = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hasint.add(0);
        hasint.add(3);
        hasint.add(1);
        hasint.add(4);
        hasint.add(2);
        hasint.add(8);

        System.out.println("cac phan tu trong hasint: ");
        System.out.println(hasint);
        System.out.println("nhap phan tu can them: ");
        number = sc.nextInt();

        if (hasint.contains(number)) {
            hasint.add(number);
            System.out.println("them thanh cong: ");
            System.out.println("cac phan tu trong hasint sau khi them: ");
            System.out.println(hasint);
        } else {
            System.out.println("phan tu" + number + " da ton tai!");
        }
    }
}
