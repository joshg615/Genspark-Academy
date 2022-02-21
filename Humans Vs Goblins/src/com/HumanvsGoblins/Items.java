package com.HumanvsGoblins;

import java.util.ArrayList;

public class Items {
   static String potion;
   static Items bomb;
   private String armor;
   ArrayList<String> Items = new ArrayList<>();


   public String toString(){

      return "Potions:  " + potion + "Bombs:";
   }

   public String getPotion() {
      return "Potion";
   }

   public void setPotion(String potion) {
      this.potion = potion;
   }

   public String getArmor() {
      return armor;
   }

   public void setArmor(String armor) {
      this.armor = armor;
   }

   public Items getBomb() {
      return bomb;
   }

   public void setBomb( Items bomb) {
      this.bomb = bomb;
   }

   public ArrayList<String> getItems() {
      return Items;
   }

   public void setItems(ArrayList<String> items) {
      Items = items;
   }

   public void randItem(){

   }

   /*public void useItem(Human human, String item){
      if (item.equalsIgnoreCase("Potion")) {
         human.setHealth(human.getHealth() + 10);
      }
      else if(item.equalsIgnoreCase("Armor")){
         human.setArmor(human.getArmor() + 15);
      }
      else if(item.equalsIgnoreCase("Bomb")){

      }
   }*/



}

