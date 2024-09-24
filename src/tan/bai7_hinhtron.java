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
public class bai7_hinhtron {
    public static void main(String[] args) {
        System.out.println("Tinh Dien Tich Chu Vi Hinh Tron");
         Scanner nhap = new Scanner(System.in);
         
        double r, chuVi, dienTich;
        System.out.println("Nhap dien tich");
        r = nhap.nextDouble();
        
        chuVi = Math.PI * 2*r;
        dienTich = Math.PI *r*r;
        System.out.println("Chu Vi = " + chuVi);
        System.out.println("Dien Tich = " + dienTich);
    }
}
