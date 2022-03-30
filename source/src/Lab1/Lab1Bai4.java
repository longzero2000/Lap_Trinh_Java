/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập a (a # 0): ");
            a = scanner.nextDouble();
        } while (a == 0);
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: "+a+"x^2 + "+b+"x + "+c+" = 0");
        double delta = Math.pow(b, 2) - 4 * a * c;
        double candelta = Math.sqrt(delta);
        System.out.println("Delta = : "+delta);
        if (delta<0)
        System.out.println("Không có giá trị căn Delta do Delta âm!");
        else
        System.out.println("Căn Delta = : "+candelta);
    }       
}
        
        
