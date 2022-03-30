/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab2Bai1 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài của hình chữ nhật:");
        int dai = scanner.nextInt();
        System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
        int rong = scanner.nextInt();
        int cv = 2*(dai+rong);
        int dt = (dai*rong);
        int min= Math.min(dai, rong);
        System.out.println("Chu vi hình chữ nhật là:"+cv);
        System.out.println("Diện tích hình chữ nhật là:"+dt);
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật là:"+min);
    }
}
