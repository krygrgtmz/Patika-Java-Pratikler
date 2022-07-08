package com.Armstrong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.
        Armstrong Sayı Nedir ?
        N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
        Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
        1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
        1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
        54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748 */

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int digitNumber=0;
        int tempNumber = number;
        int digitValue;
        int result=0;
        int digitPower;

        while (tempNumber != 0) {
            tempNumber /= 10;
            digitNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            digitPower = 1;
            for (int i = 1; i <= digitNumber; i++) {
                digitPower *= digitValue;
            }
            result += digitPower;
            tempNumber /= 10;
        }
        if (result == number) {
            System.out.print(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.print(number + " sayısı bir Armstrong sayı değildir.");
        }

    }
}
