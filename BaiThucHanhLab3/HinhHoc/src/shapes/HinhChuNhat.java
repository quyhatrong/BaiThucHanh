package shapes;

import java.util.Scanner;

public class HinhChuNhat {
    protected float chieuDai;
    private float chieuRong;
    protected double S;
    private double P;

    public void nhapChieuDai() {
        System.out.println("Nhap vao chieu dai: ");
        Scanner sc = new Scanner(System.in);
        chieuDai = sc.nextFloat();
    }

    public void nhapChieuRong() {
        System.out.println("Nhap vao chieu rong: ");
        Scanner sc = new Scanner(System.in);
        chieuRong = sc.nextFloat();
    }

    public void tinhChuVi() {
        P = 2 * (chieuDai + chieuRong);
    }

    public void tinhDienTich() {
        S = chieuDai * chieuRong;
    }

    public void inChuVi() {
        System.out.println("Chu vi: " + P);
    }

    public void inDienTich() {
        System.out.println("Dien tich: " + S);
    }
}
