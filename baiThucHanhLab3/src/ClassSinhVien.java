import java.util.Scanner;

public class ClassSinhVien {
    String name, gender;
    int age, year, id;

    public void nhapThongTinSV() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap ho ten sinh vien: ");
            name = sc.nextLine();
            System.out.print("Nhap nam sinh: ");
            year = sc.nextInt();
            System.out.print("Nhap MSSV: ");
            id = sc.nextInt();
            System.out.print("Nhap gioi tinh (1 la Nam, 2 la Nu): ");
            int opt = sc.nextInt();
            if (opt == 1) {
                gender = "Nam";
            } else if (opt == 2) {
                gender = "Nu";
            } else {
                gender = "Khac";
            }
        }
    }

    public void tinhTuoi() {
        age = 2023 - year;
    }

    public void xuatThongTinSV() {
        System.out.printf("\nThong tin sinh vien:\nHo ten: %s\nNam sinh: %d\nTuoi: %d\nMSSV: %d\nGioi tinh: %s", name, year, age, id, gender);
    }
}