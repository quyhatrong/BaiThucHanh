import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tong = 0;
            int a;

            do {
                System.out.println("Nhap vao so nguyen tiep theo: ");
                a = sc.nextInt();
                tong = tong + a;

            } while (tong < 100);
            System.out.println("Tong cac so da nhap la: " + tong);
        }
    }
}
