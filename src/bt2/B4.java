package bt2;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        System.out.println(" Linear Equation Resolver");
        System.out.println("Cho một phương trình là 'a * x + b = c', vui lòng nhập các hằng số ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("nhập c: ");
        double c = scanner.nextDouble();

        if(a != 0){
            double aweb = (c-b)/a;
            System.out.printf("truyền phương trình với x = %.2f\n", aweb);
        }else {
            if (b == c){
                System.out.println("giải pháp là tất cả !x");
            }else {
                System.out.println("vô nghiệm");
            }
        }
    }
}
