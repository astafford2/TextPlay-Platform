package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class OptionTest {

    @Test
    public void testOption_oneArgument(){
        final String argumentOne = "argument one";
        final Option option = new Option(argumentOne);
        Assert.assertEquals(option.optionText, argumentOne);

    }

    @Test
    public void testOption_twoArguments(){
        final String argumentOne = "argument one";
        final String argumentTwo = "argument two";
        final Option option = new Option(argumentOne, argumentTwo);
        Assert.assertEquals(option.optionText, argumentOne);
        Assert.assertEquals(option.requiredItem, argumentTwo);
    }
}
