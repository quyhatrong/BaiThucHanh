package BaiThucHanhLab4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;

    public SinhVien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
}

public class Slide114 {
    public static void main(String[] args) {
        Map<String, SinhVien> sinhVienMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.nextLine();
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lớp: ");
            String lop = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSV, hoTen, lop);
            sinhVienMap.put(maSV, sinhVien);
        }

        System.out.print("\nNhập tên Lớp: ");
        String searchLop = scanner.nextLine();
        System.out.println("\nDanh sách sinh viên thuộc Lớp " + searchLop + ":");
        for (SinhVien sinhVien : sinhVienMap.values()) {
            if (sinhVien.getLop().equals(searchLop)) {
                System.out.println("Mã sinh viên: " + sinhVien.getMaSV() +
                        ", Họ và tên: " + sinhVien.getHoTen() +
                        ", Lớp: " + sinhVien.getLop());
            }
        }

        System.out.print("\nNhập Mã sinh viên: ");
        String searchMaSV = scanner.nextLine();
        if (sinhVienMap.containsKey(searchMaSV)) {
            SinhVien sinhVien = sinhVienMap.get(searchMaSV);
            System.out.println("\nThông tin sinh viên với Mã sinh viên " + searchMaSV + ":");
            System.out.println("Họ và tên: " + sinhVien.getHoTen());
            System.out.println("Lớp: " + sinhVien.getLop());
        } else {
            System.out.println("\nKhông tìm thấy sinh viên với Mã sinh viên " + searchMaSV);
        }
    }
}
