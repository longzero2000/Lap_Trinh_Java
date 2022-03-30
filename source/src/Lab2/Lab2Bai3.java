/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab2Bai3 {
    public static void main(String[] args){
    float soDien;
    float tienDien;
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số điện:");
    soDien= scanner.nextFloat();
    
    if(soDien<=50)
        tienDien = soDien*1000;
    else
        tienDien = 50*1000+(soDien-50)*1200;
    System.out.printf("Tiền điện là: "+tienDien+" VNĐ");
    }
}
