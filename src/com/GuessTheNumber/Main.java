package com.GuessTheNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int guessed;
        int[] wrongNumbers = new int[5];
        boolean isWin = false;
        boolean isDumb = false;

        System.out.println("Welcome to Guess The Number!");
        System.out.println("I have the number! You guess the number! Begin!!!");
        while (right < 5) {
            System.out.println();
            System.out.print("Guess the number: ");
            guessed = input.nextInt();
            if (guessed < 0 || guessed > 99) {
                System.out.println("You know the rules! Guess a number between 0 and 100...");
                if (isDumb) {
                    right++;
                    System.out.println("Are you a troll? Guess a number between 0 and 100...");
                    System.out.println("Remaining attempts: " + (5-right));
                } else {
                    isDumb = true;
                    System.out.println("You will lose a guess if you do that again!");
                }
                continue;
            }
            if (guessed == number) {
                System.out.println("Bullseye! Congrats! You guessed the number!");
                isWin = true;
                break;
            } else {
                System.out.println("Not there yet. Keep trying...");
                if (guessed > number) {
                    System.out.println("Hint: " + guessed + " is greater than The Number!");
                } else {
                    System.out.println("Hint: " + guessed + " is smaller than The Number!");
                }
                wrongNumbers[right++] = guessed;
                System.out.println("Remaining attempts: " + (5-right));
            }
        }
        if (!isWin) {
            System.out.println("You lost.. The Number was " + number + ".");
            System.out.println("Start over. It's free!");
            if (!isDumb) {
                System.out.println("Guessed numbers: " + Arrays.toString(wrongNumbers));
            }
        }

    }
}
