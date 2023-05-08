package BaiThucHanhLab4;

import java.util.ArrayList;

public class Slide20 {
    public static void main(String[] args) {
        // Khởi tạo ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Số phần tử trong ArrayList: " + arrayList.size());

        System.out.println("Các phần tử trong ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        String firstElement = arrayList.get(0);
        System.out.println("Phần tử đầu tiên trong ArrayList: " + firstElement);

        arrayList.remove(1);
        System.out.println("Sau khi xóa phần tử thứ 2, các phần tử còn lại trong ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        boolean containsOrange = arrayList.contains("Orange");
        System.out.println("ArrayList có chứa phần tử 'Orange': " + containsOrange);

        boolean isEmpty = arrayList.isEmpty();
        System.out.println("ArrayList có rỗng không: " + isEmpty);

        arrayList.clear();
        System.out.println("Sau khi xóa tất cả phần tử, ArrayList có rỗng không: " + arrayList.isEmpty());
    }
}
