package com.HumanvsGoblins;

import java.util.ArrayList;
import java.util.HashMap;

public class Land {
    HashMap<Integer, String> mapGrid = new HashMap<>();
    ArrayList<String> inv = new ArrayList<>();
    ArrayList<Items> item = new ArrayList<>();

    public String toString(){
        return " yeaa";

    }
    public Land(){
        createMap();
        System.out.println(mapGrid.toString());
        //System.out.println();
        Human human = new Human(5,10,1, inv, item);
        human.pickUpItem(inv,"Potion" );
        human.pickUpItem(inv,"Potion" );
        human.pickUpObject(item,Items.bomb );
        mapGrid.put(2, human.toString());
        System.out.println(mapGrid.toString());
        System.out.println(human);
        human.useItem(human,human.getInventory(), "potion");
        System.out.println(human);
    }
   /* public String toString(){
        return " yeaa";


    }*/

    public void createMap(){
        mapGrid.put(0,"  Humans vs Goblins\n");

        for(int i =  1; i < 21; i++){
            mapGrid.put(i, "-");
            if(i % 5 == 0){
               // System.out.println(mapGrid.toString());
               // System.out.println();
            }
        }
        //System.out.println();


    }



}
