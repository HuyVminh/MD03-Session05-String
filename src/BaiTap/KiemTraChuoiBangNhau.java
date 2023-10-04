package BaiTap;

import java.util.Scanner;

public class KiemTraChuoiBangNhau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi 1: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String str2 = scanner.nextLine();
        if(str1.equals(str2))
            System.out.println("Chuỗi 1 và chuỗi 2 giống nhau !");
        else
            System.out.println("Chuỗi 1 và chuỗi 2 khác nhau !");
    }
}
