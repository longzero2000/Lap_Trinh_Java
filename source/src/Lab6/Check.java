/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6;

/**
 *
 * @author Nguyễn Văn Hải Long
 */
public class Check{
    public Boolean isEmail(String str) {
        String pattern = "\\w+@\\w+(\\.\\w+){1,2}";
        return str.matches(pattern);
    }
    public Boolean isPhone(String str) {
        String pattern = "0\\d{9}";
        return str.matches(pattern);
    }

    public Boolean isCMND(String str) {
        String pattern = "\\d{9}";
        return str.matches(pattern);
    }
}