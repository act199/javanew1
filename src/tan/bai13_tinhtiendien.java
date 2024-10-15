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
public class bai13_tinhtiendien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mảng giá điện cho từng bậc
        float[] giaDien = {1893, 1956, 2271, 2860, 3197, 3302};
        int[] bacDien = {50, 100, 200, 300, 400}; // Số lượng kWh cho từng bậc
        
        System.out.print("Nhap so dien tieu thu (kWh): ");
        float soDien = scanner.nextFloat();
        
        float tienDien = 0.0f;

        // Tính tiền điện theo từng bậc
        if (soDien <= bacDien[0]) {
            tienDien = soDien * giaDien[0]; // Giá cho 50 kWh đầu tiên
        } else {
            tienDien += bacDien[0] * giaDien[0]; // Tính tiền cho bậc đầu tiên

            if (soDien <= (bacDien[0] + bacDien[1])) {
                tienDien += (soDien - bacDien[0]) * giaDien[1]; // Giá từ 51 đến 100 kWh
            } else {
                tienDien += bacDien[1] * giaDien[1]; // Tính tiền cho bậc thứ hai

                if (soDien <= (bacDien[0] + bacDien[1] + bacDien[2])) {
                    tienDien += (soDien - (bacDien[0] + bacDien[1])) * giaDien[2]; // Giá từ 101 đến 200 kWh
                } else {
                    tienDien += bacDien[2] * giaDien[2]; // Tính tiền cho bậc thứ ba
                    tienDien += (soDien - (bacDien[0] + bacDien[1] + bacDien[2])) * giaDien[3]; // Giá trên 200 kWh
                }
            }
        }

        System.out.printf("Tien dien phai tra: %.2f dong\n", tienDien);
        
        scanner.close();
    }
}
