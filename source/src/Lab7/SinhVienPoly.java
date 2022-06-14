/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *Lab 7 Bài 2
 * @author Nguyễn Văn Hải Long
 */
public abstract class SinhVienPoly {
    private String hoTen;
    private String Nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String Nganh) {
        this.hoTen = hoTen;
        this.Nganh = Nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }
    
    
    public abstract Double getDiem();
    public String getHocLuc(){
        String hocLuc;
        if (getDiem()<5) {
            hocLuc = "Yếu";
        }else if (getDiem()<=6.9) {
            hocLuc = "Trung bình";
        }else if (getDiem()<8.4) {
            hocLuc = "Khá";
        }else
        {
            hocLuc = "Giỏi";
        }
        return  hocLuc;
    }
    public void xuat(){
        System.out.println("Họ tên: "+getHoTen());
        System.out.println("Ngành học: "+getNganh());
        System.out.println("Điểm: "+getDiem());
        System.out.println("Học lực: "+getHocLuc());
    }
}
