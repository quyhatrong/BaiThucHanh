package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTruTron;
import shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        HinhTron ht = new HinhTron();
        HinhTruTron htt = new HinhTruTron();
        HinhVuong hv = new HinhVuong();

        System.out.println("Hinh tron");
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        System.out.println("\n");

        System.out.println("Hinh chu nhat");
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        System.out.println("\n");

        System.out.println("Hinh vuong");
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        System.out.println("\n");

        System.out.println("Hinh tru tron");
        htt.nhapBanKinh();
        htt.nhapChieuCao();
        htt.tinhDienTich();
        htt.tinhTheTich();
        htt.tinhStp();
        htt.tinhSxq();
        htt.inTheTich();
        htt.inSxq();
        htt.inStp();
    }
}