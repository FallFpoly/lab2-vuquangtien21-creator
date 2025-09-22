/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
        
        sc.close();
    }
}
