package com.HumanvsGoblins;

import java.util.ArrayList;
import java.util.HashMap;

public class Land {
    HashMap<Integer, String> mapGrid = new HashMap<>();
    ArrayList<String> inv = new ArrayList<>();
    ArrayList<Items> item = new ArrayList<>();

    public String toString(){
        //return " yeaa";

        return mapGrid.get(0) + "\n" + mapGrid.get(1)+mapGrid.get(2)+ mapGrid.get(3) + mapGrid.get(4) + mapGrid.get(5) + "\n" +
                mapGrid.get(6) + mapGrid.get(7) + mapGrid.get(8) + mapGrid.get(9) + mapGrid.get(10) + "\n" +
                mapGrid.get(11) + mapGrid.get(12) + mapGrid.get(13)+ mapGrid.get(14) + mapGrid.get(15) + "\n"+
                mapGrid.get(16) + mapGrid.get(17)+ mapGrid.get(18)+mapGrid.get(19)+mapGrid.get(20);

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
