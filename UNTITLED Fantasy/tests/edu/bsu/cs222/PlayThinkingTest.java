package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class PlayThinkingTest {

    @Test
    public void testPlayThinking_canStartGame() {
        PlayThinking thinking = new PlayThinking();
        PlotPoint start = thinking.startGame(1);
        String expectedFirstOptionExposition = "You look around at the walls on either side of you and the dirt beneath your feet. There is something glinting there buried beneath the dirt. Pick it up?";
        expectedFirstOptionExposition = start.addLineBreaks(expectedFirstOptionExposition, 95);
        String actualFirstOptionExposition = start.getPlotPoint(0).addLineBreaks(start.getPlotPoint(0).exposition, 95);
        Assert.assertEquals(expectedFirstOptionExposition, actualFirstOptionExposition);
    }

    @Test
    public void testPlayThinking_getNextPlotPoint_correctButton() {
        PlayThinking thinking = new PlayThinking();
        PlotPoint start = thinking.startGame(1);
        PlotPoint expectedNext = thinking.getNextPlotPoint(start, 1);
        PlotPoint actualNext = start.getPlotPoint(0);
        Assert.assertEquals(expectedNext, actualNext);
    }

    @Test
    public void testPlayThinking_getNextPlotPoint_wrongButton() {
        PlayThinking thinking = new PlayThinking();
        PlotPoint start = thinking.startGame(1);
        PlotPoint expectedNext = thinking.getNextPlotPoint(start, 2);
        PlotPoint actualNext = start.getPlotPoint(0);
        Assert.assertNotEquals(expectedNext, actualNext);
    }

    @Test
    public void testPlayThinking_hasRequiredItem_outOfBounds() {
        PlayThinking thinking = new PlayThinking();
        PlotPoint myPlotPoint = new PlotPoint("");
        Option myOption = new Option("");
        myPlotPoint.addOption(myOption);
        boolean visibility = thinking.hasRequiredItem(myPlotPoint, 5);
        Assert.assertFalse(visibility);
    }

    @Test
    public void testPlayThinking_hasRequiredItem_actuallyHasItem() {
        PlayThinking thinking = new PlayThinking();
        String myItem = "Dope sword bro";
        thinking.inventory.add(myItem);
        PlotPoint myPlotPoint = new PlotPoint("");
        Option myOption = new Option("");
        myOption.requiredItem = myItem;
        myPlotPoint.addOption(myOption);
        boolean visibility = thinking.hasRequiredItem(myPlotPoint, 0);
        Assert.assertTrue(visibility);
    }

    @Test
    public void testPlayThinking_hasRequiredItem_lacksItem() {
        PlayThinking thinking = new PlayThinking();
        String myItem = "Dope sword bro";
        String otherItem = "Quantitatively less dope sword";
        thinking.inventory.add(myItem);
        PlotPoint myPlotPoint = new PlotPoint("");
        Option myOption = new Option("");
        myOption.requiredItem = otherItem;
        myPlotPoint.addOption(myOption);
        boolean visibility = thinking.hasRequiredItem(myPlotPoint, 0);
        Assert.assertFalse(visibility);
    }
}