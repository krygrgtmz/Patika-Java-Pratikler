package com.PowerFourthFifth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = input.nextInt();

        System.out.println(n + " sayısından küçük 4'ün kuvvetleri: ");
        for (int i=1; i<=n; i*=4) {
            System.out.println(i);
        }

        System.out.println(n + " sayısından küçük 5'in kuvvetleri: ");
        for (int i=1; i<=n; i*=5) {
            System.out.println(i);
        }
    }
}
