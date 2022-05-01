/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class SanPham {
    private String tenSP;
    private double gia;
    
    public SanPham(){
    this.tenSP = null;
    this.gia = 0;
    }
    
   
    public SanPham(String tenSP,double gia){
    
    }
    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
