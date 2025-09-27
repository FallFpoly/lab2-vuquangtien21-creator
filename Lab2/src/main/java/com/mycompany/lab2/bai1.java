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
        
        // Nhập hệ số a và b từ bàn phím
        System.out.print("nhap he so a: ");
        double a = sc.nextDouble();
        System.out.print("nhap he so b: ");
        double b = sc.nextDouble();
        
        // Giải phương trình
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh có vo so nghiem.");
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
}
