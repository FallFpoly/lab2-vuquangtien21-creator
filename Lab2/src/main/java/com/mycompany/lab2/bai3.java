/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = sc.nextInt();
        
        int tienDien;
        
        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }
        
        System.out.println("Tiền điện tháng này là: " + tienDien + " đồng");
        
        sc.close();
    }
}