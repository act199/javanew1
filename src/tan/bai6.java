/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tan;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class bai6 {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH TUOI");
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Nhập năm sinh: ");
        int namSinh = scanner.nextInt();
        System.out.print("Nhập tháng sinh: ");
        int thangSinh = scanner.nextInt();
        System.out.print("Nhập ngày sinh: ");
        int ngaySinh = scanner.nextInt();

        System.out.print("Nhập năm hiện tại: ");
        int namHienTai = scanner.nextInt();
        System.out.print("Nhập tháng hiện tại: ");
        int thangHienTai = scanner.nextInt();
        System.out.print("Nhập ngày hiện tại: ");
        int ngayHienTai = scanner.nextInt();

        int tuoi = namHienTai - namSinh;

        if (thangSinh > thangHienTai || (thangSinh == thangHienTai && ngaySinh > ngayHienTai)) {
            tuoi--;
        }

        System.out.println("Tuổi của bạn là: " + tuoi);
}
}
