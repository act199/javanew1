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
public class bai5 {
    public static void main(String[] args) {
        System.out.println("PHEP TINH CO BAN");
        int a,b;
        Scanner     nhap = new Scanner (System.in);
        
        System.out.print("Nhap so a");
        a = nhap.nextInt();
        
         System.out.print("Nhap so b");
        b = nhap.nextInt();
           
        System.out.println(a + " + "+ b + " = " + Tinhtong(a,b));
        System.out.println(a + " - "+ b + " = " + Tinhhieu(a,b));
        System.out.println(a + " * "+ b + " = " + Tinhtich(a,b));
        System.out.println(a + " / "+ b + " = " + Tinhthuong(a,b));
     }
     public static int Tinhtong(int a, int b){
         return a+b;
     }
     public static int Tinhhieu(int a, int b){
         return a-b;
}
     public static int Tinhtich(int a, int b){
         return a*b;
}    
     public static String Tinhthuong(int a, int b){
         if (b !=0){
             return Double.toString((double)a/b);
         }
         else
             return a + "Khong the chia cho 0";
     }
     public static double Tinhthuong1(int a, int b){
         if(b == 0)
             return 0;
         return (double) a/b;
    
}
}
