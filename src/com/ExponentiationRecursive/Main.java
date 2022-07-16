package com.ExponentiationRecursive;

import java.util.Scanner;

public class Main {
    static int exponentiation(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return (base * exponentiation(base, exponent - 1));
        }
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the base value: ");
            int base = input.nextInt();
            System.out.print("Enter the exponent value: ");
            int exponent = input.nextInt();

            System.out.println("Result = " + exponentiation(base, exponent));
            input.close();
        }
    }


