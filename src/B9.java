import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền cần chuyển đổi");
        double Usd = scanner.nextDouble();
        double Vnd = 23000;
        double Sum = Usd*Vnd;
        System.out.println("chuyển đổi ra là: " + Sum);
    }
}
