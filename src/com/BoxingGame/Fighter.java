package com.BoxingGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println(this.name + " hit " + foe.name + " by " + this.damage);
        if (foe.dodge()) {
            System.out.println(foe.name + " dodged!");
            return foe.health;
        } else {
            System.out.println(foe.name + " is punched!");
        }
        if(foe.health - this.damage < 0 ){
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
