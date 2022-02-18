package com.HumanvsGoblins;

public class Goblins {
    private int health, strength;

    public Goblins(){}
    public Goblins(int a, int b){
        setHealth(a);
        setStrength(b);
    }

    public String toString(){
        return "Goblin(Health = " + this.getHealth() + ", Strength = " + this.getStrength() + ")";
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }



    public Human attack(Human human){
        human.setHealth(human.getHealth() - this.getStrength());
        return human;
    }


}

