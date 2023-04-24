package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class App {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(2, 3);
        HinhTron htr = new HinhTron(2.5);
        HinhTru ht = new HinhTru(3, 2.5);
        HinhVuong hv = new HinhVuong(4);

        hcn.tinhChuVi();
        hcn.tinhDienTich();

        htr.tinhChuVi();
        htr.tinhDienTich();

        ht.tinhChuVi();
        ht.tinhDienTich();

        hv.tinhChuVi();
        hv.tinhDienTich();
    }
}