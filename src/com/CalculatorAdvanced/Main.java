package com.CalculatorAdvanced;

import java.util.Scanner;

public class Main {

    static void addition() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? --> ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number: ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result += number;
        }
        System.out.println("Result = " + result);
    }

    static void subtraction() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? --> ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number: ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result = " + result);
    }

    static void multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? --> ");
        int counter = input.nextInt();
        int number, result = 1;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number: ");
            number = input.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result = " + result);
    }

    static void division() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? --> ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + "th number: ");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor as 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result = " + result);
    }

    static void exponentiation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent value: ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result = " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the factorial value: ");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result = " + result);
    }

    static void modulus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        int result = dividend % divisor;
        System.out.println("Result = " + result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();

        int area, perimeter;
        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Factorial\n"
                + "7- Modulus\n"
                + "8- Area and Perimeter of a Rectangle\n"
                + "0- Exit\n";

        do {
            System.out.println();
            System.out.println(menu);
            System.out.print("Please enter your choice here: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponentiation();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (select != 0);

        input.close();
    }
}
