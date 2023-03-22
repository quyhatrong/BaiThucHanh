import java.util.Scanner;

public class ClassHinhTron {

    final float PI = 3.14f;
    float R;
    float P;
    double S;

    public void nhapBanKinh() {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Nhap ban kinh R (>0): ");
                R = sc.nextFloat();
            } while (R <= 0);
        }
    }

    public void tinhChuVi() {
        P = 2 * R * PI;
    }

    public void tinhDienTich() {
        S = R * R * PI;
    }

    public void xuatSoLieu() {
        System.out.println("Chu vi: " + P);
        System.out.print("Dien tich: " + S);
    }
}