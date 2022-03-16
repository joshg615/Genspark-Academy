package com.HumanvsGoblins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Land {
    private HashMap<Integer, String> mapGrid = new HashMap<>();
    private ArrayList<String> inv = new ArrayList<>();
    private ArrayList<Items> item = new ArrayList<>();
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<String> weapons = new ArrayList<>();
    private int goblinNum = 3;

    public String toString(){
        //Displays the Hash Map of mapGrid as 5 indexes across and eac element in ()
        String display = "";
        System.out.println(mapGrid.get(0));
        for(int i = 1; i<21; i++){
            display = display + "(" + mapGrid.get(i) +")";
            if(i% 5 ==0){
                display = display + "\n";
            }
        }
        return display;

    }
    public Land(){
        createMap();
    }

    public void createMap(){
        mapGrid.put(0,"Humans vs Goblins\n");
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

    public void setMapGrid(HashMap<Integer, String> mapGrid) {
       // createMap();

        this.mapGrid = mapGrid;
    }

    public HashMap<Integer, String> getMapGrid() {
        return mapGrid;
    }
}
