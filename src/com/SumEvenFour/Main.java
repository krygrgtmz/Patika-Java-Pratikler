package com.SumEvenFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            n = input.nextInt();
            if (n%2==0 && n%4==0) {
                sum += n;
            }
        } while (n%2==0);

        System.out.print("Toplam: " + sum);
    }
}
