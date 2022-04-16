/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab4;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab4Bai5 {
    public static void main(String[] args)
    {
        SanPham sp1 = new SanPham();
        sp1.nhap();
        JFrame f;
        JTable j;
        f = new JFrame();
        f.setTitle("Danh sách sản phẩm");
        String[] columnNames = { "Tên sản phẩm", "Giá tiền", "Giá giảm","Thuế"};
        String data[][] = {
            { sp1.getTenSP(),Double.toString(sp1.getDonGia()),Double.toString(sp1.getGiamGia()),Double.toString(sp1.getDonGia()*0.1) }
        };
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
}
