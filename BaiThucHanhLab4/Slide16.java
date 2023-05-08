package BaiThucHanhLab4;

import java.util.ArrayList;

public class Slide16 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("");

        System.out.println("Các phần tử trong arrListString là:");

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayListString.get(i) + "\t");
        }
    }
}
