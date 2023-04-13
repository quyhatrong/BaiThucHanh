package NhanVien;

import java.util.Scanner;

public class NhanVien {
    private Scanner sc = new Scanner(System.in);
    private int maNhanVien, tuoi;
    private String hoTen;
    private float heSoLuong, tongLuong;
    private final float luongCoBan = 1490000;

    public void nhapThongTin() {
        System.out.print("Nhap ma nhan vien: ");
        maNhanVien = sc.nextInt();
        System.out.print("Nhap ho va ten nhan vien: ");
        sc.nextLine();
        hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextFloat();
    }

    public void tinhLuong() {
        tongLuong = heSoLuong * luongCoBan;
    }

    public void InThongTin() {
        System.out.printf(
                "\nThong tin cua nhan vien la: \nMa nhan vien: %d\nHo ten nhan vien: %s\nTuoi: %d\nHe so luong: %f\nLuong: %f",
                maNhanVien, hoTen, tuoi, heSoLuong, tongLuong);
    }
}