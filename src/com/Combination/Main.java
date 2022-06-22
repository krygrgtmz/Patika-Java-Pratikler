package com.Combination;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        int nTotal=1, rTotal=1, nrTotal=1;
        double combination;

        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        n = scan.nextInt();
        System.out.print("r: ");
        r = scan.nextInt();

        int nr = n-r;

        for (int i=1; i<=n; i++){
            nTotal*=i;
        }
        for (int i=1; i<=r; i++){
            rTotal*=i;
        }
        for (int i=1; i<=nr; i++){
            nrTotal*=i;
        }
        combination = nTotal / (rTotal*nrTotal);

        System.out.println("C("+n+","+ r+"): " + combination);
    }
}
