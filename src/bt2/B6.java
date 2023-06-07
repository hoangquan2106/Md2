package bt2;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm: ");
        int year = scanner.nextInt();
        if (year %4 == 0 && year %100 !=0){
                System.out.println(year + " là năm nhuận");
            }
            if (year %100 == 0 && year %400 !=0){
                System.out.println(year + " không phải năm nhuận");
        }
            if (year %100 == 0 || year %400 ==0){
                System.out.println(year + " là năm nhuận");
            }else {
                System.out.println(" không phải năm nhuận");
            }

    }
}
