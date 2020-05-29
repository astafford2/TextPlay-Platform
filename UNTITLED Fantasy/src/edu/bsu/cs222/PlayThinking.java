package edu.bsu.cs222;

import java.util.ArrayList;

class PlayThinking {

        PlayThinking() {}
        ArrayList<String> inventory = new ArrayList<>();
        PlotPoint startGame(int whichStory){
            inventory.clear();
            if(whichStory == 1) {
                ChampionOfTheMaze tree = new ChampionOfTheMaze();
                return tree.getStart();
            }
            else if(whichStory == 2) {
                NightInTheCabin tree = new NightInTheCabin();
                return tree.getStart();
            }
            else if(whichStory == 3) {
                TheHeist tree = new TheHeist();
                return tree.getStart();
            }
            Europa tree = new Europa();
            return tree.getStart();
        }

        PlotPoint getNextPlotPoint(PlotPoint currentPlotPoint, int whichButton) {
            if(currentPlotPoint.objectPresent && whichButton == 1){
                currentPlotPoint.takeItem(currentPlotPoint.takeableItems.get(0), inventory);
                currentPlotPoint.objectPresent = false;
            }
            return currentPlotPoint.getPlotPoint(whichButton - 1);
        }

        boolean hasRequiredItem(PlotPoint currentPlotPoint, int i) {
            boolean visibility = false;

            if (i < currentPlotPoint.options.size()) {
                String requiredItem = currentPlotPoint.options.get(i).requiredItem;
                visibility = true;

                if (requiredItem != null) {
                    visibility = inventory.contains(requiredItem);
                }
            }
            return visibility;
        }
}
