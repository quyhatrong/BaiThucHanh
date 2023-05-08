package BaiThucHanhLab4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hasst = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hasst.add("Wilson");
        hasst.add("Nike");
        hasst.add("Volvo");
        hasst.add("Lenovo");
        hasst.add("Kia");
        hasst.add("Lenovo");

        System.out.println("cac phan tu co trong hasst:");
        System.out.println(hasst);
        System.out.println("nhap phan tu can xoa: ");
        name = sc.nextLine();

        if (hasst.contains(name)) {
            hasst.remove(name);
            System.out.println("xoa thanh cong!");
            System.out.println("cac phan tu con lai trong hasst: ");
            System.out.println(hasst);
        } else {
            System.out.println("xoa thanh cong!");
        }
    }
}
