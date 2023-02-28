import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;

        System.out.println("Nhap vao so nguyen:");
        int a = sc.nextInt();

        do {
            tong = tong + a;
            System.out.println("Nhap vao so nguyen tiep theo: ");
            int b = sc.nextInt();
            
            break;

        } while (tong > 0);
    }
}
