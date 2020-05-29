package edu.bsu.cs222;

class Option {

    String optionText;
    String requiredItem = null;
    PlotPoint plotPoint;

    Option(String optionText) {
        this.optionText = optionText;
    }
    Option(String optionText, String requiredItem) {
        this.optionText = optionText;
        this.requiredItem = requiredItem;
    }
}
