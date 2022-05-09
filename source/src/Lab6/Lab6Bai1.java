/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab6Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String HoTen = scanner.nextLine();
        HoTen.trim();
        String Ho = HoTen.substring(0, HoTen.indexOf(" ")).toUpperCase();
        String TenDem = HoTen.substring(HoTen.indexOf(" "), HoTen.lastIndexOf(" "));
        String Ten = HoTen.substring(HoTen.lastIndexOf(" ")).toUpperCase();
        System.out.printf("%s %s %s",Ho, TenDem, Ten);
    }
    
}
