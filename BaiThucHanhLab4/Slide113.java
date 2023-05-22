package BaiThucHanhLab4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Slide113 {
    public static void main(String[] args) {
        HashSet<String> fruitsSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên các loại trái cây (kết thúc bằng enter): ");
        String fruit;
        while (!(fruit = scanner.nextLine()).isEmpty()) {
            fruitsSet.add(fruit);
        }

        System.out.println("Số phần tử trong HashSet: " + fruitsSet.size());

        System.out.print("Nhập tên loại trái cây cần kiểm tra và xóa: ");
        String searchFruit = scanner.nextLine();
        if (fruitsSet.contains(searchFruit)) {
            fruitsSet.remove(searchFruit);
            System.out.println("Tìm thấy và đã xóa loại trái cây '" + searchFruit + "'");
        } else {
            System.out.println("Không tìm thấy loại trái cây '" + searchFruit + "'");
        }

        System.out.println("Các phần tử còn lại trong HashSet:");
        Iterator<String> iterator = fruitsSet.iterator();
        while (iterator.hasNext()) {
            String fruitName = iterator.next();
            System.out.println(fruitName);
        }

        List<String> newList = new ArrayList<>();
        newList.add("Apple");
        newList.add("Banana");
        newList.add("Orange");
        fruitsSet.addAll(newList);

        System.out.println("\nHashSet sau khi thêm các phần tử từ List:");
        iterator = fruitsSet.iterator();
        while (iterator.hasNext()) {
            String fruitName = iterator.next();
            System.out.println(fruitName);
        }

        fruitsSet.removeAll(newList);

        System.out.println("\nHashSet sau khi xóa các phần tử của List:");
        for (String fruitName : fruitsSet) {
            System.out.println(fruitName);
        }
    }
}

