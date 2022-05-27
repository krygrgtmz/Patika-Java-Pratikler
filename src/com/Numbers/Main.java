package com.Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Girilen 3 sayıyı "küçükten büyüğe" sıralayan program

        int a,b,c ;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Lütfen birinci(a) sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen ikinci(b) sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("Lütfen üçüncü(c) sayıyı giriniz: ");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            }else {
                System.out.println("a < c < b ");
            }
        }else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        }else if ((c < a ) && (c < b)) {
            if (b < a) {
                System.out.println("c < b < a");
            }else {
                System.out.println("c < a < b");
            }
        }else if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Girilen sayılar birbirine eşit olmamalıdır.");
        }
    }
}

