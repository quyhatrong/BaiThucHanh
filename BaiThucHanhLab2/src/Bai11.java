import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = 0;

            do {
                System.out.print("Nhap vao kich thuoc cua mang >0: ");
                a = sc.nextInt();
            } while (a <= 0);
            int[] array1 = new int[a];

            for (int i = 0; i < array1.length; i++) {
                System.out.print("Nhap vao phan tu thu " + i + " cua mang: ");
                array1[i] = sc.nextInt();
            }

            System.out.println("Mang A: ");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + "\t");
            }

            int tangdan;
            for (int i = 0; i < a - 1; i++) {
                for (int j = i + 1; j < a; j++) {
                    if (array1[i] > array1[j]) {
                        tangdan = array1[i];
                        array1[i] = array1[j];
                        array1[j] = tangdan;
                    }
                }
            }

            System.out.println("");
            System.out.println("Mang A sau khi sap xep tang dan: ");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + "\t");
            }
        }
    }
}
