/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab2Bai4 {
//Giải PT bậc 1
    public static void giaiPTB1() {
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -b / a;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");// Làm tròn đến chữ số thập phân thứ 2
        }
    }
//Giải PT bậc 2
    public static void giaiPTB2() {
        double a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập a (a # 0): ");
            a = scanner.nextDouble();
        } while (a == 0);
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (delta == 0) {
            x1 = -b/(2*a);
            System.out.println("Phương trinh có nghiệm kép là x1 = x2 = "+x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
    }
//Tính tiền điện 
    public static void tinhTienDien() {
    float soDien;
    float tienDien;
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số điện:");
    soDien= scanner.nextFloat();
    
    if(soDien<=50)
        tienDien = soDien*1000;
    else
        tienDien = 50*1000+(soDien-50)*1200;
    System.out.printf("Tiền điện là: "+tienDien+" VNĐ");
    }
    
    public static void main(String[] args){
    System.out.println("1. Giải phương trình bậc 1");
    System.out.println("2. Giải phương trình bậc 2");
    System.out.println("3. Tính tiền điện");
    System.out.println("Chọn chức năng:");
    Scanner s = new Scanner(System.in); 
    int chon = s.nextInt();
    switch(chon){
        case 1:
            System.out.println("Giải phương trình bậc 1");
            giaiPTB1();
            break;
        case 2:
            System.out.println("Giải phương trình bậc 2");
            giaiPTB2();
            break;
        case 3:
            System.out.println("Tính tiền điện");
            tinhTienDien();
            break;
    }  
    }   
}
