package edu.bsu.cs222;

class Europa {
    private PlotPoint start;

    Europa() {
        start = new PlotPoint("Welcome");
        start.backgroundColor = "#A0C0FF";

        PlotPoint transmitCrab = new PlotPoint("You transmit you data, and the people of earth learn of the strange," +
                " lumbering creatures living on the Europan sea floor.  There may be more left to explore.");
        transmitCrab.backgroundColor = "#80FF80";
        PlotPoint transmitGeyser = new PlotPoint("You transmit you data, and the people of earth learn of the active" +
                " geysers on Europa and the simple creatures that surround them.  There may be more left to explore.");
        transmitGeyser.backgroundColor = "#80FF80";
        PlotPoint transmitBoth = new PlotPoint("You transmit you data, and the people of earth learn of the complex" +
                " and flourishing biosphere is Europa's ocean.  Your mission could not have gone better.");
        transmitBoth.backgroundColor = "#00FF00";

        PlotPoint ceilingCenter = new PlotPoint("This is the relay station.  From here, data you collect can be sent" +
                " to the surface for transmission to Earth.  Return here to upload data.");
        PlotPoint ceilingNorth = new PlotPoint("The ice here is desolate and bare.");
        PlotPoint ceilingSouth = new PlotPoint("Large spires hang from the ice ceiling, coiled in thin black strands" +
                " that may be biological.");
        PlotPoint ceilingEast = new PlotPoint("Some motile organism darts by your camera.");
        PlotPoint ceilingWest = new PlotPoint("The ice West of the relay station is uninteresting.");

        PlotPoint shallowNorth = new PlotPoint("The Northern shallows are uninteresting");
        PlotPoint shallowSouth = new PlotPoint("The Southern shallows are uninteresting");
        PlotPoint shallowEast = new PlotPoint("The Eastern shallows are uninteresting");
        PlotPoint shallowWest = new PlotPoint("The Western shallows are uninteresting");

        PlotPoint deepNorth = new PlotPoint("The Northern sea floor is uninteresting");
        PlotPoint deepSouth = new PlotPoint("You can make out a large form in the murky water");
        PlotPoint deepEast = new PlotPoint("In the distance you see a faint flickering");
        PlotPoint deepWest = new PlotPoint("The Western sea floor is uninteresting");

        PlotPoint geyserFar = new PlotPoint("You spot a geyser in the distance");
        geyserFar.addTakeableItem("data from geyser");
        geyserFar.objectPresent = true;
        PlotPoint geyserMedium = new PlotPoint("You see detains on the geysers surface, including a mat of microbes similar" +
                " to that at the surface, but this one is bright yellow and orange.  The thermometer shows imminent overheating.");
        PlotPoint geyserClose = new PlotPoint("You cannot withstand the intense heat from the geyser.  Your propeller" +
                " is badly damaged and stops spinning.  Over the course of the next 8 days, your memory is filled with data from" +
                " the geyser -- small plankton-like animals feeding on the mats, a multitude of small animals predating on them" +
                " with large extending jaws.  Through reference materials from Earth, you map an intricate food web around this" +
                " geyser, an outcome far exceeding any expectation for what would be down here.  This data will never be transmitted" +
                " to Earth.");

        PlotPoint crabFar = new PlotPoint("There's a large structure in the distance, but your camera still can't see any" +
                " detail.");
        PlotPoint crabMedium = new PlotPoint("As you approach, you can make out several of these structures with varying" +
                " sizes of 1 to 5 meters.  The structures are radially symmetrical with 6 arms sticking out of a round central body." +
                "  After waiting a few seconds, you see one of the structures' arms move.  These things are alive.");
        PlotPoint crabClose = new PlotPoint("Moving closer, you can distinguish details on the creatures' hard surfaces." +
                "  Their legs are pinched at the joints, and an appendage on top of their head lazily swivels around, most likely" +
                " some sensory organ or a mouth.");
        crabClose.addTakeableItem("data from crab-like creatures");
        crabClose.objectPresent = true;

        PlotPoint wait = new PlotPoint("You consider all the data you've collected.");
        wait.backgroundColor = "#808080";
        PlotPoint turnOff = new PlotPoint("There's no use waiting."); //make it go black
        turnOff.backgroundColor = "#FF0000";

        //going towards ceiling

        Option ceilingCenterOption = new Option("Explore the ceiling near the relay station");
        start.addOption(ceilingCenterOption);
        ceilingNorth.addOption(ceilingCenterOption);
        ceilingSouth.addOption(ceilingCenterOption);
        ceilingEast.addOption(ceilingCenterOption);
        ceilingWest.addOption(ceilingCenterOption);
        transmitCrab.addOption(ceilingCenterOption);
        transmitGeyser.addOption(ceilingCenterOption);
        ceilingCenterOption.plotPoint = ceilingCenter;

        Option ceilingNorthOption = new Option("Explore the ceiling North of the relay station.");
        ceilingCenter.addOption(ceilingNorthOption);
        ceilingEast.addOption(ceilingNorthOption);
        ceilingWest.addOption(ceilingNorthOption);
        shallowNorth.addOption(ceilingNorthOption);
        ceilingNorthOption.plotPoint = ceilingNorth;

        Option ceilingSouthOption = new Option("Explore the ceiling South of the relay station.");
        ceilingCenter.addOption(ceilingSouthOption);
        ceilingEast.addOption(ceilingSouthOption);
        ceilingWest.addOption(ceilingSouthOption);
        shallowSouth.addOption(ceilingSouthOption);
        ceilingSouthOption.plotPoint = ceilingSouth;

        Option ceilingEastOption = new Option("Explore the ceiling East of the relay station.");
        ceilingCenter.addOption(ceilingEastOption);
        ceilingNorth.addOption(ceilingEastOption);
        ceilingSouth.addOption(ceilingEastOption);
        shallowEast.addOption(ceilingEastOption);
        ceilingEastOption.plotPoint = ceilingEast;

        Option ceilingWestOption = new Option("Explore the ceiling West of the relay station.");
        ceilingCenter.addOption(ceilingWestOption);
        ceilingNorth.addOption(ceilingWestOption);
        ceilingSouth.addOption(ceilingWestOption);
        shallowWest.addOption(ceilingWestOption);
        ceilingWestOption.plotPoint = ceilingWest;

        //going towards shallows

        Option shallowNorthOption = new Option("Explore the Northern shallows.");
        ceilingNorth.addOption(shallowNorthOption);
        shallowEast.addOption(shallowNorthOption);
        shallowWest.addOption(shallowNorthOption);
        deepNorth.addOption(shallowNorthOption);
        shallowNorthOption.plotPoint = shallowNorth;

        Option shallowSouthOption = new Option("Explore the Southern shallows.");
        ceilingSouth.addOption(shallowSouthOption);
        shallowEast.addOption(shallowSouthOption);
        shallowWest.addOption(shallowSouthOption);
        deepSouth.addOption(shallowSouthOption);
        shallowSouthOption.plotPoint = shallowSouth;

        Option shallowEastOption = new Option("Explore the Eastern shallows.");
        ceilingEast.addOption(shallowEastOption);
        shallowNorth.addOption(shallowEastOption);
        shallowSouth.addOption(shallowEastOption);
        deepEast.addOption(shallowEastOption);
        shallowEastOption.plotPoint = shallowEast;

        Option shallowWestOption = new Option("Explore the Western shallows.");
        ceilingWest.addOption(shallowWestOption);
        shallowNorth.addOption(shallowWestOption);
        shallowSouth.addOption(shallowWestOption);
        deepWest.addOption(shallowWestOption);
        shallowWestOption.plotPoint = shallowWest;

        //going towards sea floor

        Option deepNorthOption = new Option("Explore the Northern sea floor.");
        shallowNorth.addOption(deepNorthOption);
        deepEast.addOption(deepNorthOption);
        deepWest.addOption(deepNorthOption);
        deepNorthOption.plotPoint = deepNorth;

        Option deepSouthOption = new Option("Explore the Southern sea floor.");
        shallowSouth.addOption(deepSouthOption);
        deepEast.addOption(deepSouthOption);
        deepWest.addOption(deepSouthOption);
        deepSouthOption.plotPoint = deepSouth;

        Option deepEastOption = new Option("Explore the Eastern sea floor.");
        shallowEast.addOption(deepEastOption);
        deepNorth.addOption(deepEastOption);
        deepSouth.addOption(deepEastOption);
        deepEastOption.plotPoint = deepEast;

        Option deepWestOption = new Option("Explore the Western sea floor.");
        shallowWest.addOption(deepWestOption);
        deepNorth.addOption(deepWestOption);
        deepSouth.addOption(deepWestOption);
        deepWestOption.plotPoint = deepWest;

        //going towards geyser

        Option approachGeyserFar = new Option("Approach the flickering light.");
        deepEast.addOption(approachGeyserFar);
        approachGeyserFar.plotPoint = geyserFar;

        Option approachGeyserMedium = new Option("Get a better look of the geyser");
        geyserFar.addOption(approachGeyserMedium);
        approachGeyserMedium.plotPoint = geyserMedium;

        Option approachGeyserClose = new Option("Go in further.");
        geyserMedium.addOption(approachGeyserClose);
        approachGeyserClose.plotPoint = geyserClose;

        Option waitOption = new Option("Wait.");
        geyserClose.addOption(waitOption);
        wait.addOption(waitOption);
        waitOption.plotPoint = wait;

        Option turnOffOption = new Option("Shut down.");
        wait.addOption(turnOffOption);
        turnOffOption.plotPoint = turnOff;

        //leaving geyser

        Option leaveGuyserMedium = new Option("Back off from the geyser a bit.");
        geyserMedium.addOption(leaveGuyserMedium);
        leaveGuyserMedium.plotPoint = geyserFar;

        Option leaveGuyserFar = new Option("Leave the geyser for now.");
        geyserFar.addOption(leaveGuyserFar);
        leaveGuyserFar.plotPoint = deepEast;

        //going towards crabs

        Option approachCrabFar = new Option("Investigate.");
        deepSouth.addOption(approachCrabFar);
        approachCrabFar.plotPoint = crabFar;

        Option approachCrabMedium = new Option("Approach the structure.");
        crabFar.addOption(approachCrabMedium);
        approachCrabMedium.plotPoint = crabMedium;

        Option approachCrabClose = new Option("Get closer to the creatures.");
        crabMedium.addOption(approachCrabClose);
        approachCrabClose.plotPoint = crabClose;

        //leaving crabs

        Option leaveCrabClose = new Option("Leave the crabs.");
        crabClose.addOption(leaveCrabClose);
        leaveCrabClose.plotPoint = deepSouth;

        Option leaveCrabMedium = new Option("Leave these creatures.");
        crabMedium.addOption(leaveCrabMedium);
        leaveCrabMedium.plotPoint = deepSouth;

        Option leaveCrabFar = new Option("Ignore the structure.");
        crabFar.addOption(leaveCrabFar);
        leaveCrabFar.plotPoint = deepSouth;

        //transmit data

        Option transmitCrabOption = new Option("Tell Earth about the crab-like creatures on the Europan sea floor.", "data from crab-like creatures");
        ceilingCenter.addOption(transmitCrabOption);
        transmitCrabOption.plotPoint = transmitCrab;

        Option transmitGeyserOption = new Option("Tell Earth about the active geyser on Europa.", "data from geyser");
        ceilingCenter.addOption(transmitGeyserOption);
        transmitGeyserOption.plotPoint = transmitGeyser;

        Option transmitBothFromCrabOption = new Option ("Transmit data from both the geyser and the crab-like creatures.", "data from geyser");
        transmitCrab.addOption(transmitBothFromCrabOption);
        transmitBothFromCrabOption.plotPoint = transmitBoth;

        Option transmitBothFromGeyserOption = new Option ("Transmit data from both the geyser and the crab-like creatures.", "data from crab-like creatures");
        transmitGeyser.addOption(transmitBothFromGeyserOption);
        transmitBothFromCrabOption.plotPoint = transmitBoth;

    }

    PlotPoint getStart() {
        return start;
    }
}
