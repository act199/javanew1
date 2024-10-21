/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class baikt2_cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập bán kính hình cầu
        System.out.print("Nhap ban kinh hinh cau: ");
        double radius = scanner.nextDouble();
        
        // Tính diện tích và thể tích hình cầu
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2); // Diện tích
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Thể tích

        // Xuất kết quả
        System.out.printf("Dien tich hinh cau: %.2f\n", surfaceArea);
        System.out.printf("The tich hinh cau: %.2f\n", volume);
        
        scanner.close();
    }
    
}
