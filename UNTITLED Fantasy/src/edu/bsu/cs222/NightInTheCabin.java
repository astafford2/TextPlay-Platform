package edu.bsu.cs222;

class NightInTheCabin {
    private PlotPoint start;
    NightInTheCabin() {
        start = new PlotPoint("It's the middle of November, and for some reason unknown to you, your parents " +
                "decided to drag you and your little sister on a trip to a creaky cabin in the middle of seemingly nowhere. " +
                "As the car pulls up to the vast woods surrounding and the cabin in front of you, you're 110% sure this " +
                "cabin is haunted. And to make matters worse, the car breaks down just outside the cabin. You're only " +
                "option now is to grab your gear and head on in.");
        Option grabGear = new Option("Grab your gear and head on in");
        start.addOption(grabGear);

        PlotPoint headingIn = new PlotPoint("You grab all of your stuff (3 bags full of it to be precise) and start " +
                "lugging it towards the cabin. The snow is not at all helpful and with the bags weighing you down, slows you " +
                "down to a snail's pace. Your legs and arms are already killing you as you're only halfway to your destination. " +
                "Suddenly, you hear shuffling out of your right ear. You look that way and swear you see branches moving, and " +
                "hear twigs snapping. Two options: keep trudging with your gear as fast as you can and hope to get away from " +
                "whatever may be making that noise, or drop EVERYTHING, and run your fastest 50 yard dash for the cabin.");
        grabGear.plotPoint = headingIn;
        Option keepTrudging = new Option("Keep trudging on");
        Option DROPANDRUN = new Option("DROP IT ALL AND RUN");
        headingIn.addOption(keepTrudging);
        headingIn.addOption(DROPANDRUN);

        PlotPoint trudgingOn = new PlotPoint("You start to trudge on as fast as you can with all your bags, almost " +
                "tripping over your feet several times as you shuffle for the cabin door. Your family is all already inside, " +
                "they hadn't seen or heard anything, but as you get closer to the door you hear whatever was in the woods " +
                "moving faster and faster, sounding closer and closer. You try to starting running with all of your bags " +
                "hanging off you, but the weight drags you to the ground and you fall into the snow. Your body feels instantly " +
                "frozen, and as you turn onto your back you look up to see a lanky creature with blood red, glowing eyes slowly " +
                "crawling up to you, snarling, and saliva dripping from its jaws. You know a fight is useless, and you pass out " +
                "from the cold and fear right before the creature sinks it's sharp teeth into you.");
        keepTrudging.plotPoint = trudgingOn;
        trudgingOn.backgroundColor = "red";

        PlotPoint droppedAndRan = new PlotPoint("You drop everything you're carrying and bolt for the cabin door, " +
                "slamming and locking it behind you. Your family is already inside, wondering what has got you so on edge " +
                "as your back is up against the door, chest heaving up and down. You hear snarling... and you slowly turn " +
                "around to look out the small window of the front door. As you look out to see where you dropped your bags, " +
                "you see some sort of skinny, lanky creature slink over to them and starting digging through bag by bag. " +
                "It must be looking for food or something. You start thinking, should you let it? Are you even able to " +
                "stop it?");
        DROPANDRUN.plotPoint = droppedAndRan;
        Option tryAndScareOff = new Option("Try and scare it off");
        Option leaveItBe = new Option("Leave it be for now");
        droppedAndRan.addOption(tryAndScareOff);
        droppedAndRan.addOption(leaveItBe);

        PlotPoint triedToScareOff = new PlotPoint("Anger fills you up, that's YOUR stuff! You lugged it all the " +
                "way here and you're gonna use it! You grab the nearest somewhat weapon you can find (which happens to be " +
                "the fire poker), throw open the door and charge towards it, screaming at the top of your lungs. You're " +
                "only two steps out of the door when it hears you. It whips around with red hot glowing eyes, and starts " +
                "racing towards you. As it nears, you try to swing at it in fear, but to no avail. It expertly avoids " +
                "your mistimed swing, bites a chunk out of your side and runs away, leaving you there to bleed out in " +
                "the snow...");
        tryAndScareOff.plotPoint = triedToScareOff;
        triedToScareOff.backgroundColor = "red";

        PlotPoint leftItBe = new PlotPoint("You watch through the window in chills as the creature slowly " +
                "ruffles through your bags. It rips through each one to see what's inside, eating some of the snacks " +
                "you packed in one of them. You're smart enough not to mess with it without knowing anything about " +
                "it, so instead you simply slowly turn around to face your family, still staring at you in confusion, " +
                "as they couldn't see anything that happened. Your dad pipes up and addresses the elephant in the room: " +
                "\"What the heck is up with you?\"");
        leaveItBe.plotPoint = leftItBe;
        Option writeItOff = new Option("Write it off for now");
        Option staySilent = new Option("Stay silent and walk away from them");
        Option tellHim = new Option("Tell your dad what you saw");
        leftItBe.addOption(writeItOff);
        leftItBe.addOption(staySilent);
        leftItBe.addOption(tellHim);

        PlotPoint wroteItOff = new PlotPoint("\"Nothing,\" you say, \"it's nothing.\" Your dad still looks " +
                "suspicious, but lets it go. Your family starts to get everything settled in the cabin; getting their " +
                "rooms ready; stocking the kitchen; and making sure there's blankets EVERYWHERE. It is freezing outside " +
                "after all. You decide to keep your missing bags to yourself for now. It's not too important and would " +
                "just cause more strife. It's only a weekend anyways, you could make it a couple days if you didn't get " +
                "them. You know that you need to go and see what's left of them at some point though, and you wonder " +
                "whether you should take some time in your room and make a plan, or just go for your bags and hope " +
                "for the best.");
        writeItOff.plotPoint = wroteItOff;
        Option takeSomeTime = new Option("Take some time, set a gameplan");
        Option goForIt = new Option("Go for it, no time to waste");
        wroteItOff.addOption(takeSomeTime);
        wroteItOff.addOption(goForIt);

        PlotPoint wentForIt = new PlotPoint("You decide you can't waste any time, and you rush out the " +
                "front door. You didn't even think about whether or not whatever that thing was would still be " +
                "there, but surely by now it's gone. Only half right. Gone from the bags, but still watching. " +
                "As you race out to your bags to grab them and immediately sprint back to the cabin, it's " +
                "suddenly right behind you. Your adrenaline pushes you forward, and you somehow make it to " +
                "the cabin and slam the door behind you. But the trip was not without loss, and as the creature " +
                "slinks away you realize it had caught hold of one of your bags as you were running: of course " +
                "it happened to be the bag with all your warm clothes in it. You drop what's left of your bags " +
                "off in your room, and find your family in the kitchen. You decide it's probably a good idea " +
                "to rest and get a nice meal in, so you help your family cook and sit with them for a while.");
        goForIt.plotPoint = wentForIt;
        Option eatAndRelax = new Option("Eat with your family, and relax");
        wentForIt.addOption(eatAndRelax);

        PlotPoint ateAndRelaxed = new PlotPoint("During the meal, your father brings up something he " +
                "noticed. He saw you bring your bags in pretty late, but one of them seemed to be missing. He " +
                "asks you what happened to it, and knowing he wouldn't believe you if you tried to explain, you " +
                "state you must've dropped it on the way in and not noticed. Stating that if it's left out there " +
                "all night everything will be ruined, he says that he's going to go look for it now before bed. " +
                "You try a few futile efforts to stop him, but you know you aren't going to change his mind. " +
                "Speaking up, your mother says that she'll go with him so he's not alone out in the dark. As they " +
                "leave, you are overcome with a sense of dread as you think about what's out there. You think " +
                "about chasing after them, but you could also just stay behind and hope they come back alright...");
        eatAndRelax.plotPoint = ateAndRelaxed;
        Option chaseThem = new Option("Chase after them!");
        Option stayBehind = new Option("Stay hidden safe in the house");
        ateAndRelaxed.addOption(chaseThem);
        ateAndRelaxed.addOption(stayBehind);

        PlotPoint chasedThem = new PlotPoint("You run out the door after them, screaming your head " +
                "off, but they don't listen. You start screaming at them about the creature and certain death " +
                "and safety inside the house, and they turn towards you with bewildered looks. \"I don't know " +
                "what you're on about, but it needs to stop,\" says your mother, \"now help us find your bag " +
                "if you're going to come out here in the cold.\" Accepting defeat, the three of you split ways " +
                "into the forest, which you know is a terrible idea, but you don't have the place to suggest " +
                "anything else. You wander around in the forest for what seems like forever, getting colder " +
                "by the second. The colder you get, the harder it gets to move, and the darker you vision " +
                "seems to get. Pretty soon you can barely see anything, and you try to head back to the cabin, " +
                "but trip over twig and log after log. Eventually you trip over another, and can't find the " +
                "strength to pull yourself back up. You lay there alone as you feel the freezing cold consume " +
                "you; and you realize that you're going to stay there, frozen in the forest forever; then you " +
                "lose vision and consciousness from the hypothermia.");
        chaseThem.plotPoint = chasedThem;
        chasedThem.backgroundColor = "red";

        PlotPoint stayedBehind = new PlotPoint("You stay behind, and just hope that everything ends " +
                "okay. Time moves slower than it ever has before as you sit there waiting, and you try to " +
                "distract yourself by playing some games with your little sister. Your family brought a few " +
                "travel games, and your sister exuberantly states she wants to play UNO, so you do. A couple " +
                "games go by, when all of a sudden you hear a faraway scream coming from outside... Every cell " +
                "in your body tries to convince you otherwise, but you know it was your father, and you know " +
                "what happened. The scream is shortly followed by a shriller shriek of horror, then silence; " +
                "and you realize the same fate has met your mother. You sit there with your little sister, all " +
                "hope lost, and wait for the inevitable.");
        stayBehind.plotPoint = stayedBehind;
        stayedBehind.backgroundColor = "red";

        PlotPoint tookSomeTime = new PlotPoint("You realize it's probably a good idea to get a plan " +
                "together. You don't know where that creature is or how it's thinking. You only have a couple " +
                "of hours of daylight left after the drive, so you know you have to work fast. You decide to " +
                "look around and find some sort of weapon, just in case. Downstairs, the only thing you can find " +
                "is a small hatchet: it's good enough you guess. You choose to be slow about it, and walk out " +
                "the door step by step, checking your surroundings and the woods in case it's still around. You " +
                "slowly make your way out to your bags, and thankfully the creature's gone back to wherever it " +
                "lives by this time. Still cautious, you grab your 3 bags and make your way back to the cabin, " +
                "thankful you took some time and found everything you needed. Your family has made a warm dinner " +
                "when you get back, and you sit down to eat with them and get some rest. During the meal you talk " +
                "to your father, and you two work on a plan to go look at the car and get it fixed. He asks you, " +
                "should we go now? Or wait until the morning?");
        takeSomeTime.plotPoint = tookSomeTime;
        Option goNow = new Option("Go now, we have time");
        Option waitForMorn = new Option("Wait until morning, rest up");
        tookSomeTime.addOption(goNow);
        tookSomeTime.addOption(waitForMorn);

        PlotPoint wentNow = new PlotPoint("You tell him you want to go now, you really just want to " +
                "get this over with and get home. And it's still light outside right? You and your father head " +
                "out with some warm clothes and a flashlight, making your way to the car and popping the hood " +
                "to see inside. Your dad shines the light around the engine to try and see what's wrong, and " +
                "sees a small tube leading into the engine has busted a small hole in it. Thankfully that's " +
                "all that's wrong you think, but it's suddenly gotten very dark and the two of you are still a " +
                "ways from the cabin. Knowing that thing is much more likely to be out here at night, you urge " +
                "your father to leave the car for tomorrow and get inside. However, he says it's a simple fix, " +
                "and it can definitely be done tonight. He runs back towards the cabin to grab what he needs: " +
                "will you go with him?");
        goNow.plotPoint = wentNow;
        Option goWith = new Option("Go back with him");
        Option stayHere = new Option("Stay here, he shouldn't be long");
        wentNow.addOption(goWith);
        wentNow.addOption(stayHere);

        PlotPoint wentWith = new PlotPoint("You stroll back to the cabin with your father, and watch as " +
                "he scrambles around and gathers what he needs: a couple of tools, and a whole lot of duct tape. " +
                "As the two of you head back out, you hope it'll be okay as long as you're together, maybe it'll " +
                "only came after loners. You were sorely mistaken. It must have been watching the two of you " +
                "walking back in, and two feet out the door it jumps both of you. One sharp clawed paw on each " +
                "of you, it slams you both to the cold ground, knocking the wind out of your lungs. You look " +
                "over at your father one last time, seeing the fear in his eyes, as the creature takes you " +
                "first, slowly pushing its claw deeper into your chest. You feel the blood pouring out of your " +
                "chest as your body goes cold, and you fade into black.");
        goWith.plotPoint = wentWith;
        wentWith.backgroundColor = "red";

        PlotPoint stayedThere = new PlotPoint("Your father leaves and heads towards the cabin. As soon " +
                "as you hear the door of the cabin close, you look towards the woods and see those red eyes once " +
                "again... staring at you, studying you. All your previous terror suddenly returns all at once, " +
                "and a thousand chills run through your body. Maybe if you stay still... it won't see you right? " +
                "Maybe you'll get lucky? ...nope. You see the creature leap out of the woods and bound towards " +
                "you, barred teeth and saliva flying. You stand there by the broken down car, defenseless and " +
                "powerless. You accept what's to come as the creature jumps and sinks it's claws into your neck. " +
                "The only silver lining is a quick and painless death as you fall to the ground, lifeless, your " +
                "family nowhere around.");
        stayHere.plotPoint = stayedThere;
        stayedThere.backgroundColor = "red";

        PlotPoint waitedForMorn = new PlotPoint("The two of you decide it's probably better to get some " +
                "rest and wait until the morning. You go up to your room, and as you're getting ready for bed you " +
                "hear a huge crash coming from downstairs. Terrified as to what could have happened, you desperately " +
                "hope one of your family members has just fallen or dropped something. Unfortunately you were very " +
                "wrong. You race downstairs, but see nothing so far. You know there are windows everywhere though, " +
                "and see two main places to check out. Either head towards the front door, or your parents bedroom.");
        waitForMorn.plotPoint = waitedForMorn;
        Option frontDoor = new Option("Head for the front");
        Option checkBedroom = new Option("Check out the bedroom");
        waitedForMorn.addOption(frontDoor);
        waitedForMorn.addOption(checkBedroom);

        PlotPoint atFrontDoor = new PlotPoint("You slink towards the front door, and as you approach " +
                "you see that the small window, as well as some of the actual wooden door has been broken wide " +
                "open. Horrified, you start slowly looking towards the kitchen and see appliances being knocked " +
                "off the counter from below, and hear something digging through the drawers. You thankfully brought " +
                "the hatchet from earlier, and decide you can try to sneak up on it and sink the hatchet into its " +
                "head to end it quickly, As you shuffle towards the kitchen counter, you take a step and hear a " +
                "crinkle underneath your foot... You look down as your heart drops and see a candy wrapper on the " +
                "floor: your sister must have dropped it and left it there from her candy bar desert. You stop cold " +
                "in your tracks, ten times the amount of fear suddenly jolting through your entire body. You stand " +
                "as still as you can, but you see it slowly look over the counter, staring into your eyes, straight " +
                "to your soul. Before you even realize what has happened, it leaps over the counter and rips a hole " +
                "in your chest. You fall, dead before you hit the ground.");
        frontDoor.plotPoint = atFrontDoor;
        atFrontDoor.backgroundColor = "red";

        PlotPoint checkedBedroom = new PlotPoint("You head towards your parents bedroom to find them, and " +
                "find your sister there as well. You ignore their pure white, flushed faces, and quickly throw out " +
                "explanations for everything happening. They don't want to believe you, but they have to at this point, " +
                "you can't be making this up now. You tell them to gather whatever weapons, or somewhat weapons they " +
                "may have, and convince your little sister to stay behind and hide under the bed. She'll be safer there. " +
                "You see your father pull a hunting rifle from his luggage. \"Where the heck did he get that from?\" " +
                "you think, but you can't afford to question it for long. You pan to your mother, and see she's pulled " +
                "out something as well, but she's hiding it and you didn't see what it was before... No time to think, " +
                "your father takes the lead as the three of you head towards the living room of the cabin.");
        checkBedroom.plotPoint = checkedBedroom;
        Option followFather = new Option("Follow your father");
        checkedBedroom.addOption(followFather);

        PlotPoint followedFather = new PlotPoint("You and your mother follow your father as you sneak down " +
                "the hall towards the noise. The three of you walk, rifle in front, hatchet with you, and whatever " +
                "your mother had with her in the back. You reach the living room, and see it slinking around the " +
                "bookshelves. You start to whisper to your father to make a plan, when suddenly he has a rush of " +
                "adrenaline and starts shooting at it. Somehow he misses all his shots, and as it whips towards " +
                "you and starts running, he runs towards it and bashes the butt on his rifle into its head. You " +
                "stare in surprise as to how he actually pulled that off, but quickly snap back and see the creature " +
                "getting back up. Your father is caught off guard now, and right before it leaps towards him, you " +
                "throw the hatchet towards its head to distract it, and maybe wound it. The distraction half is " +
                "successful, but unfortunately you hit it with the handle of the hatchet versus the blade, and so " +
                "it slowly looks toward you and your father standing side by side. The two of you are frozen in fear " +
                "as it starts slowly moving towards you, and you're certain this is the end. However, somehow in all " +
                "the excitement and distraction, your mother managed to sneak around the room, and ended up on the " +
                "other side of the creature. As it continues to creep to you and your father, she suddenly lets out " +
                "a guttural screech of adrenaline and anger, catching everyone off guard. You finally see what she's " +
                "been hiding, and stare in amazement as your mother, who you had always seen as innocent and harmless, " +
                "wields a Japanese katana above her head. In a fit of power and rage, she drives the katana through " +
                "the head of the creature, stopping it in its tracks, its red eyes going wide. You see blood slowly " +
                "flow from its jaws and it falls limp to the floor, dead for good.");
        followFather.plotPoint = followedFather;
        followedFather.backgroundColor = "green";

        PlotPoint stayedSilent = new PlotPoint("You stay quiet, and decide to just walk away from your " +
                "family, going upstairs to your room. You flop onto the bed that's there for you, and quickly fall " +
                "asleep after all the adrenaline runs out of your body. Unknowingly, as you sleep, your father " +
                "looks out the front window and see that your bags are still out there, now covered in snow. He " +
                "goes out to get them, grumbling about you leaving them out there, completely unaware of why you " +
                "did. The creature had left your bags, but it hadn't gotten far; and as soon as it heard your father " +
                "trudging out to you bags, it whipped around for fresh meat, and very quickly tackles your unsuspecting " +
                "father to the ground. He tries to fight it off, but there's nothing he can do, and whatever that " +
                "creature is, it gets the better of him. All the while you're sound asleep upstairs.");
        staySilent.plotPoint = stayedSilent;
        stayedSilent.backgroundColor = "red";

        PlotPoint toldHim = new PlotPoint("You start rambling insane sounding thoughts as fast as your " +
                "mouth will let you, fully expecting your family to call you insane and throw you in the looney " +
                "bin. But surprisingly, they actually seem to believe you. You stare at them as you finish your " +
                "ranting, confused at the belief on their faces. They start to explain, saying that as they were " +
                "walking in, they thought they saw something too, but they didn't want to sound crazy or seem " +
                "afraid in front of you kids. Being the one to step up, you confirmed their fears, and EVERYONE " +
                "wants to get out of there as soon as physically possible. Your father asks you what you think " +
                "you need to do.");
        tellHim.plotPoint = toldHim;
        Option getOuttaThere = new Option("Fix the car and get outta dodge");
        toldHim.addOption(getOuttaThere);

        PlotPoint outtaDodge = new PlotPoint("You tell him there's only one thing you can think to do: " +
                "fix the car and get the heck out of this haunted place. He agrees, and the two of you grab some " +
                "supplies and head out to the car. Thankfully there's still some daylight left, and even more " +
                "thankfully, the only thing wrong with the car is a busted tube. Easily fixed with some duct tape, " +
                "at least until you make it back to an inhabited and civilized town. Your father pulls the tape " +
                "out of his bag, and wraps it around the tube about a hundred times before tearing it off and " +
                "sealing it down. Wanting to get out of there as soon as possible, your mother and sister had " +
                "meanwhile been gathering everything else from the cabin and loading it back into the trunk of " +
                "the car. As soon as they're done, and your father slams the hood of the car back down, you all " +
                "jump in and race away from everything around you: woods, cabin, and whatever else is out there... " +
                "You still can't believe they actually believed you, but you're definitely okay with spending " +
                "the winter in your own home.");
        getOuttaThere.plotPoint = outtaDodge;
        outtaDodge.backgroundColor = "green";
    }

    PlotPoint getStart() {
        return start;
    }
}
