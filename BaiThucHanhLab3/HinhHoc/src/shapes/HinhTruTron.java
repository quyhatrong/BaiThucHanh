package shapes;

import java.util.Scanner;

public class HinhTruTron extends HinhTron {
    private float h;
    private double V;
    private double Sxq;
    private double Stp;

    public void nhapChieuCao() {
        System.out.println("Nhap chieu cao: ");
        Scanner sc = new Scanner(System.in);
        h = sc.nextFloat();
    }

    public void tinhTheTich() {
        V = S * h;
    }

    public void tinhSxq() {
        Sxq = 2 * PI * R * h + 2 * S;
    }

    public void tinhStp() {
        Stp = 2 * PI * R * h + 2 * S;
    }

    public void inTheTich() {
        System.out.println("The tich: " + V);
    }

    public void inSxq() {
        System.out.println("Sxq: " + Sxq);
    }

    public void inStp() {
        System.out.println("Stp: " + Stp);
    }
}
