package com.FibonacciSeriesRecursive;

// 1 1 2 3 5 8 13 21 34 ...

public class Main {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
