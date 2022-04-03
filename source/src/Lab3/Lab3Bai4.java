/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab3Bai4 {
    static String HoTen[] = new String[50];
    static double Diem[] = new double[50];
    static int index = 0;
    static int n;
    //Nhập
    static void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên:");
        n = sc.nextInt();
        for(index=0;index<n;index++){
            int check =0;
            sc = new Scanner(System.in);
            System.out.printf("Nhập sinh viên thứ %d:\n",index+1);
            System.out.print("Nhập họ và tên:");
            HoTen[index] = sc.nextLine();
            do{
            System.out.print("Nhập điểm:");
            Diem[index] = sc.nextDouble();
            if (Diem[index]<=10 && Diem[index]>=0)
                check=1;
            }
            while(check == 0);
        }
    }
    //Xuất
    static void Xuat(){
        System.out.println("Danh sách sinh viên");
        for(int i=0; i<index;i++){
            System.out.println("\n"+(i+1)+".Tên:" + HoTen[i]+"\nĐiểm "+Diem[i]);
        } 
    }
    
    public static void main(String[] args) {
        Nhap();
        Xuat();
    }
}