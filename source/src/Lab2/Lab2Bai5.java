/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab2Bai5 {
    public static void main(String args[]) {
           String cauhoi = "Bộ định tuyến có tên tiếng Anh là?";
           String thongbao = "Bạn trả lời sai rồi!";
           String clientGesture = JOptionPane.showInputDialog(cauhoi);
           if (clientGesture.equalsIgnoreCase("Router")) {
                thongbao = "Bạn đã trả lời đúng";
                //Đáp án không phân biệt chữ hoa và chữ thường
           }
           JOptionPane.showMessageDialog(null, thongbao);
     }
}
