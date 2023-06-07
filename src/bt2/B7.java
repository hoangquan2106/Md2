package bt2;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều cao: ");
        double height, weight, bmi;
         height = scanner.nextDouble();
        System.out.println("nhập cân nặng: ");
         weight = scanner.nextDouble();

         bmi = weight / Math.pow(height,2);

        System.out.printf("%-20s%s", "bmi","Interpretation\n");

        if (bmi < 18.5)
            System.out.printf("%-20.2f%s", bmi ,"thiếu cân");
        else if (bmi < 25 )
            System.out.printf("%-20.2f%s", bmi, "bình thường");
        else if (bmi <30)
            System.out.printf("%-20.2f%s", bmi, "thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "béo phì");
        }
    }

