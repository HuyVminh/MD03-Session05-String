package ThucHanh;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập email cần so sánh: ");
        while (true) {
            String chuoi = scanner.nextLine();
            String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
            System.out.println("Kiểm tra email : " + Pattern.matches(regex, chuoi));
            if (Pattern.matches(regex, chuoi)) {
                System.out.println("Email hợp lệ");
                break;
            } else {
                System.err.println("Email không đúng định dạng, mời nhập lại : ");
            }
        }
    }
}
