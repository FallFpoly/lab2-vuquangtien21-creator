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

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        
        do {
            // Hiển thị menu
            System.out.println("+---+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---+");
            System.out.print("Chọn chức năng: ");
            
            luaChon = sc.nextInt();
            
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
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
            System.out.println(); // In dòng trống để phân cách
        } while (luaChon != 4);
        
        sc.close();
    }
    
    public static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
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
    }
    
    public static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            // Giải phương trình bậc nhất bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm x = " + x);
            }
        } else {
            // Giải phương trình bậc hai
            double delta = b * b - 4 * a * c;
            
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
    
    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        
        int tienDien;
        
        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }
        
        System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
    }
}
