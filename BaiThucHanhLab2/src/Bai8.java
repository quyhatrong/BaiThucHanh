import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            int number = 0;
            int sum = 0;

            System.out.println("Nhap vao so luong: ");
            n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Nhap vao so nguyen duong thu " + i + " :");
                number = sc.nextInt();
                sum += number;
            }
            float tbcong = (float) sum / n;

            System.out.println("Trung binh cong cac so da nhap: " + tbcong);
        }
    }
}
