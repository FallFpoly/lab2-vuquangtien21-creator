/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai4 {
 static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        int luaChon;
        do {
            System.out.println("+--------------------------------+");
            System.out.println("1. giai phuong trinh bac nhat");
            System.out.println("2. giai phuong trinh bac 2");
            System.out.println("3. tinh tien dien");
            System.out.println("4. ket thuc");
            System.out.println("+--------------------------------+");
            System.out.print("chon chuc nang: ");
            
            luaChon = scanner.nextInt();
            
           
            switch (luaChon) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("cam on ban da su dung phuong trinh!");
                    break;
                default:
                    System.out.println("lua chon khong hop le, vui long chon tu 1-4.");
            }
            System.out.println(); 
        } while (luaChon != 4);
    }

    public static void giaiPTB1() {
        System.out.println("=== giai phuong trinh bac nhat ===");
        System.out.print("nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap he so b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem.");
            } else {
                System.out.println("phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("phuong trinh co nghiem x = " + x);
        }
    }
    
    public static void giaiPTB2() {
        System.out.println("=== giai phuong trinh bac hai===");
        System.out.print("nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap he so c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("phuong trinh vo nghiem.");
                }
            } else {
                double x = -c / b;
                System.out.println("phuong trinh co nghiem x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem kep x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co hai nghiem phan biẹt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
   
    public static void tinhTienDien() {
        System.out.println("=== tinh tien dien ===");
        System.out.print("nhap so dien su dung trong thang: ");
        int soDien = scanner.nextInt();
        
        int tien;
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }
        
        System.out.println("so dien su dung: " + soDien + " kWh");
        System.out.println("tien dien phai tra: " + tien + " đồng");
    }
    }
