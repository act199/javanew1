/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tan;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author SPC
 */
public class bai_kiemtra {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("NHap so (nhap 'stop' de dung):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so hop le hoac 'stop' de dung.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("Khong co so nao duoc nhap.");
            return;
        }

        // Tính toán số lớn nhất, số nhỏ nhất, tổng và trung bình
        double max = numbers.get(0);
        double min = numbers.get(0);
        double sum = 0;

        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            sum += number;
        }

        double average = sum / numbers.size();

        // Xuất thông tin
        System.out.println("So lon nhat: " + max);
        System.out.println("So nho nhat: " + min);
        System.out.println("Tong cua day so: " + sum);
        System.out.println("Trung binh cua day so: " + average);
    }
}
    

