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
public class bai9_giaithua {
    public static void main(String[] args) {
       System.out.println("Chuong trinh tinh giai thua");
       Scanner sc = new Scanner(System.in); 
       System.out.print("Nhap so: ");
       // String hoten = sc.text();
       int so = sc.nextInt();
       int giaithua = 1;
       
       for (int i = 1; i<= so; i++) {
        giaithua = giaithua * i;
    }
       
        System.out.printf("giai thua cua %d!= %d" ,so,giaithua);
        System.out.println();
}
}