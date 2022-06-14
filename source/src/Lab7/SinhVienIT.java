/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *Lab 7 Bài 3
 * @author Nguyễn Văn Hải Long
 */
public class SinhVienIT extends SinhVienPoly{

    private double diemJava;
    private double diemHTML;
    private double diemCSS;


    public SinhVienIT( String hoTen,double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, "SVIT");
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }
    
    public SinhVienIT() {
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }

    @Override
    public Double getDiem() {
        return ((2*this.getDiemJava())+this.getDiemHTML()+this.getDiemCSS())/4;
    }

    @Override
    public String toString() {
        return "sinhVienIT{" + "diemJava=" + getDiemJava() + ", diemHTML=" + getDiemHTML() + ", diemCSS=" + getDiemCSS() + ",hoTen = "+getHoTen()+'}';
    }

 
}