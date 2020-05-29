package edu.bsu.cs222;

class TheHeist {
    private PlotPoint start;
    TheHeist() {
        start = new PlotPoint("Las Vegas, 1976" + "We need a team, but who do we get? ~long time friend Bill 'the Man' Turner " +
                "I know just the people ~ you" + "Who do you get first?");
        Option meredith1 = new Option("Meredith 'Fitzgerald' Adealion");
        Option reymond1 = new Option("Reymond 'Slick' Boyle");
        start.addOption(meredith1);
        start.addOption(reymond1);

        //Beginning of branch1
        PlotPoint reymond = new PlotPoint("Master acrobat and contortionist " +
                "In a dinghy bar. Hey Reymond ~you " + "Whats the Job ~ Reymond " + "*You tell him the Job* " +
                "Not interested ~Reymond"+ "What do you do");
        reymond1.plotPoint = reymond;
        Option walkAway1 = new Option("Walk Away");
        Option DontTakeNo1= new Option("Don't take no as an answer");
        reymond.addOption(walkAway1);
        reymond.addOption(DontTakeNo1);

        //After first choice
        PlotPoint walkAway = new PlotPoint("you walk away from Reymond " +
                "Someone has been following you, He payed Reymond for information about the job " +
                "the cops find you and arrest you for conspiracy, The End");
        walkAway.backgroundColor = "red";
        walkAway1.plotPoint = walkAway;

        PlotPoint dontTakeNo = new PlotPoint("Offer an extra 5% of the cut " +
                "'Alright what's the job?,  *you tell him the job*, Who's next?");
        DontTakeNo1.plotPoint = dontTakeNo;
        Option BobNix1 = new Option("Bob Nix");
        Option SallyMae1 = new Option("Sally Mae");
        dontTakeNo.addOption(BobNix1);
        dontTakeNo.addOption(SallyMae1);

        //After second choice
        PlotPoint BobNix = new PlotPoint("Codecracker, you find him at the local library on a computer " +
                "'Hey Bob ~ you, 'What's the job?' he says without looking up from the computer " +
                "*you tell him some slight details*, 'I'm in'~Bob, He stands up and all the computers flash blue then start showing the same picture. " +
                "What do you do?");
        BobNix1.plotPoint = BobNix;
        Option goBack1 = new Option("Go back to Bill");
        Option goToJob1 = new Option("Go to Job");
        BobNix.addOption(goBack1);
        BobNix.addOption(goToJob1);

        PlotPoint SallyMae = new PlotPoint("Con-artist, 'I've been waiting for you, where's Bill?' " +
                "'He's out attending to more important matters'~you, 'No matter, get him boys' " +
                "You are placed under arrest for conspiracy, Sally was bought");
        SallyMae.backgroundColor = "red";
        SallyMae1.plotPoint = SallyMae;

        //After third choice
        PlotPoint goBack = new PlotPoint("'Good you're here'~Bill, 'What's the Job?~ Reymond " +
                "'Yeah... what's the job man'~Bob, 'Alright we are going to rob the MGM casino.'~Bill " +
                "Like Ocean's 11?~Reymond. What does he say? ");
        goBack1.plotPoint = goBack;
        Option Yes1 = new Option("Yes");
        Option No1 = new Option("No");
        goBack.addOption(Yes1);
        goBack.addOption(No1);

        PlotPoint goToJob = new PlotPoint("you go to the job, but when you get there you realize that you all don't know what you're doing. " +
                "So the team fails miserably and are all arrested. The End");
        goToJob1.plotPoint = goToJob;
        goToJob.backgroundColor = "red";

        //After fourth choice
        PlotPoint yes = new PlotPoint("Yes... no you idiot. Since you are so stupid you're fired. " +
                "And I quit. I'm to old for this thing. The End");
        Yes1.plotPoint = yes;
        yes.backgroundColor = "red";

        PlotPoint no = new PlotPoint("'No we are only robbing one and there isn't a vault like that'~Bill " +
                "'How are we going to do that?'`Reymond, 'Why don't you shut up slick and I'll tell you' ~Bill, 'Okay'~Reymond " +
                "'We will be tag teaming it, Bill you will watch and control the cameras. Opening and closing doors, slot machines. Everything. If someone downloads music you need to " +
                "know about it. Got it?'~Bill, 'What about me?~Reymond, 'I'm getting to you Slick, Slick you will be the one sneaking in. you will get into the vents and will have " +
                "all the money packed by the time that I get there with him.~Bill " +
                "Okay~Reymond, Are you in or are you out?");
        No1.plotPoint = no;
        Option youreOut1 = new Option("You're out");
        Option youreIn1 = new Option("You're in");
        no.addOption(youreOut1);
        no.addOption(youreIn1);

        //After fifth choice
        PlotPoint youreOut = new PlotPoint("You pull out. It's too risky for you. They were successful without you though. You get nothing. The End");
        youreOut1.plotPoint = youreOut;
        youreOut.backgroundColor = "red";

        PlotPoint youreIn = new PlotPoint("Do you remember who's in charge of the computers?");
        youreIn1.plotPoint = youreIn;
        Option finalReymond1 = new Option("Reymond");
        Option finalBob1 = new Option("Bob");
        youreIn.addOption(finalReymond1);
        youreIn.addOption(finalBob1);

        //After sixth choice
        PlotPoint finalReymond = new PlotPoint("That's incorrect, because of this the guys all get confused on their roles. " +
                "As well as the group splits before the job begins. The End");
        finalReymond1.plotPoint = finalReymond;
        finalReymond.backgroundColor = "red";

        PlotPoint finalBob = new PlotPoint("That's right! with that in mind what does Reymond do?");
        finalBob1.plotPoint = finalBob;
        Option frontDoor1 = new Option("He walks through the front door");
        Option sneakIn1 = new Option("He sneaks in to pack the money");
        finalBob.addOption(frontDoor1);
        finalBob.addOption(sneakIn1);

        //After seventh choice
        PlotPoint frontdoor = new PlotPoint("That's incorrect, because of this the guys all get confused on their roles. " +
                "As well as the group splits before the job begins. The End");
        frontDoor1.plotPoint = frontdoor;
        frontdoor.backgroundColor = "red";

        PlotPoint sneakIn = new PlotPoint("Good job! The job goes off without a hitch. You steal 11 million dollars worth of cash! How do you split the money?");
        sneakIn1.plotPoint = sneakIn;
        Option everyone251 = new Option("Everyone gets an equal share of 25%");
        Option bill301 = new Option("Bill gets 305, You 25%, the others 22.5%");
        Option allyou1 = new Option("You take it all");
        sneakIn.addOption(everyone251);
        sneakIn.addOption(allyou1);
        sneakIn.addOption(bill301);

        //After eight choice
        PlotPoint everyone25 = new PlotPoint("Smart move. You end up with $2,750,000. You invest it all and live a rich life, The End");
        everyone251.plotPoint = everyone25;
        everyone25.backgroundColor = "green";

        PlotPoint bill30 = new PlotPoint("The other two don't like it but will live it. The End");
        bill301.plotPoint = bill30;
        bill30.backgroundColor = "green";

        PlotPoint allyou = new PlotPoint("You are greedy. You anger your crew. Because of this they off you. they split the money 3 ways. The End");
        allyou1.plotPoint = allyou;
        allyou.backgroundColor = "red";

        //Beginning of branch2
        PlotPoint meredith = new PlotPoint("A warm brunette hottie, many men would swoon over a girl like her " +
                "You love her, 'Hey you'~ You, 'Hello you, need something?' ~Meredith, 'You darling'~You " +
                "*sigh* Whats the job? ~Meredith, *You tell her the job*, 'I'm in' ~Meredith, " +
                "Who's next?");
        meredith1.plotPoint = meredith;
        Option bobNix3 = new Option("Bob Nix");
        Option sallyMae3 = new Option("Sally Mae");
        meredith.addOption(bobNix3);
        meredith.addOption(sallyMae3);

        //After first choice
        PlotPoint bobNix2 = new PlotPoint("Codecracker, you find him at the local library on a computer " +
                "'Hey Bob ~ you, 'What's the job?' he says without looking up from the computer " +
                "*you tell him some slight details*, 'I'm in'~Bob, He stands up and all the computers flash blue then start showing the same picture. " +
                "What do you do?");
        bobNix3.plotPoint= bobNix2;
        Option goBack3 = new Option("Go back to Bill");
        Option goToJob3 = new Option("Meet at the Job");
        bobNix2.addOption(goBack3);
        bobNix2.addOption(goToJob3);

        PlotPoint sallyMae2 = new PlotPoint("Con-artist, 'I've been waiting for you, where's Bill?' " +
                "'He's out attending to more important matters'~you, 'No matter, get him boys' " +
                "You are placed under arrest for conspiracy, Sally was bought");
        sallyMae3.plotPoint = sallyMae2;
        sallyMae2.backgroundColor = "red";

        //After second choice
        PlotPoint goBack2 = new PlotPoint("'Good you're here'~Bill, 'What's the Job?~ Bob " +
                "'Yeah... what's the job man'~Bob, 'Alright we are going to rob the MGM casino.'~Bill " +
                "Like Ocean's 11?~Bob. What does he say?");
        goBack3.plotPoint = goBack2;
        Option yes3 = new Option("Yes");
        Option no3 = new Option("No");
        goBack2.addOption(yes3);
        goBack2.addOption(no3);

        PlotPoint goToJob2 = new PlotPoint("you go to the job, but when you get there you realize that you all don't know what you're doing. " +
                "So the team fails miserably and are all arrested. The End");
        goToJob3.plotPoint = goToJob2;
        goToJob2.backgroundColor = "red";

        //After third choice
        PlotPoint yes2 = new PlotPoint("Yes... no you idiot. Since you are so stupid you're fired. " +
                "And I quit. I'm to old for this thing. The End");
        yes3.plotPoint = yes2;
        yes2.backgroundColor = "red";

        PlotPoint no2 = new PlotPoint("'No we are only robbing one and there isn't a vault like that'~Bill " +
                "'How are we going to do that?'`Meredith, 'I'm getting to you' ~Bill, 'Okay'~Meredith " +
                "'We will be tag teaming it, Bill you will watch and control the cameras. Opening and closing doors, slot machines. Everything. If someone downloads music you need to " +
                "know about it. Got it?'~Bill, 'What about me?~Meredith, 'Meredith you will be the one sneaking in. you will get into the vents and will have " +
                "all the money packed by the time that I get there with him.~Bill " +
                "Okay~Meredith, Are you in or are you out?");
        no3.plotPoint = no2;
        Option youreOut3 = new Option("I'm out");
        Option youreIn3 = new Option("Let's do it");
        no2.addOption(youreOut3);
        no2.addOption(youreIn3);

        //After fourth choice
        PlotPoint youreOut2 = new PlotPoint("You pull out. It's too risky for you. They were successful without you though. You get nothing. The End");
        youreOut3.plotPoint = youreOut2;
        youreOut2.backgroundColor = "red";

        PlotPoint youreIn2 = new PlotPoint("Do you remember who's in charge of the computers?");
        youreIn3.plotPoint = youreIn2;
        Option finalMeredith3 = new Option("Meredith");
        Option finalBob3 = new Option("Bob");
        youreIn2.addOption(finalMeredith3);
        youreIn2.addOption(finalBob3);

        //After fifth choice
        PlotPoint finalMeredith2 = new PlotPoint("That's incorrect, because of this the guys all get confused on their roles. " +
                "As well as the group splits before the job begins. The End");
        finalMeredith3.plotPoint = finalMeredith2;
        finalMeredith2.backgroundColor = "red";

        PlotPoint finalBob2 = new PlotPoint("That's right! with that in mind what does Meredith do?");
        finalBob3.plotPoint = finalBob2;
        Option sneakIn3 = new Option("Sneak in to pack the money");
        Option frontDoor3 = new Option("Walk in through the front door");
        finalBob2.addOption(sneakIn3);
        finalBob2.addOption(frontDoor3);

        //After sixth choice
        PlotPoint frontdoor2 = new PlotPoint("That's incorrect, because of this the guys all get confused on their roles. " +
                "As well as the group splits before the job begins. The End");
        frontDoor3.plotPoint = frontdoor2;
        frontdoor2.backgroundColor = "red";

        PlotPoint sneakIn2 = new PlotPoint("Good job! The job goes off without a hitch. You steal 11 million dollars worth of cash! How do you split the money?");
        sneakIn3.plotPoint = sneakIn2;
        Option everyone253 = new Option("Everyone gets an equal share of 25%");
        Option bill303 = new Option("Bill gets 305, You 25%, the others 22.5%");
        Option allyou3 = new Option("You take it all");
        sneakIn2.addOption(everyone253);
        sneakIn2.addOption(bill303);
        sneakIn2.addOption(allyou3);

        //After eight choice
        PlotPoint everyone252 = new PlotPoint("Smart move. You end up with $2,750,000. You invest it all and live a rich life, The End");
        everyone253.plotPoint = everyone252;
        everyone252.backgroundColor = "green";

        PlotPoint bill302 = new PlotPoint("The other two don't like it but will live it. Meredith decides to marry you. So 47.5% not bad. The End");
        bill303.plotPoint = bill302;
        bill302.backgroundColor = "green";

        PlotPoint allyou2 = new PlotPoint("You are greedy. You anger your crew. Because of this they off you. they split the money 3 ways. The End");
        allyou3.plotPoint = allyou2;
        allyou2.backgroundColor = "red";

    }
    PlotPoint getStart() {
        return start;
    }
}
