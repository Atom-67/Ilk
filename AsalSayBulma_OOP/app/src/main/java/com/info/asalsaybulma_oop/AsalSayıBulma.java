package com.info.asalsaybulma_oop;


import java.util.Scanner;

//Asal sayı nedir? Kendisi ve bir haricindeki hiçbir sayıya bölünemeyen sayılar
public class AsalSayıBulma {
    public static void main(String[] args) {
        int y = 0;
        System.out.println("Çıkmak için 1 e basınız.");

        while (y == 0) {
            Scanner tarayici = new Scanner(System.in);

            System.out.print("Sayı giriniz : ");

            if (!(tarayici.hasNextInt())) {
                System.out.println("Lütfen bir tam sayı giriniz.");
            } else {
                int x = tarayici.nextInt();

                if (x < 0) {
                    System.out.println("Lütfen pozitif sayı giriniz");
                } else {

                    if (x == 1) {
                        y = x;
                    } else {


                        if ((x == 2) || (x == 3) || (x == 5) || (x == 7)) {
                            System.out.println("Girdiğiniz sayı ASALdır.");
                        } else if (((x % 2) == 0) || ((x % 3) == 0) || ((x % 5) == 0) || ((x % 7) == 0)) {
                            System.out.println("Girdiğiniz sayı ASAL DEĞİLDİR");
                        } else {
                            System.out.println("Girdiğiniz sayı ASALdır.");
                        }


                    }


                }
            }

        }
    }
}