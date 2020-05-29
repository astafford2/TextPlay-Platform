package edu.bsu.cs222;

import java.util.*;

class PlotPoint{
    String exposition;
    String backgroundColor;
    boolean objectPresent;
    ArrayList<String> takeableItems = new ArrayList<>();
    ArrayList<Option> options = new ArrayList<>();

    PlotPoint(String exposition) {
        this.exposition = exposition;
        objectPresent = false;
        backgroundColor = "#da70d6";
    }

    void addOption(Option newOption) { this.options.add(newOption); }

    void addTakeableItem(String newItem) { this.takeableItems.add(newItem);}

    ArrayList<String> takeItem(String item, ArrayList<String> inventory) {
        this.takeableItems.remove(item);
        inventory.add(item);
        return inventory;
    }

    PlotPoint getPlotPoint(int whichPlotPoint) {
        return this.options.get(whichPlotPoint).plotPoint;
    }

    Boolean isDead() {
        return this.options.size() == 0;
    }

    String addLineBreaks(String exposition, int breakLength) {
        if(exposition.length() <= breakLength) {
            return exposition;
        }
        int endIndex = breakLength;
        int startIndex;
        String beforeIndex;
        String afterIndex = "";
        ArrayList<String> stringList = new ArrayList<>();
        while(endIndex <= exposition.length()){
            startIndex = endIndex-breakLength;
            while(exposition.charAt(endIndex) != ' '){
                endIndex-=1;
            }
            beforeIndex = exposition.substring(startIndex, endIndex);
            afterIndex = exposition.substring(endIndex);
            beforeIndex = beforeIndex.strip() + "\n";
            stringList.add(beforeIndex);
            endIndex+=breakLength;
        }
        String newExposition = "";
        for(String s : stringList){
            newExposition = newExposition + s;
        }
        newExposition = newExposition + afterIndex.strip();
        return newExposition;
    }
}
