package com.DiamondPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int i,j,k;

        for (i=1; i<=n; i++) {
            for (j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for (k=1; k<=(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (i=1; i<n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for (k=1; k<=(2*n-(2*i+1)); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
