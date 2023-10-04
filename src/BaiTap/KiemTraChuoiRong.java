package BaiTap;

import java.util.Scanner;

public class KiemTraChuoiRong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra :");
        String str2 = scanner.nextLine();
        boolean check= str2.isEmpty();
        if(check){
            System.out.println("Chuỗi rỗng");
        }else {
            System.out.println("Không phải chuỗi rỗng");
        }
    }
}
