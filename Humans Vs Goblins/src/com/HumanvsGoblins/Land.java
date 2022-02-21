package com.HumanvsGoblins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Land {
    HashMap<Integer, String> mapGrid = new HashMap<>();
    ArrayList<String> inv = new ArrayList<>();
    ArrayList<Items> item = new ArrayList<>();
    ArrayList<String> items = new ArrayList<String>();
    ArrayList<String> weapons = new ArrayList<>();
    private int goblinNum = 3;

    public String toString(){
        //return " yeaa";
        //Displays the Hash Map of mapGrid as 5 indexes across and each element in ()
        return mapGrid.get(0) + "\n" +"( " + mapGrid.get(1)+" )" +"( " +mapGrid.get(2)+ " )" +"("+mapGrid.get(3)+")" +"( " + mapGrid.get(4) +" )" + "(" + mapGrid.get(5) +")" +"\n" +
               "("+ mapGrid.get(6) +")" + "("+mapGrid.get(7) +")"+"("+ mapGrid.get(8) +")"+"(" + mapGrid.get(9) +")"+ "(" +mapGrid.get(10) +")"+ "\n" +
                "("+mapGrid.get(11) +")"+"(" +mapGrid.get(12) +")"+ "(" +mapGrid.get(13)+")"+"("+ mapGrid.get(14) +")"+"("+ mapGrid.get(15) +")" +"\n"+
                "("+mapGrid.get(16) +")"+"("+ mapGrid.get(17)+")"+"("+ mapGrid.get(18)+")"+"("+mapGrid.get(19)+")"+"("+mapGrid.get(20)+")";

    }
    public Land(){
        createMap();
        items.add("potion");
        items.add("bomb");
        items.add("armor");
        //populateMap();
       // System.out.println(mapGrid);
        //System.out.println();
        Human human = new Human(5,10,1, inv, item);
        Goblins gobi1 = new Goblins(5,3);
        Goblins gobi2 = new Goblins(3, 4);
        populateMap(human,gobi1, gobi2, items, weapons);
        human.pickUpItem(inv,"Potion" );
        human.pickUpItem(inv,"Potion" );
        human.pickUpObject(item,Items.bomb );
        //mapGrid.put(2, human.toString());
        //System.out.println(mapGrid.toString());
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
        }
    }
    public void populateMap(Human human, Goblins gob1, Goblins gob2, ArrayList<String> items, ArrayList<String> weapons){
        mapGrid.put(1, human.toString());
        mapGrid.put(19, gob1.toString());
        mapGrid.put(20, gob2.toString());
        for(int i = 2; i< 19; i++){
            //mapGrid.put(1, h)
            int y =  new Random().nextInt((3));
            if(mapGrid.get(i).equalsIgnoreCase("-")){
                mapGrid.put(i, items.get(y));
            }
        }

    }



}
