package com.SumOfDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /* Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */

        int num, digitCounter=0, sumOfDigits=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();

        while (num != 0) {
            sumOfDigits += (num%10);
            num /= 10;
            ++digitCounter;
        }

        System.out.println("Basamak sayısı: " + digitCounter);
        System.out.println("Sayının basamakları toplamı: " + sumOfDigits);
    }
}
