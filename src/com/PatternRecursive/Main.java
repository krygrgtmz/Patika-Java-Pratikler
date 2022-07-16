package com.PatternRecursive;

/* Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
 Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
 Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
 Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
  */

import java.util.Scanner;

public class Main {

    static int subtraction(int number) {
        if (number <= 0)
            return number;
        System.out.print(number + " ");
        return subtraction(number - 5);
    }

    static int addition(int nextNumber, int number ) {
        if (nextNumber > number)
            return nextNumber;
        System.out.print(nextNumber + " ");
        return addition(nextNumber + 5, number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an initiator value: ");
        int initiator = input.nextInt();
        addition(subtraction(initiator), initiator);
        input.close();
    }
}
