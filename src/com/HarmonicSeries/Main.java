package com.HarmonicSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java ile girilen sayının harmonik serisini bulan program yazacağız.

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();
        double result=0;

        for (double i=1; i<=n; i++) {
            result += (1/i);
        }

        // Harmonik seri formülü: 1 + (1/2) + (1/3) + (1/4) + (1/n)

        System.out.println(n + " sayısının Harmonik seri toplamı: " + result);

    }
}
