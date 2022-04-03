/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Hải Long
 */

public class Lab3Bai5 {

	public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Nhập đoạn text cần mã hóa:");
        char ch[] = text.toCharArray();
        //Tác các chữ từ char ra để mã hóa
        for (int i = 0; i < ch.length; i++)
        {
            //Mã hóa Caesar(Shiza)
            int ascii = ch[i];
            ascii = ascii+2;
            ch[i]=(char)ascii;
        }
        String hash = String.valueOf(ch);
        JOptionPane.showMessageDialog(null,"Text:\n"+text+"\nSau mã hóa:\n"+hash);
        }
}