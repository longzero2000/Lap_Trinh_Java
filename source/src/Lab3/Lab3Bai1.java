/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Lab3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số N: ");
        int N = scanner.nextInt();
        String check = " là số nguyên tố";
        for(int i=2; i < N-1; i++){ // N là số nhập từ bàn phím if(N % i == 0){
        if(N % i == 0){
            check=" không phải số nguyên tố";
            break;
        }
            i++;
        }
        System.out.println("Số "+N+check);
    }
}
