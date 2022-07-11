package com.MinAndMaxValues;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
        ve bu sayıları ekrana yazan programı yazın. */

        Scanner input = new Scanner(System.in);

        int min = 0, max = 0, number, counter;

        System.out.print("Kaç adet sayı gireceksiniz? Lütfen belirtin: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            number = input.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }
}
