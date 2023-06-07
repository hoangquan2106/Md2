import java.util.Scanner;

public class B12 {
    public static void main(String[] args) {
        int choie = -1;
        Scanner scanner = new Scanner(System.in);
        while (choie != 0){
            System.out.println("Menu");
            System.out.println("1. hình vuông");
            System.out.println("2. hình chữ nhật");
            System.out.println("3. hình tam giác");
            System.out.println("0. exit");
            System.out.println("nhập lựa chọn của bạn");
            choie = scanner.nextInt();
            System.out.println("nhập độ rộng: ");
            int rong = scanner.nextInt();
            System.out.println("nhập độ dài: ");
            int dai = scanner.nextInt();
            switch (choie){
                case 1:
                    for (int i = 1; i <= rong ; i++) {
                        for (int j = 1; j <= dai; j++) {
                            System.out.print("  *");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= rong ; i++) {
                        for (int j = 0; j <= dai; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <=rong ; i++) {
                        for (int j = 1; j <i ; j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
