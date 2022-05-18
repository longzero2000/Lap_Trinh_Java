/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class SinhVien {
    private String hoTen;
    private String email;
    private String phone;
    private String cmnd;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập họ và tên: ");
            hoTen = scanner.nextLine();
            if (hoTen == null | hoTen.equals("")) {
                System.out.println("Họ tên người không hợp lệ!");
            } else {
                break;
            }
        } while (true);

        Check check = new Check();
        do {
            System.out.print("Nhập Email: ");
            email = scanner.nextLine();
            if (check.isEmail(email)) {
                break;
            }
            System.out.println("Email không hợp lệ!");
        } while (true);

        do {
            System.out.print("Nhập số điện thoại: ");
            phone = scanner.nextLine();
            if (check.isPhone(phone)) {
                break;
            }
            System.out.println("Số điện thoại không hợp lệ!");
        } while (true);

        do {
            System.out.print("Nhập số CMND: ");
            cmnd = scanner.nextLine();

            if (check.isCMND(cmnd)) {
                break;
            }
            System.out.println("CMND không hợp lệ!");
        } while (true);
    }

    public void xuat() {
        System.out.printf("Họ tên sinh viên: %s - Email: %s - SDT: %s - CMND: %s \n", hoTen, email, phone, cmnd);
    }


}
