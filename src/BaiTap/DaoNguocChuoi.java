package BaiTap;

import java.util.Scanner;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần đảo ngược :");
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Chuỗi đảo ngược là : " + sb);
    }
}
