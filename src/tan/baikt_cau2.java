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
public class baikt_cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> sides = new ArrayList<>();

        // Nhập chiều dài 3 cạnh
        for (int i = 0; i < 3; i++) {
            System.out.print("Nhap chieu dai canh " + (i + 1) + ": ");
            double side = scanner.nextDouble();
            sides.add(side);
        }

        // Tính nửa chu vi
        double s = (sides.get(0) + sides.get(1) + sides.get(2)) / 2;

        // Kiểm tra xem 3 cạnh có tạo thành tam giác không
        if (sides.get(0) + sides.get(1) > sides.get(2) && 
            sides.get(0) + sides.get(2) > sides.get(1) && 
            sides.get(1) + sides.get(2) > sides.get(0)) {
            
            // Tính diện tích bằng công thức Heron
            double area = Math.sqrt(s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2)));
            
            // Tính chu vi
            double perimeter = sides.get(0) + sides.get(1) + sides.get(2);

            // Xuất kết quả
            System.out.println("Chu vi cua tam giac: " + perimeter);
            System.out.println("Dien tich cua tam giac: " + area);
        } else {
            System.out.println("Ba cạnh đa nhap khong tao thanh mot tam giac hop le.");
        }

        scanner.close();
    }
    
}
