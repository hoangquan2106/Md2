
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ngày tháng năm: ");
        String Dataff = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date data = null;
       try {
           data = dateFormat.parse(Dataff);
       }catch (Exception e){
           System.out.println("định dạng ngày tháng không hợp lệ ");
           return;
       }
        System.out.println("ngày tháng năm đã nhập là: " + dateFormat.format(Dataff));
    }
}