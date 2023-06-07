package bt2;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài: ");
        int Dai = scanner.nextInt();
        System.out.println("nhập chiều rộng: ");
        int Rong = scanner.nextInt();

        int S = Dai * Rong;

        System.out.println("diện tích hình chữ nhật là: " + S);
    }
}
