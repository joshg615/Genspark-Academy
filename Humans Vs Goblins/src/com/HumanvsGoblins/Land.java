package com.HumanvsGoblins;

import java.util.HashMap;

public class Land {
    HashMap<Integer, String> mapGrid = new HashMap<>();

    public String toString(){
        return " yeaa";


    }
    public Land(){
        createMap();
        System.out.println(mapGrid.toString());
        System.out.println();
        Human human = new Human(5,10,1);
        System.out.println(human.toString());
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
