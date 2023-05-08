package BaiThucHanhLab4;

import java.util.ArrayList;
import java .util.Scanner;

public class Slide22 {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("nhap vao kich thuoc mang: ");
        int n = sc.nextInt();

        for (int i = 0;i < n; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            number = sc.nextInt();
            arrList.add(number);
        }
        
        System.out.print("phan tu trong mang la: ");
        for (Integer integer : arrList) {
            System.out.print(integer + "\t");
        }

        int max = arrList.get(0);
        for (int i= 0;i< arrList.size(); i++) {
            if (arrList.get(i).compareTo(max) > 0) {
                max = arrList.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong mang la: " + max);
    }
}
