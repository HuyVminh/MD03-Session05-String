package ThucHanh;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validateAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Account cần so sánh");
        while (true) {
            String chuoi = scanner.nextLine();
            String regexAccount = "^[_a-z0-9]{6,}$";
            boolean check = Pattern.matches(regexAccount, chuoi);
            System.out.println("Kiểm tra account :" + check);
            if (check) {
                System.out.println("account hợp lệ");
                break;
            } else {
                System.err.println("Account không đúng định dạng, mời nhập lại");
            }
        }
    }
}
