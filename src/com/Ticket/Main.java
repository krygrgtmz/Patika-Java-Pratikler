package com.Ticket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int distance, age, type;
        double price=0.0, pricePerKm=0.10;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi KM cinsinden giriniz: ");
        distance = input.nextInt();
        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.println("Lütfen yolculuk tipini giriniz: ");
        System.out.println("1-Tek Yön\n2-Gidiş Dönüş");
        type = input.nextInt();

        price = distance*pricePerKm;

        switch (type) {
            case 1:
                price = price;
                break;
            case 2:
                price *= 2*0.8;
                break;
            default:
                isError = true;
        }

        if (!isError) {
            if (age>0 && age<12) {
                price *= 0.5;
                System.out.println("Bilet Fiyatınız: " + price + " TL");
            } else if (age>=12 && age<24) {
                price *= 0.9;
                System.out.println("Bilet Fiyatınız: " + price + " TL");
            } else if (age>=24 && age<65) {
                price = price;
                System.out.println("Bilet Fiyatınız: " + price + " TL");
            } else if (age>65) {
                price *= 0.7;
                System.out.println("Bilet Fiyatınız: " + price + " TL");
            } else {
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
            }
        } else {
            System.out.println("Hatalı yolculuk tipi girdinizi. Lütfen tekrar deneyiniz.");
        }
    }
}
