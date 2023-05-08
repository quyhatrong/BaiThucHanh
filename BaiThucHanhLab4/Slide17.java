package BaiThucHanhLab4;

import java.util.ArrayList;

public class Slide17 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();

        arrayListInteger.add(2);
        arrayListInteger.add(43);
        arrayListInteger.add(21);
        arrayListInteger.add(999);

        System.out.println(" Cac phan tu co trong arrListInteger la:");
        for (int number : arrayListInteger) {
            System.out.print(number + "\t");
        }
    }

}
