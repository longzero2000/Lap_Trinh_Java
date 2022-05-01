/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class DanhSachSanPham {
    private final ArrayList<SanPham> list = new ArrayList<>();

    public void nhap() {
        int i = 1;
        System.out.println("Nhập danh sách sản phẩm (bỏ trống tên nếu muốn kết thúc nhập):");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Tên sản phẩm thứ %d: ", i);
            String ten = scanner.nextLine();
            if (ten == null || ten.equals("")) {
                System.out.println("Đã lưu thông tin sản phẩm!");
                break;
            }
            i++;
            System.out.print("Giá sản phẩm: ");
            double gia = scanner.nextDouble();
            list.add(new SanPham(ten, gia));
        }while (true);
    }

    public void xuat() {
        System.out.println("Danh sách sản phẩm:");
        System.out.println("Tên\t\t|Giá\t\t");
        for (SanPham sp : list) {
            System.out.printf("%s | %.2f \n", sp.getTenSP(), sp.getGia());
        }
    }

    public void sapXep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(list, comp);
        xuat();
    }

    public void timVaXoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String ten = sc.nextLine();

        SanPham sp = null;

        for (SanPham sp1 : list) {
            if (sp1.getTenSP().equals(ten)) {
                sp = sp1;
                break;
            }
        }
        if (sp != null) {
            list.remove(sp);
            System.out.println("Đã xóa sản phẩm!");
        }else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }

    public void tinhGiaTrungBinh() {
        double avg = 0, sum = 0;
        for (SanPham sp : list) {
            sum += sp.getGia();
        }
        avg = sum / list.size();
        System.out.println("Giá trung bình là: " + avg);
    }
    public void menu() {
        Scanner s = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\nMenu chương trình");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá");
            System.out.println("4. Tìm và xóa sản phẩm");
            System.out.println("5. Tính giá trung bình");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");
            chon = s.nextInt();
            if (chon != 0) {
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
                        sapXep();
                        break;
                    case 4:
                        timVaXoa();
                        break;
                    case 5:
                    tinhGiaTrungBinh();
                        break;
                    default:
                        System.out.println("Nhập sai yêu cầu, vui lòng nhập lại!");
                }
            }
        } while (chon != 0);
    }
}
