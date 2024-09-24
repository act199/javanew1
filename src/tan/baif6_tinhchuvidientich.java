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
public class baif6_tinhchuvidientich {
    public static void main(String[] args) {
        System.out.println("TinhChuViDienTich");
        Scanner nhap = new Scanner(System.in);
        
        double a,b,chuVi,dientich ;
        
        System.out.print(" Nhap Chieu Dai");
        a = nhap.nextDouble();
        
        System.out.print(" Nhap Chieu Rong");
        b = nhap.nextDouble();
        
        chuVi = (a + b)* 2 ;
        System.out.println("Chu Vi = " + chuVi);
        
        dientich = a*b;
        System.out.println("Dien tich = " + dientich);
    }
}
