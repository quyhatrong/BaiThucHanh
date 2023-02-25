import java.util.Scanner;

public class testUpCode{
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen a: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println("So input la "+a);
        }
    }
}

    
    

