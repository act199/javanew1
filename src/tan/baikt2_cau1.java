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
public class baikt2_cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng số Fibonacci muốn hiển thị
        System.out.print("Nhap so N (so luong so Fibonacci muon hien thi): ");
        int N = scanner.nextInt();
        
        // Tạo ArrayList để lưu trữ dãy số Fibonacci
        ArrayList<Integer> fibonacciList = new ArrayList<>();

        // Tính toán dãy số Fibonacci
        if (N > 0) {
            fibonacciList.add(0); // Fibonacci thứ 0
        }
        if (N > 1) {
            fibonacciList.add(1); // Fibonacci thứ 1
        }
        for (int i = 2; i < N; i++) {
            int nextFibonacci = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFibonacci);
        }

        // Xuất ra màn hình dãy số Fibonacci
        System.out.println("Day so Fibonacci:");
        for (int number : fibonacciList) {
            System.out.print(number + " ");
        }
        
        // Tính tổng dãy số Fibonacci
        int sum = 0;
        for (int number : fibonacciList) {
            sum += number;
        }
        
        // Xuất tổng dãy số
        System.out.println("\nTong cua day so: " + sum);
        
        scanner.close();
    }
    
}
