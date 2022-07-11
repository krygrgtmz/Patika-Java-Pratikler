package com.GCDandLCM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.

        int firstNum, secondNum, smallestNum;
        int gcd=1, lcm=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNum = input.nextInt();
        System.out.print("Enter the second number: ");
        secondNum = input.nextInt();

        if (firstNum < secondNum) {
            smallestNum = firstNum;
        } else {
            smallestNum = secondNum;
        }

        int i = smallestNum;
        while (i >= 1) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                gcd = i;
                System.out.println("Greatest Common Divisor is " + gcd);
                break;
            } else {
                i--;
            }
        }

        int j = 1;
        while (j <= (firstNum * secondNum)) {
            if (j % firstNum == 0 && j % secondNum == 0 ) {
                lcm = j;
                System.out.println("Least Common Multiple is " + lcm);
                break;
            } else {
                j++;
            }
        }

    }
}
