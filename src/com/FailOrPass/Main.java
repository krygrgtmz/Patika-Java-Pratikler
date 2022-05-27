package com.FailOrPass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        int total=0, counter=0;

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if (!(mat<0 || mat>100)) {
            total += mat;
            counter++;
        }
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (!(fizik<0 || fizik>100)) {
            total += fizik;
            counter++;
        }
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (!(turkce<0 || turkce>100)) {
            total += turkce;
            counter++;
        }
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if (!(kimya<0 || kimya>100)) {
            total += kimya;
            counter++;
        }
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (!(muzik<0 || muzik>100)) {
            total += muzik;
            counter++;
        }
        double average = total/counter;
        System.out.println("Ortalamanız: " + average);

        if (average >= 55 ) {
            System.out.println("Sınıfı başarıyla geçtiniz. Tebrikler!");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}
