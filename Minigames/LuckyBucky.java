package Minigames;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.IOException;
import java.util.Random;
import Overkill_Engine.AIEngine;

public class LuckyBucky {
    private static AIEngine aiEngine = new AIEngine();

    private static void exec1() throws InterruptedException, IOException { //First time main run method of LuckyBucky
        Scene.make("Lucky Bucky","Try your luck and see if you're lucky. Welcome to LUCKY BUCKY!",null,Num.round(Stats.money,2),true,Stats.HP,false,Stats.weapon,false,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        Print.textln("Billy:\nLook at how the turns have tabled!");
        Thread.sleep(1500);
        Print.textln("I now present to you a new game mode! Only available in OKTown.");
        Thread.sleep(2000);
        options();
        Thread.sleep(1000);
        Print.textln("Thank you for coming here! I hope to see you again soon!");
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"Guess my number (Cost: $10; Win: $50)","Lucky Bucky Classic (Cost: $100; Win: $500 for each correct guess)","AI Challenge","Go back"});
        Print.text("Response: ");
        int choice=Input.Int();
        if(choice==1){
            Thread.sleep(2200);
            if(Stats.money<10)
                Print.error("I don't think you have enough money for this, mate. Go get some buckies to make some buckies!");
            else {
                Print.textln("Ah yes, I see my new challenge is quite popular!");
                Thread.sleep(2000);
                Stats.money -= 10;
                guessMyNumber();
            }
        }
        else if(choice==2){
            Thread.sleep(2200);
            if(Stats.money<100)
                Print.error("You might want to try your luck at Lucky Bucky's, but I don't want to try my luck with someone who doesn't have enough money for this option!");
            else {
                Print.textln("Ah I see you wanna play the Original Lucky Bucky 1 out of 100 mode!");
                Thread.sleep(2000);
                Print.textln("So far only 1 person in my previous town has won this... that too on their first try!");
                Thread.sleep(2000);
                Print.textln("You have go guess my number between 1 and 100. You have 5 turns and for each turn, I have a new number in my mind!");
                Thread.sleep(2000);
                Stats.money -= 100;
                classic();
            }
        }
        else if(choice==3){
            aiChallenge();
            options();
        }
        else if(choice==4){
        }
        else{
            Print.textln("You... naughty, naughty bi... person!");
            Thread.sleep(1500);
            Print.textln("You know this is a software after all...");
            Thread.sleep(1500);
            Print.textln("Enter what is asked correctly. Don't cause any more trouble for this old man.");
            options();
        }
    }

    private static void guessMyNumber() throws InterruptedException, IOException {
        Print.textln("Billy:\nYOU!");
        Thread.sleep(1000);
        Print.textln("...Yes you!");
        Thread.sleep(1000);
        Print.textln("...have to guess the number on MY mind! But you only have 5 turns, after which you have to tell me your guess!");
        Thread.sleep(3300);
        Print.textln("But I will tell you if my number, compared to your guess is higher or lower!");
        Thread.sleep(1700);
        Print.textln("Bigger or smaller!");
        Thread.sleep(1100);
        Print.textln("Greater or lesser! ...Wait they all mean the same thing.");
        Thread.sleep(1500);
        int num=Num.random(2);
        Print.textln("I have a number in my mind! Guess it!");
        int turns=5;
        Thread.sleep(1500);
        Print.textln("You can say \"I want to make a final guess\" anytime to make the final guess!");
        Thread.sleep(1400);
        String str;
        int temp=0;
        while(turns>0){
            Print.header("You have "+turns+(turns==1?" turn":" turns")+" remaining","*");
            Thread.sleep(1500);
            Print.textln("Make a guess or tell me if you wanna make a final guess!");
            Print.text("Response: ");
            str=Input.String();
            if(str.toLowerCase().contains("final")){
                Thread.sleep(1500);
                Print.textln("How very brave of you! Make your guess!");
                str=Input.String();
                guess(str,num,50);
                break;
            }
            if(str.matches(".*\\d.*")&&Integer.parseInt(str)>num){
                temp=Num.random(1);
                if(temp<2){
                    Print.textln("Ah, it's close but your number is higher than mine!");
                    Thread.sleep(1500);
                }
                else if(temp>2&&temp<5){
                    Print.textln("Oof, good guess but my number is lower than yours.");
                    Thread.sleep(1500);
                }
                else if(temp>5&&temp<8){
                    Print.textln("Good guess, man! My number is lower than yours.");
                    Thread.sleep(1500);}
                else{
                    Print.textln("Hmm I can see why you guessed that... Your number is higher than mine though.");
                    Thread.sleep(1500);
                }
                turns--;
            }
            else if(str.matches(".*\\d.*")&&Integer.parseInt(str)<num){
                if(temp<2){
                    Print.textln("Oh my... nice guess, but your number is less than mine!");
                    Thread.sleep(1500);
                }
                else if(temp>2&&temp<5){
                    Print.textln("Heh... my number is greater than yours!");
                    Thread.sleep(1500);
                }
                else if(temp>5&&temp<8){
                    Print.textln("That was a rather close guess! But your number is lower than mine!");
                    Thread.sleep(1500);
                }
                else{
                    Print.textln("Ah man... you almost had it! My number is higher than yours though!");
                    Thread.sleep(1500);
                }
                turns--;
            }
            else if(str.matches(".*\\d.*")&&Integer.parseInt(str)==num){
                if(temp<2){
                    Print.textln("Mate! You got it! This $50 is yours!");
                    Thread.sleep(1500);
                }
                else if(temp>2&&temp<5){
                    Print.textln("What! That is the correct number!");
                    Thread.sleep(1500);
                }
                else if(temp>5&&temp<8){
                    Print.textln("Ah, now you get to keep the $50 that I stole from my wife now!");
                    Thread.sleep(1500);
                }
                else{
                    Print.textln("You've fricking guessed it correctly! There you go mate, this $50 is yours for the keeping!");
                    Thread.sleep(1500);
                }
                Stats.money+=50;
                break;
            }
            if(turns==0){
                Print.textln("You are out of turns now buddy ol' pal! Take a guess.");
                str=Input.String();
                if(str.matches(".*\\d.*")&&Integer.parseInt(str)==num){
                    if(temp<2){
                        Print.textln("Mate! You got it! This $50 is yours!");
                        Thread.sleep(1500);
                    }
                    else if(temp>2&&temp<5){
                        Print.textln("What! That is the correct number!");
                        Thread.sleep(1500);
                    }
                    else if(temp>5&&temp<8){
                        Print.textln("Ah, now you get to keep the $50 that I stole from my wife now!");
                        Thread.sleep(1500);
                    }
                    else{
                        Print.textln("You've fricking guessed it correctly! There you go mate, this $50 is yours for the keeping!");
                        Thread.sleep(1500);
                    }
                }
                else if(str.matches(".*\\d.*")){
                    Print.textln("Damn that's tough, you didn't get it.");
                    Thread.sleep(1500);
                    Print.textln("The number was "+num+" mate! You almost had it.");
                }
                else{
                    Thread.sleep(1500);
                    Print.textln("You are not gonna get anything for being such a pain to this poor ol' software.");
                }
            }
        }
    }

    private static void classic() throws InterruptedException, IOException {
        System.out.println();
        Print.textln("Billy:\nYOU!");
        Thread.sleep(1000);
        Print.textln("...Yes you!");
        Thread.sleep(1000);
        Print.textln("...are the man of good times! You...are the reason the Original Lucky Bucky is still up and running...");
        Thread.sleep(2000);
        Print.textln("Honour thy soul for being such a good sport!");
        Thread.sleep(3000);
        Print.textln("You know the rules...and so do I! And if you suck, you die...ahum! ahum! That rhymed! Guess a number now...");
        Thread.sleep(3000);
        Print.textln("Any number. YES! ANY NUMBER! Greater or lesser, bigger or smaller, perferct square or automorphic, happy number or sad...");
        Thread.sleep(3000);
        Print.textln("No! It can't be your GF's phone number because your guess should be between 0 to 100.");
        Thread.sleep(3000);
        Print.textln("Before the coppers raid & beat the shite out of me arse for shooting your behind, tell me your guess...");
        Thread.sleep(2000);
        Print.textln("\nYou can say \"I want to make a final guess, kind Sir,\" anytime to make the final guess!");
        Thread.sleep(1400);
        String str;
        int turns=5;
        Random rand = new Random();
        int total=0;
        while(turns>0){
            int num=rand.nextInt(100);
            System.out.println();
            Print.header("\nYou have "+turns+(turns==1?" turn":" turns")+" remaining","*");
            Thread.sleep(1500);
            Print.textln("Make a guess or tell me if you wanna make a final guess!");
            Print.text("Response: ");
            str=Input.String();
            if(str.toLowerCase().contains("final")){
                Thread.sleep(1500);
                Print.textln("How very brave of you! Make your guess!");
                str=Input.String();
                guess(str,num,500);
                break;
            }
            if(str.matches(".*\\d.*")&&Integer.parseInt(str)>=0&&Integer.parseInt(str)<=100&&Integer.parseInt(str)==num)
            {
                int ch=rand.nextInt(3);
                if(ch==1){
                    Print.textln("What!? Unbelievable! You won!");
                }
                else if(ch==2){ 
                    Print.textln("No Wayy...! No wayyy..! You little ball of.. You guessed it correctly!");
                }
                else
                {
                    Print.textln("You. Sir, yes You! Just guessed the number correctly!");
                }
                Stats.money+=500.0;
                total+=500.0;
                turns--;
            }
            else if(str.matches(".*\\d.*")&&Integer.parseInt(str)>=0&&Integer.parseInt(str)<=100)
            {
                int failch=rand.nextInt(3);
                if(failch==1){
                    Print.textln("Better luck, next time. You didn't gEeEet it! Haha. The number was "+num);
                }
                else if(failch==2){
                    Print.textln("Yay! you saved my buckies by not guessing it correctly! Lucky number was "+num);
                }
                else
                {
                    Print.textln("Hard Luck! The number was "+num);
                }
                Thread.sleep(1000);
                turns--;
            }
            else
            {
                Print.textln("You... do you understand english!? Or should I speak in Dutch!?"); //AHAHAHAH WOW Nice easter egg (~By Bolton)
                Thread.sleep(1500);
                Print.textln("U moet een getal tussen van 1 tot 100 invoeren. You need to enter a number between 1 and 100.");
                Thread.sleep(1500);
                Print.textln("Enter what is asked correctly. Don't cause any more trouble for this old man.");

            }
        }
        if(total>0){
            Print.textln("Well done mate. In total you've won $"+total);
            Thread.sleep(1000);
            Print.textln("What an easy way to get rid of the money I stole from my wife!");
        }
        else{
            Print.textln("looks like you are going to have to go back empty handed, haha!");
        }
    }

    private static void guess(String str, int num, int prize) throws InterruptedException {
        if(Integer.parseInt(str)==num) {
            Thread.sleep(1300);
            Print.textln("What the... you got it!");
            Thread.sleep(1300);
            Print.textln("You've just won $"+prize+"! Congratulations!");
            Stats.money+=prize;
        }
        else{
            Thread.sleep(1300);
            Print.textln("Ahh hard luck! The number was "+num+", and you got it wrong!");
            Thread.sleep(1500);
        }
    }

    private static void aiChallenge() throws InterruptedException {
        Print.textln("AI Challenge: " + aiEngine.generateAIChallenge());
        Thread.sleep(2000);
        Print.textln("NPC Behavior: " + aiEngine.simulateNPCBehavior());
        Thread.sleep(2000);
        Print.textln("Dynamic Event: " + aiEngine.generateDynamicEvent());
        Thread.sleep(2000);
        Print.textln("AI Decision: " + aiEngine.makeDecision());
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}
