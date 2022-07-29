package com.BoxingGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void start() {
        System.out.println("-----BEGIN!-----");
        if (isWeightValid()) {
            int chance = Math.round((float)Math.random());
            if (chance == 0) {
                fight(f2, f1);
            }
            if (chance == 1) {
                fight(f1, f2);
            }
            printHealth();
            System.out.println();
        } else {
            System.out.println("Two fighters are not in the same weight category!");
        }
    }

    public void fight(Fighter f2, Fighter f1) {
        while (f1.health > 0 && f2.health > 0) {
            System.out.println("-----NEW ROUND-----");
            f2.health = f1.hit(f2);
            if(isWin()) {
                break;
            }
            f1.health = f2.hit(f1);
            if (isWin()) {
                break;
            }
            printHealth();
            System.out.println();
        }
    }

    public boolean isWeightValid() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println(f2.name + " HAS WON!");
            return true;
        }
        if (f2.health == 0) {
            System.out.println(f1.name + " HAS WON!");
            return true;
        }
        return false;
    }

    public void printHealth() {
        System.out.println(f1.name + "'s Health = " + f1.health);
        System.out.println(f2.name + "'s Health = " + f2.health);
    }
}
