import java.util.Scanner;

public class B11 {
    public static void main(String[] args) {
        double tiengui = 1.0;
        double laisuat = 1.0;
        int thang = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền gửi: ");
        tiengui = scanner.nextDouble();
        System.out.println("nhập lãi suất: ");
        laisuat = scanner.nextDouble();
        System.out.println("nhập số tháng muốn gửi: ");
        thang  = scanner.nextInt();
        double tonglai = 0;
        for (int i = 0; i < thang; i++) {
            tonglai += tiengui * (laisuat/100)/12 *thang;
        }
        System.out.println("tổng tiền lãi là: " + tonglai);
            }

}