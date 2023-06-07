import java.util.Scanner;

public class B14 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double F;
       double C;
       int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. độ F đổi sang độ C :");
            System.out.println("2. độ C đổi sang độ F: ");
            System.out.println("0. exit");
            System.out.println("nhập lựa chọn của bạn");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("nhập số cần đổi: ");
                    F = input.nextDouble();
                    System.out.println("nhiệt độ đổi ra là : " + C1(F));
                    break;
                case 2:
                    System.out.println("nhập số cần đổi: ");
                    C = input.nextDouble();
                    System.out.println("nhiệt độ đổi ra là: " + F1(C) );
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public static double F1 (double F){
        double C = (5.0/9) * (F - 32);
        return C;
    }
    public static double C1 (double C){
        double F =(9.0/5)* C + 32;
        return F;
    }
}
