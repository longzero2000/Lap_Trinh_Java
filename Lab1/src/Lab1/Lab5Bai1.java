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
public class Lab5Bai1 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị góc (độ):");
        int goc = scanner.nextInt();
        double radian = Math.toRadians(goc);
        System.out.println("Giá trị góc theo Radian là: "+radian);
    }
}
