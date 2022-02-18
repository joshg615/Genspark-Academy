package com.HumanvsGoblins;

public class Human {
    private int health, strength, armor;

    public Human(){}
    public Human(int a, int b, int c){
        setHealth(a);
        setStrength(b);
        setArmor(c);

    }

    public String toString(){
        return "Human(Health = " + this.getHealth() + ", Strength = " + this.getStrength() + " Armor = " + this.getArmor() + ")";
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public Goblins attack(Goblins gob){
        gob.setHealth(gob.getHealth() - this.getStrength());
        return gob;

    }

}
