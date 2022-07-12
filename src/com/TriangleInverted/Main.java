package com.TriangleInverted;

import java.util.Scanner;

/** Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        yıldızlar(*) ile ekrana ters üçgen çizen programı yazın. */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            for (int k = n-i; k > 0; k-- ) {
                System.out.print(" ");
            }

            for (int j = (2*i) - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
