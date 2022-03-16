package com.HumanvsGoblins;

import java.util.ArrayList;

public class Human {
    private int health, strength, armor;
    private ArrayList<String> inventory = new ArrayList<>();
    ArrayList<Items> object = new ArrayList<>();


    public Human(){}
    public Human(int health, int strength, int armor, ArrayList<String> inventory, ArrayList<Items> object){
        setHealth(health);
        setStrength(strength);
        setArmor(armor);
        setInventory(inventory);
        setObject(object);
    }

    public String toString(){
        /*return "Human(Health = " + this.getHealth() + ", Strength = " + this.getStrength() + " Armor = " + this.getArmor() + ")"+ "  Inventory:" + this.getInventory()
                + "bombs: " + this.getObject();*/
        return "H";
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

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Items> getObject() {
        return object;
    }

    public void setObject(ArrayList<Items> object) {
        this.object = object;
    }


    public void pickUpItem(ArrayList<String> inventory, String item){
        inventory.add(item);
    }
    public void pickUpObject(ArrayList<Items> inv, Items item){
        inv.add(item);
        //item.toString();
    }

    public void useItem(Human human, ArrayList<String> inv, String item) {
        if (item.equalsIgnoreCase("Potion")) {
            human.setHealth(human.getHealth() + 10);
            human.getInventory().remove("Potion");

        } else if (item.equalsIgnoreCase("Armor")) {
            human.setArmor(human.getArmor() + 15);
        } else if (item.equalsIgnoreCase("Bomb")) {

        }
    }

    public Goblins attack(Goblins gob){
        gob.setHealth(gob.getHealth() - this.getStrength());
        return gob;

    }

}

