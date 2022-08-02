package com.HarmonicMean;

/* Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
 */

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double harmonicSeriesSum = 0;

        for (int i : list) {
            harmonicSeriesSum += 1.0 / i;
        }
        double harmonicMean = list.length / harmonicSeriesSum;

        System.out.println("Harmonic Mean equals to " + harmonicMean);
    }
}
