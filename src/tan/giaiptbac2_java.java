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
public class giaiptbac2_java {
    public static void main(String[] args) {
        System.out.println("Giaiphuongtrinhbac2");
        float a, b, c;
        double x1, x2, delta;
        Scanner sc = new Scanner(System.in);
    
        System.out.print(" Nhap a: ");
        a = sc.nextFloat();
       
        System.out.print(" Nhap b: ");
        b = sc.nextFloat();
        
        System.out.print(" Nhap c: ");
        c = sc.nextFloat();
      
        
        if (a == 0) { // Biện luận giải phương trình bậc 1: bx + c = 0
        if (b == 0) {
            if (c != 0) {
                System.out.println( "Phuong trinh vo nghiem");
            }
            else {
                System.out.println( "Phuong trinh co vo so nghiem");
            }
        } else {
            x1 = x2 = -c / b;
            System.out.println("Phuong trinh co nghiem x = " + x1);
        }
    } else {
        delta = b * b - 4 * a * c;
        if (delta < 0) {
           System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
        }
            else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
           System.out.println( "Phuong trinh co 2 nghiem phan biet");
            System.out.println( "\nx1 = " + x1);
            System.out.println("\nx2 = " + x2);
        }
      }
   }
}


