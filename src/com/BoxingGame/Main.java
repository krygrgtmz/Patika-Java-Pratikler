package com.BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Koray", 30, 100, 60, 50);
        Fighter f2 = new Fighter("Ada", 15, 150, 65, 50);

        Match match = new Match(f1, f2, 60, 65);
        match.start();

    }
}
