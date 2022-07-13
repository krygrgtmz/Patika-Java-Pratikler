package com.FibonacciSeries;

// Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int N = input.nextInt();

        int k1=0, k2=1, k3;

        System.out.println(N + " elemanlı Fibonacci Serisi: ");
        for (int i = 2; i <= N; i++) {
            k3 = k1 + k2;
            System.out.print(k1 + " + " + k2 + " = " + k3);
            k1 = k2;
            k2 = k3;
            System.out.println();
        }
    }
}
