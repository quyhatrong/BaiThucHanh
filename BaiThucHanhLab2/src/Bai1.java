import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            float a, b;
            System.out.println("Nhap vao a: ");
            a = sc.nextFloat();
            System.out.println("Nhap vao b: ");
            b = sc.nextFloat();

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a x b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
            System.out.println("");

            System.out.println("a = b ? " + (a == b));
            System.out.println("a < b ? " + (a < b));
            System.out.println("a > b ? " + (a > b));
            System.out.println("a != b ? " + (a != b));
            System.out.println("a >= b ? " + (a >= b));
            System.out.println("a <= b ? " + (a <= b));
        }

    }
}
