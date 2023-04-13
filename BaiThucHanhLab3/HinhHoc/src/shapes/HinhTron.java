package shapes;

import java.util.Scanner;

public class HinhTron {
    protected final float PI = 3.14f;
    protected float R;
    protected double S;
    private double P;

    public void nhapBanKinh() {
        System.out.println("Nhap vao ban kinh hinh: ");
        Scanner sc = new Scanner(System.in);
        R = sc.nextFloat();
    }

    public void tinhChuVi() {
        P = 2 * PI * R;
    }

    public void tinhDienTich() {
        S = PI * R * R;
    }

    public void inDienTich() {
        System.out.println("Dien tich: " + S);
    }

    public void inChuVi() {
        System.out.println("Chu vi: " + P);
    }
}
