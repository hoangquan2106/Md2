package bt2;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        System.out.println("nhập tháng: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String IsMonth;
        switch (month){
            case 2:
                IsMonth = ("28 hoặc 29");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                IsMonth = "31";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                IsMonth= "30";
                break;
            default:
                IsMonth = "";
        }
        if (!IsMonth.equals("")) System.out.printf("tháng %d có %s ngày", month, IsMonth);
        else System.out.println("không có tháng cần nhập");
    }
}
