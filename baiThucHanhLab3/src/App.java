import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ClassHinhTron ht = new ClassHinhTron();
            ClassSinhVien sv = new ClassSinhVien();

            System.out.print("Chon 1 hoac 2\n  1.Hinh tron\n  2.Sinh vien\n");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    ht.nhapBanKinh();
                    ht.tinhChuVi();
                    ht.tinhDienTich();
                    ht.xuatSoLieu();
                    break;
                case 2:
                    sv.nhapThongTinSV();
                    sv.tinhTuoi();
                    sv.xuatThongTinSV();
                    break;
                default:
                    System.out.println("So khong hop le !!!");
            }
        }
    }
}
