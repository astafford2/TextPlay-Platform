package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PlotPointTest {

    @Test
    public void testPlotPoint_canGetExposition() {
        final PlotPoint plotPoint = new PlotPoint("You are here");
        Assert.assertEquals("You are here", plotPoint.exposition);
    }

    @Test
    public void testPlotPoint_addOneOption() {
        PlotPoint plotPoint = new PlotPoint("You are here");
        final Option option = new Option("");
        plotPoint.addOption(option);

        ArrayList<Option> expected = new ArrayList<>();
        expected.add(option);

        Assert.assertEquals(expected, plotPoint.options);
    }

    @Test
    public void testPlotPoint_addMultipleOptions() {
        PlotPoint plotPoint = new PlotPoint("You are here");
        final Option option1 = new Option("");
        final Option option2 = new Option("");
        plotPoint.addOption(option1);
        plotPoint.addOption(option2);

        ArrayList<Option> expected = new ArrayList<>();
        expected.add(option1);
        expected.add(option2);

        Assert.assertEquals(expected, plotPoint.options);
    }

    @Test
    public void testPlotPoint_addOneTakeableItem() {
        PlotPoint plotPoint = new PlotPoint("You are here");
        final String takeableItem = "Pocket Sand";
        plotPoint.addTakeableItem(takeableItem);

        final ArrayList<String> expected = new ArrayList<>();
        expected.add(takeableItem);

        Assert.assertEquals(expected, plotPoint.takeableItems);
    }

    @Test
    public void testPlotPoint_addMultipleTakeableItems() {
        PlotPoint plotPoint = new PlotPoint("You are here");
        final String takeableItem1 = "Pocket Sand";
        final String takeableItem2 = "Flashlight";
        plotPoint.addTakeableItem(takeableItem1);
        plotPoint.addTakeableItem(takeableItem2);

        final ArrayList<String> expected = new ArrayList<>();
        expected.add(takeableItem1);
        expected.add(takeableItem2);

        Assert.assertEquals(expected, plotPoint.takeableItems);
    }

    @Test
    public void testPlotPoint_canGetPlotPoint() {
        PlotPoint myPlotPoint = new PlotPoint("");
        Option myPlotPointsOption = new Option("");
        myPlotPoint.addOption(myPlotPointsOption);
        PlotPoint secondPlotPoint = new PlotPoint("");
        myPlotPointsOption.plotPoint = secondPlotPoint;
        Assert.assertEquals(secondPlotPoint, myPlotPoint.getPlotPoint(0));
    }

    @Test
    public void testPlotPoint_breaksAfterSpecifiedChars(){
        PlotPoint dummy = new PlotPoint("");
        String testPoint = "This is a test and it should break here when called.";
        final String afterBreaks = "This is a test and it should break here\n" +
                "when called.";
        final String afterCalled = dummy.addLineBreaks(testPoint, 39);
        Assert.assertEquals(afterBreaks, afterCalled);
    }

    @Test
    public void testPlotPoint_breaksOnlyAtSpace(){
        PlotPoint dummy = new PlotPoint("");
        String testPoint = "This is a test and it should break here when called.";
        final String afterBreaks = "This is a test and it should break here\n" +
                "when called.";
        final String afterCalled = dummy.addLineBreaks(testPoint, 42);
        Assert.assertEquals(afterBreaks, afterCalled);
    }

    @Test
    public void testPlotPoint_doesntBreakIfShortString() {
        PlotPoint dummy = new PlotPoint("");
        String testPoint = "You are here.";
        final String afterBreaks = "You are here.";
        final String afterCalled = dummy.addLineBreaks(testPoint, 42);
        Assert.assertEquals(afterBreaks, afterCalled);
    }
}