package com.PerfectNumber;

import java.util.Scanner;

/** Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
 “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0;

        System.out.print("Please enter a number: ");
        n = input.nextInt();

        if (n>0) {

            for (int i = n - 1; i >= 1; i--) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.println(n + " is a perfect number!");
            } else {
                System.out.println(n + " is not a perfect number!");
            }
        } else {
            System.out.println("Specified number must be a positive integer!");
            System.out.println("Please try again!");
        }

    }
}
