/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class ChuNhat {
    protected double dai;
    protected double rong;
    

    public ChuNhat(double dai, double rong ) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.printf("Diện tích HCN là: %.2f | Chu vi là: %.2f", getDienTich(), getChuVi());
    }
}
