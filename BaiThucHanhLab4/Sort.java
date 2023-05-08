package BaiThucHanhLab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(10);

        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);
        linkedList.add(1);
        linkedList.add(10);

        Collections.sort(arrayList);

        System.out.println("ArrayList (Tăng dần):");
        for (int element : arrayList) {
            System.out.println(element);
        }

        Collections.sort(linkedList);

        System.out.println("LinkedList (Tăng dần):");
        for (int element : linkedList) {
            System.out.println(element);
        }

        Collections.sort(arrayList, (o1, o2) -> o2 - o1);

        System.out.println("ArrayList (Giảm dần):");
        for (int element : arrayList) {
            System.out.println(element);
        }

        Collections.sort(linkedList, (o1, o2) -> o2 - o1);

        System.out.println("LinkedList (Giảm dần):");
        for (int element : linkedList) {
            System.out.println(element);
        }
    }
}
