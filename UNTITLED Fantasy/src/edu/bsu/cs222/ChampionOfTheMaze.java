package edu.bsu.cs222;

class ChampionOfTheMaze {

    private PlotPoint start;

    ChampionOfTheMaze() {
        start = new PlotPoint("Well Mortal, welcome to the maze." +
                "Try not to disappoint me, it would be a waste to see you die." +
                "\n\n You wake up lying on your side in the grass. As you stand up you turn behind you to\n" +
                "watch the two engraved doors slide closed to meet in the middle with a loud grating\n" +
                "of stone against stone. Ahead of you is a long smooth corridor with no ceiling -\n" +
                "exposed to the sun above. You can see that it splits to the left at the end,\n" +
                "what shall you do?");
        Option start_1 = new Option("Look around");
        Option start_2 = new Option("Walk back to the doors");
        Option start_3 = new Option("Head forward into the maze");
        start.addOption(start_1);
        start.addOption(start_2);
        start.addOption(start_3);


        PlotPoint lookAround = new PlotPoint("You look around at the walls on either side of you and the dirt " +
                "beneath your feet. There is something glinting there buried beneath the dirt. Pick it up?");
        start_1.plotPoint = lookAround;

        Option lookAround_1 = new Option("Yes");
        Option lookAround_2 = new Option("No");
        lookAround.addOption(lookAround_1);
        lookAround_1.plotPoint = start;
        lookAround.addOption(lookAround_2);
        lookAround_2.plotPoint = start;
        lookAround.addTakeableItem("Mysterious Ring");
        lookAround.objectPresent = true;

        PlotPoint walkBack = new PlotPoint("You walk back to the doors and run your hands along the stone, there appears to be" +
                "no noticeable seam where it were to open. A dead end, accept your fate in the maze.");
        start_2.plotPoint = walkBack;
        Option backToStart = new Option("Turn back around");
        walkBack.addOption(backToStart);

        backToStart.plotPoint = start;

        PlotPoint headForward = new PlotPoint("You walk slowly towards the end of the corridor where it turns to the left." +
                "The wall directly at the end is engraved with the emblem of the royal family.");
        start_3.plotPoint = headForward;

        Option headForward_1 = new Option("Go to the left");
        headForward.addOption(headForward_1);

        PlotPoint goingLeft = new PlotPoint("You turn to the left and walk forward until you come across yet another crossroad.\n" +
                "All the walls look the same. There's a path forward and a path to the left." +
                "Continue as you were, or turn in a different direction?");
        headForward_1.plotPoint = goingLeft;
        Option goingLeft_1 = new Option("Go to the left");
        Option goingLeft_2 = new Option("Go straight");
        goingLeft.addOption(goingLeft_1);
        goingLeft.addOption(goingLeft_2);

        PlotPoint leftAgain = new PlotPoint("After turning to the left you come to another crossroad." +
                "Straight ahead is a dead end where a mirror is situated, showing you your reflection" +
                "The only path to continue is to the right.");
        goingLeft_1.plotPoint = leftAgain;
        Option leftAgain_1 = new Option("Turn right");
        leftAgain.addOption(leftAgain_1);

        PlotPoint turnRight = new PlotPoint("When you come to the next crossroad you see that straight ahead" +
                "the path is blocked by glowing spikes stick out of the ground and walls." +
                "However a short ways ahead of you there is a path to the left.");
        leftAgain_1.plotPoint = turnRight;
        Option turnRight_1 = new Option("Attempt to bypass spikes");
        Option turnRight_2 = new Option("Head to the left");
        turnRight.addOption(turnRight_1);
        turnRight.addOption(turnRight_2);


        PlotPoint headStraight = new PlotPoint("Deciding to stick to your original decision you continue on your path forward.\n" +
                "You come to a stop where the path to your right is blocked by glowing spikes\n" +
                "from the ground and walls. A little ways to the left of your dead end,\n" +
                "still heading straight, is another path.");
        goingLeft_2.plotPoint = headStraight;
        Option headStraight_1 = new Option("Attempt to bypass spikes");
        Option headStraight_2 = new Option("Keep going forward");
        headStraight.addOption(headStraight_1);
        headStraight.addOption(headStraight_2);

        PlotPoint spikeDeath = new PlotPoint("You carefully place your feet amongst the spikes and work to slide your body " +
                "between them when one of your hands slip. You lose grip and fall forward onto one of the waiting, glowing points." +
                "As you are impaled you body begins to burn and melt into the stone as the maze silently absorbs you.\n" +
                "A way forward was clear. Now you'll never leave.");
        headStraight_1.plotPoint = spikeDeath;
        turnRight_1.plotPoint = spikeDeath;
        spikeDeath.backgroundColor = "red";


        PlotPoint threadConnect = new PlotPoint("You only manage to make it a few feet before there's an opening to the left" +
                "There's a clear path ahead of you that turns to the right." +
                "However, the new opening looks different compared to the rest of the maze." +
                "Where the ground is barren dirt is instead thick, untrimmed grass." +
                "The walls crawling with untamed ivy. You think you see flowers further in." +
                "Tiny fairies no bigger than insects flit through the air.");
        turnRight_2.plotPoint = threadConnect;
        headStraight_2.plotPoint = threadConnect;
        Option threadConnect_1 = new Option("Enter the opening");
        Option threadConnect_2 = new Option("Continue on");
        threadConnect.addOption(threadConnect_1);
        threadConnect.addOption(threadConnect_2);

        PlotPoint natureDeath = new PlotPoint("As you enter the new area you are enchanted by the pleasant smell of hundreds of wildflowers" +
                "and bees buzzing unseen. You walk further in without a second thought and come to a turn." +
                "The path in front of you ends in a mirror and the path to the right contains more green nature." +
                "As you look to your left however - you freeze. But it doesn't do you any good." +
                "With a tremendous roar the bear in on you in an instant, barreling through the shrubs. The mirror in front of you ripples" +
                "as he smacks you into the ground.\n The enchanting lure of nature was too much for you," +
                "for some reason.");
        threadConnect_1.plotPoint = natureDeath;
        natureDeath.backgroundColor = "red";

        PlotPoint continueOn = new PlotPoint("Unsettled by the luring pull of the new path, you continue forward." +
                "When you come around a turn to the right you see three paths." +
                "There's a path to your right and a little ways ahead the green opening again." +
                "However, you've decided to avoid that route, you can also go straight.");
        threadConnect_2.plotPoint = continueOn;
        Option continueOn_1 = new Option("Go right.");
        Option continueOn_2 = new Option("Keep straight");
        continueOn.addOption(continueOn_1);
        continueOn.addOption(continueOn_2);

        PlotPoint anotherRight = new PlotPoint("When you turn right you immediately see an opening to your right that is a visible dead end." +
                "You continue past it and to to a stop on the other side of the glowing spikes." +
                "You have to turn left in order to continue, where you come to a split." +
                "Either go forward to turn left again.");
        continueOn_1.plotPoint = anotherRight;
        Option anotherRight_1 = new Option("Go left");
        Option anotherRight_2 = new Option("Go forward");
        anotherRight.addOption(anotherRight_1);
        anotherRight.addOption(anotherRight_2);

        PlotPoint smashDeath = new PlotPoint("Walking forward you are startled to hear a loud rumbling that thrums" +
                "against your eardrums and shakes the walls on either side of you. You fearfully attempt to" +
                "make the leap forward but are too slow as the walls quickly press in a crush your lower" +
                "your lower body between them. Sticking out of the wall, you'll have to wait a long time before it's over.\n" +
                "Surprise! The maze just won't let you leave.");
        anotherRight_2.plotPoint = smashDeath;
        smashDeath.backgroundColor = "red";

        PlotPoint weGoLeft = new PlotPoint("Turning to the left you see two dead ends to the right in a row," +
                "and two paths to the left in a row.");
        anotherRight_1.plotPoint = weGoLeft;
        Option weGoLeft_1 = new Option("Take a left path");
        weGoLeft.addOption(weGoLeft_1);

        PlotPoint leftPaths = new PlotPoint("Turning through one of the two left paths you notice they both lead to two more." +
                "With no other choice, you take another of the left paths," +
                "Now the forward path on the left leads to a confusing twist of paths on every side." +
                "The forward right path is a straight shot that turns left at the end.");
        weGoLeft_1.plotPoint = leftPaths;
        Option leftPaths_1 = new Option("Take the left");
        Option leftPaths_2 = new Option("Take the right");
        leftPaths.addOption(leftPaths_1);
        leftPaths.addOption(leftPaths_2);

        PlotPoint timeOutDeath = new PlotPoint("As you are walking you hear a loud shout in the distance, however it it not" +
                "one of fear. As the cry ends the maze around your begins to hiss and growl. The path before you convolutes" +
                "as the walls begin to move, to late your realize the danger as the wall to your left folds in" +
                "and smothers you down to the ground, muffling your shouts as it crushes you beneath it.\n" +
                "You took far too long, another has taken your place at the center.");
        leftPaths_1.plotPoint = timeOutDeath;
        timeOutDeath.backgroundColor = "red";


        PlotPoint trueVictory = new PlotPoint("Walking through the path on the right you follow it all the way to the turn. The air" +
                "appears to be getting warmer as you go. WHen you pass around the left corner into a right turn you see and opening" +
                "before you that leads to a much larger room than you've seen so far. Passing into it a voice calls out.\n" +
                "'Champion, you've made it, I'm very pleased. The King will know of your victory soon. For now, enjoy the sound" +
                "of conquest!'\nA screeching sound echos through the room as all four of the entrances to the room close all at once." +
                "In the distance you hear a woman's scream that ends abruptly, followed by the shouting of two men coming from different" +
                "directions. The last shout is much further off, barely heard over the roaring coming fromt he maze around you. You" +
                "fall to your knees on the hard ground as you black out.");
        leftPaths_2.plotPoint = trueVictory;
        trueVictory.backgroundColor = "green";

        PlotPoint keepStright = new PlotPoint("As you walk further forward you hear loud footsteps echoing along the walls." +
                "Suddenly, from around a corner on your right a person comes charging through." +
                "She tumbles into you and you both go sprawling into the dirt." +
                "She's on her feet in an instant.");
        continueOn_2.plotPoint = keepStright;
        Option keepStraight_1 = new Option("Use item", "Mysterious Ring"); //triggered only if they have the ring
        Option keepStraight_2 = new Option("Try to speak");
        Option keepStraight_3 = new Option("Run away");
        keepStright.addOption(keepStraight_1);
        keepStright.addOption(keepStraight_2);
        keepStright.addOption(keepStraight_3);

        PlotPoint useRing = new PlotPoint("The right you picked up earlier suddenly starts to turn freezing on your finger." +
                "It gets colder and colder until you can't handle it anymore" +
                "You pry it off and throw it to the ground in front of you." +
                "As soon as it hits the ground at the woman's feet there's a bright flash" +
                "The white light blinds you momentarily and as you open your eyes all you see is snow." +
                "Looking to the woman again you see that she is frozen solid in a pillar of ice" +
                "There's nothing that can be done for her now, time to leave.");
        keepStraight_1.plotPoint = useRing;
        Option useRing_1 = new Option("Leave");
        useRing.addOption(useRing_1);

        PlotPoint speak = new PlotPoint("As soon as you try to speak she gasps and bolts off in the direction you came." +
                "Except she makes the turn into the grassy area." +
                "After just a few seconds you hear terrible roar and her scream that is cut off." +
                "There's nothing you can do to help her now, time to leave");
        keepStraight_2.plotPoint = speak;
        Option speak_1 = new Option("Leave");
        speak.addOption(speak_1);

        PlotPoint runAway = new PlotPoint("There's no time to wait and there's no reason to trust her," +
                "you need to leave before something happens." +
                "As you take the turn on the right she came from you hear a terrible roar" +
                "followed by her scream that is abruptly cut off." +
                "There's nothing you can do for her, much less yourself.");
        keepStraight_3.plotPoint = runAway;
        Option runAway_1 = new Option("Leave");
        runAway.addOption(runAway_1);

        PlotPoint leave = new PlotPoint("As you run down the path the woman came from you come to a new crossroad." +
                "You can go left or you can go right." +
                "Or you can pause for a moment and regain your breath," +
                "take a look around as you are hopelessly lost now.");
        useRing_1.plotPoint = leave;
        speak_1.plotPoint = leave;
        runAway_1.plotPoint = leave;
        Option leave_1 = new Option("Take a moment");
        Option leave_2 = new Option("Turn to the left");
        Option leave_3 = new Option("Turn to the right");
        leave.addOption(leave_1);
        leave.addOption(leave_2);
        leave.addOption(leave_3);
        leave_3.plotPoint = timeOutDeath;

        PlotPoint takeMoment = new PlotPoint("You decide that you need the pause and slide down one of the walls." +
                "You tilt your head back to look at the sky and notice a light shimmer." +
                "As you watch an item materializes" +
                "'Use this well mortal, my gifts are few.'" +
                "The item then falls into your lap." +
                "It's a thin, silver chain necklace." +
                "As you slip it over your head, it somehow makes you feel lighter." +
                "You stand up, feeling much better now.");
        leave_1.plotPoint = takeMoment;
        Option takeMoment_1 = new Option("Leave");
        takeMoment.addOption(takeMoment_1);
        takeMoment.addTakeableItem("Feather Necklace");
        takeMoment.objectPresent = true;
        takeMoment_1.plotPoint = leave;

        PlotPoint turnLeft = new PlotPoint("As you go left the path continues uninterrupted to the right, another right, and a left." +
                "Now, the path to the left of you is a dead is a dead end." +
                "The other leads out to to a split, left or right.");
        leave_2.plotPoint = turnLeft;
        Option turnLeft_1 = new Option("Turn right");
        Option turnLeft_2 = new Option("Turn left");
        turnLeft.addOption(turnLeft_1);
        turnLeft.addOption(turnLeft_2);
        turnLeft_1.plotPoint = timeOutDeath;

        PlotPoint theLeft = new PlotPoint("As you turn left you make it a few feet before the ground beneath you starts rumbling.");
        turnLeft_2.plotPoint = theLeft;
        Option theLeft_1 = new Option("Use item", "Feather Necklace"); //requires the necklace
        Option theLeft_2 = new Option("Leap forward");
        theLeft.addOption(theLeft_1);
        theLeft.addOption(theLeft_2);

        PlotPoint darkVictory = new PlotPoint("The ground beneath you stops rumbling and then gives out, in the split second your have" +
                "you use what leverage your feet have to take a leap back up to the ledge. The necklace around your neck begins to float and for a moment " +
                "so do you as your jump take your high enough that even your feet clear the ledge.\n" +
                "As you safely land on the other side of the now massive hole in the ground the necklace continues to float as it" +
                "pulls you to the left at the next turn. When you come to the end of the corridor it opens up into a room that is larger than any " +
                "other that you have seen so far in the maze. As you walk further out into the open their is a soul-piercing screech as all four of the " +
                "entrances leading into the room close at the same time. A voice booms out around you, 'I had to help you get here mortal, you are as " +
                "clumsy as a newborn. In return for saving your life, it is mine now.' You fall to your knees and as the world around you fades to black" +
                "the screams of many voices echo in your ears along with the growls of the maze that will haunt your dreams.");
        theLeft_1.plotPoint = darkVictory;
        darkVictory.backgroundColor = "green";

        PlotPoint fallDeath = new PlotPoint("The ground beneath you stops rumbling and then gives out entirely. In the split" +
                "second that you begin falling you use what little leverage your feet have to make a leap for the ledge. Your fingers" +
                "just barely brush it before the reat of your body collides with the wall, dislodging your fingers and sending you down" +
                "endlessly into the dark.\nWho said you could leave?");
        theLeft_2.plotPoint = fallDeath;
        fallDeath.backgroundColor = "red";
    }

    PlotPoint getStart() {
        return this.start;
    }
}

