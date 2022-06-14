package Lab7;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Lab 7 Bài 3
 * @author Nguyễn Văn Hải Long
 */
public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing;
    private double diemSales;
    
    public SinhVienBiz(String hoTen,double diemMarketing, double diemSales) {
        super(hoTen, "SVBiz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public Double getDiem() {
        return  ((2*this.getDiemMarketing())+this.getDiemSales())/3;
    }

    @Override
    public String toString() {
        return "SinhVienBiz{" + "diemMarketing=" + getDiemMarketing() + ", diemSales=" + getDiemSales() + ", Hoten ="+getHoTen()+ " , Ngành ="+getNganh()+'}';
    }

    public double getDiemMarketing() {
        return diemMarketing;
    }
    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }
    public double getDiemSales() {
        return diemSales;
    }
    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }   
}