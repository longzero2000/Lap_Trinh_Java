/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSP = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập hãng: ");
        hang = new Scanner(System.in).nextLine();
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Giá: " + donGia + "VNĐ");
        System.out.println("Hãng: " + hang);
    }
}
