package Lab4;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;
    
    SanPham() {
    }
    //Bài 1
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm:");
        tenSP = sc.nextLine();
        System.out.println("Nhập giá tiền sản phẩm:");
        donGia = sc.nextDouble();
        System.out.println("Nhập giá giảm:");
        giamGia = sc.nextDouble();
    }
    //Bài 3
    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    //Bài 4
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

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    private double getThueNhapKhau() {
        return donGia * 0.1;
    }
}