package com.mycompany.utsjava;

import java.util.Scanner;

public class UtsMain {
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("UTS 20 Mei 2024 oleh VIto Eko Lesmana Putra NIM:23201152");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        Scanner input = new Scanner(System.in);
        String nama;
        int gender;
        int bil1;
        int bil2;
        char operator;
        String panggil = null;
        
        System.out.println("Masukan nama anda:");
        nama  = input.next();
        System.out.println("Masukan gender anda");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        gender = input.nextInt();
        
        switch(gender){
            case 1:
                panggil = " Mas ";
                break;
            case 2:
                panggil = " Mbak ";
                break;
        } 
        
        System.out.println("Selamat Datang "+panggil+nama);
        
        boolean ulang = true;
        while (ulang) {
        System.out.println("Kalkulator");
        
        System.out.println("Masukan Bilangan pertama:");
        bil1 = input.nextInt();
        System.out.println("Masukan Bilangan Kedua:");
        bil2 = input.nextInt();
        System.out.println("Pilih Operator (+, -, *, /):");
        operator = input.next().charAt(0);
        
        int hasil;
        
        switch(operator){
            case '+':
                hasil = bil1 + bil2; 
                break;
            case '-':
                hasil = bil1 - bil2; 
                break;
            case '*':
                hasil = bil1 * bil2;
                break;
            case '/':
                hasil = bil1 / bil2;
                break;
            default:
                System.out.println("Operator salah");
                continue;
        }
        
        System.out.println("Hasil dari "+bil1+" "+operator+" "+bil2+" adalah "+hasil);
        
        System.out.println("Apakah anda ingin lanjut? (y/t)");
        char pilih = input.next().charAt(0);
        
        if (pilih == 't') {
            ulang = false;
        }
        }
    }
}