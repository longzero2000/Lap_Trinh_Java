/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Lab7;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Vuong extends ChuNhat{
    public Vuong(double canh) {
        super(canh, canh);
        double rong = canh;
    }

    public void xuat() {
        System.out.printf("Diện tích HV la: %.2f | Chu vi là: %.2f", getDienTich(), getChuVi());
    }
}
