/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;
/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab1Bai3 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh của hình lập phương:");
        int canh = scanner.nextInt();
        int tt= (int) Math.pow(canh,3);
        System.out.println("Thể tích khối lập phương là: "+tt);
    }
}
