/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab7Bai4 {

    private static ArrayList<SinhVienPoly> arr = new ArrayList<SinhVienPoly>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         int chon;
        do {            
           menu();
            System.out.println("Nhập lựa chọn:");
            chon = Integer.parseInt(getSc().nextLine());
            switch(chon) {
                case 1: nhap();
                case 2: xuat();
                case 3: sxtheodiem();
                case 4: hocsinhgioi();
                case 5:{ break;
                 }
            }
            
        } while (chon<5);
    }

    public static void menu() {
        System.out.println("Nhập lựa chọn:");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Xuất danh sách sinh viên");
        System.out.println("3. Xuất danh sách sinh viên học lực giỏi");
        System.out.println("4. Sắp xếp sinh viên theo điểm:");
        System.out.println("5. Thoát");
    }

    public static void nhap() {
        System.out.println("Nhập số lượng sinh viên: ");
        int soluong = getSc().nextInt();
        for (int i = 0; i < soluong; i++) {
            System.out.println("Chọn 1 hoặc 2 để thêm "
                    + "\n1. Thêm sinh viên IT"
                    + "\n2. Thêm sinh viên Biz");
            int chon = getSc().nextInt();
            switch (chon) {
                case 1 :{
                        String hoTen;
                        double diemJava, diemHTML, diemCSS;
                        System.out.println("Nhập họ tên sinh viên");
                        hoTen = getSc().nextLine();
                        System.out.println("Nhập điểm java:");
                        diemJava = getSc().nextDouble();
                        System.out.println("Nhập điểm html:");
                        diemHTML = getSc().nextDouble();
                        System.out.println("Nhập điểm css:");
                        diemCSS = getSc().nextDouble();
                        SinhVienPoly sv = new SinhVienIT(hoTen, diemJava, diemHTML, diemCSS);
                        getArr().add(sv);
                    }
                case 2 :{
                        String hoTen;
                        double diemMarketing, diemSales;
                        System.out.println("Nhập họ tên sinh viên:");
                        hoTen = getSc().nextLine();
                        System.out.println("Nhập điểm Marketing:");
                        diemMarketing = getSc().nextDouble();
                        System.out.println("Nhập điểm Sales");
                        diemSales = getSc().nextDouble();
                        SinhVienPoly biz = new SinhVienBiz(hoTen, diemMarketing, diemSales);
                        getArr().add(biz);
                    }
                default:System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    public static void xuat() {
        for(SinhVienPoly sv : getArr()){
            System.out.println(sv.toString());
        }
    }

    public static void hocsinhgioi() {
        for(SinhVienPoly sv : getArr()){
            if (sv.getHocLuc().equalsIgnoreCase("Giỏi")) {
                System.out.println(sv.toString());
            }else{
                System.out.println("Không có sinh viên giỏi!");
            }
        }
    }

    public static void sxtheodiem() {
        Comparator<SinhVienPoly> com = new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                return o2.getDiem().compareTo(o1.getDiem());
            }
    
        };
        Collections.sort(getArr(),com);
        xuat();
    }

    /**
     * @return the arr
     */
    public static ArrayList<SinhVienPoly> getArr() {
        return arr;
    }

    public static void setArr(ArrayList<SinhVienPoly> aArr) {
        arr = aArr;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner aSc) {
        sc = aSc;
    }
}
