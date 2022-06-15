/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab8;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
final public class XPoly{
    
    //Bài 1
    public static Double sum(Double... nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }
    
    //Bài 2
    public static Double Min(Double... nums) {
        Double min = nums[0];
        for(Double num : nums) {
            min = Math.min(min, num);
        }
        return min;
    }
    public static Double Max(Double... nums) {
        Double max = nums[0];
        for(Double num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }
    
    //Bài 3
    public static String toUpperFirstChar(String s){
        String[] ars = s.split(" ");
        StringBuilder subs = new StringBuilder();
        for(int i = 0; i < ars.length; i++) {
            String item = ars[i];
            if(!item.equals("")){
                String ch = item.substring(0, 1).toUpperCase();
                item = ch + item.substring(1).toLowerCase();
                subs.append(item).append(" ");
            }
        }
        return subs.toString().trim();
    }
    
    public static void main(String[] args) {
        
        //Bài 1
        Double result = sum(10.0, 3.0, 9.0);
        System.out.println("Bài 1:");
        System.out.println("Tổng: " + result);
        
        //Bài 2
        result = Max(1.0,2.0,3.0,4.0,5.0);
        result = Min(1.0,10.0);
        System.out.println("Bài 2:");
        System.out.println("Maximum: " + result);
        System.out.println("Minimun: " + result);
        
        //Bài 3
        String name = "nguyễn văn hải long";
        System.out.println("Bài 3:");
        System.out.println("Tên viết hoa : " + toUpperFirstChar(name));
    }
}
