/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab4;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab4Bai2 {
    public static void main(String[] args) {
       SanPham sp1 = new SanPham();
       SanPham sp2 = new SanPham();
       System.out.println("Sản phẩm thứ 1:");
       sp1.nhap();
       System.out.println("Sản phẩm thứ 2:");
       sp2.nhap();
       //In ra màn hình
       System.out.println("Thông tin sản phẩm thứ 1:");
       sp1.xuat();
       System.out.println("Thông tin sản phẩm thứ 2:");
       sp2.xuat();
    }
}
