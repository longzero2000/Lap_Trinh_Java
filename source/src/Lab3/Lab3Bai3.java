package Lab3;

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab3Bai3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int  [] mang = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            mang[i] = scanner.nextInt();
        }
        // Sắp xếp dãy số theo thứ tự tăng dần
        Arrays.sort(mang);
        // Tìm giá trị min và giá trị TB các số chia hết cho 3
        int min=mang[0];
        int tong=0,tb=0;
        for (int i = 0; i < n; i++) {
            // Tìm giá trị min
            if (min>mang[i]&& i>0){ 
                min = mang[i];
            }
            //Giá trị TB các số chia hết cho 3
            if (mang[i]%3==0){ 
                tong +=mang[i];
                tb++;
            }
        }
        System.out.println("Dãy số được sắp xếp tăng dần: "+Arrays.toString(mang));
        System.out.println("Số nhỏ nhất trong mảng là: "+min);
        System.out.printf("Giá trị trung bình cộng các phần tử chia hết cho 3 là: \"%d/%d = %.3f\n",tong,tb,(double)tong/tb);
    } 
}
