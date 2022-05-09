/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab6;

import java.util.ArrayList;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab6Bai2 {

    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            SanPham SP = new SanPham();
            SP.nhap();
            list.add(SP);
        }

        for (SanPham SP: list) {
            if (SP.getHang().equalsIgnoreCase("Nokia")) {
                SP.xuat();
                System.out.println();
            }

        }
    }
    
}
