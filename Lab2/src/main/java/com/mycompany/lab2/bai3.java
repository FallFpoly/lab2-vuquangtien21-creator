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
        
        System.out.print("nhap so dien su dung trong thang: ");
        int soDien = sc.nextInt();
        
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
