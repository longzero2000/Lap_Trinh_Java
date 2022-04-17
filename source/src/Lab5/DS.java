/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class DS {
    private final ArrayList<Double> list = new ArrayList<>();

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhận danh sách số thực:");
        while (true) {
            System.out.print("Nhập số: ");
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.print("Nhập thêm (Y/N): ");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }
    public void hienThi() {
        System.out.println("Danh sách số đã nhập:");
        for (Double item : list) {
            System.out.print(item+"\t");
        }
    }

    public void tinhTong() {
        double tong = 0;
        for (Double item : list) {
            tong += item;
        }
        System.out.println();
        System.out.println("Tổng các số trong danh sách: " + tong);
    }
}
