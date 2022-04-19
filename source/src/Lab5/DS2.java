/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class DS2 {
    private ArrayList<String> ds = new ArrayList<>();

    public void nhap() {
        ds.clear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập danh sách họ tên:");
        while (true) {
            System.out.print("Nhập họ tên: ");
            String ten = scanner.nextLine();
            if (ten.isEmpty()) {
                System.out.println("Nhập dữ liệu thành công!");
                break;
            }
            ds.add(ten);
        }
    }

    public void xuat() {
        System.out.println("-------------------------------");
        for (String item : ds) {
            System.out.println(item);
        }
    }

    public void xuatNgauNhien() {
        Collections.shuffle(ds);
        xuat();
    }

    public void sapXep() {
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();

    }

    public void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten muon xoa: ");
        String hoTen = scanner.nextLine();

        for (String item : ds) {
            if (item.equalsIgnoreCase(hoTen)) {
                ds.remove(item);
                System.out.println("Xoa ho ten thanh cong!");
                break;
            }

        }
    }
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\nMenu chương trình");
            System.out.println("1. Nập danh sách họ tên");
            System.out.println("2. Hiển thị danh sách họ tên");
            System.out.println("3. Sắp xếp ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Xóa họ tên");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    xuatNgauNhien();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoa();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);
    }
}
