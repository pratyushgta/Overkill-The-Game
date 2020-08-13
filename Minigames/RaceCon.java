package Minigames;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RaceCon {
    public static void exec1() throws InterruptedException, IOException { //First time main run method of Racecourse
        Scene.make("RaceCon","Just because we couldn't fit a Sports Stadium, we made RaceCon! Welcome to the world of Racing Drama!",null,Num.round(Stats.money,2),true,Stats.HP,false);
        Thread.sleep(1000);
        Print.textln("CowBoy Codey:\n**DIALOGUE**!");
        Thread.sleep(1500);
        Print.textln("I now present to you a new game mode! Only available in OKTown.");
        Thread.sleep(2000);
        options();
        Thread.sleep(2000);
        Print.textln("Thank you for coming here! I hope to see you again soon!");
    }

    private static void options() throws IOException, InterruptedException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scene.choice(new String[]{"The Ruthless Gamble (Entry Fee: $50)","Back in the Race(Cost: $150; Win: $600)","Go back"});
        Print.textln("Response:");
        int choice= Integer.parseInt(br.readLine());
        if(choice==1){
            Print.textln("Gambling is subject to market risks. Read all scheme related documents carefully..\n");
            Thread.sleep(2000);
            Stats.money-=50;
            gamble();
        }
        else if(choice==2){
            Print.textln("Buckle Up!!");
            Thread.sleep(2200);
            Print.textln("Put on your cowboy hats and leather boots, because we're gonna rock the dance floor!");
            Thread.sleep(2000);
            Stats.money-=150;
            race();
        }
        else if(choice==3){
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

    private static void horselist() throws InterruptedException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        Print.textln("CowBoy Codey:\n**DIALOGUE**");
        Print.textln();
        Thread.sleep(2500);
        Print.textln("--------------------");
        Print.textln("Horse 1: Red Raptor\nRaces Won: 18\nStrength: \nRemarks: ");
        Print.textln("--------------------");
        Print.textln();
        Thread.sleep(1000);
        Print.textln("--------------------");
        Print.textln("Horse 2: EuroStar Unicorn\nRaces Won: 9\nStrength: \nRemarks: ");
        Print.textln("--------------------");
        Print.textln();
        Thread.sleep(1000);
        Print.textln("--------------------");
        Print.textln("Horse 3: Blue Bandit\nRaces Won: 22\nStrength: \nRemarks: ");
        Print.textln("--------------------");
        Print.textln();
        Thread.sleep(1000);
        Print.textln("--------------------");
        Print.textln("Horse 4: Inky Pinky\nRaces Won: 14\nStrength: \nRemarks: ");
        Print.textln("--------------------");
        Print.textln();
        Thread.sleep(1000);
        Print.textln("--------------------");
        Print.textln("Horse 5: Gold Flake\nRaces Won: 9\nStrength: \nRemarks: ");
        Print.textln("--------------------");
        Print.textln();
        Thread.sleep(1500);
        Print.textln("Sooo....Spoilt for choices...Aren't you? Choose a horse number you'd like to place your bet on");
        Print.textln("You can say \"I want to exit\" to go back to main menu!");
    }

    private static void gamble() throws InterruptedException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Print.textln("CowBoy Codey:\nChoose a horse to gamble your stakes on!");
        horselist();
        String horse="";
        Print.textln("Response: ");
        horse=br.readLine();
        Thread.sleep(1000);
        if(horse.toLowerCase().contains("exit")){
            options();           
        }
        while(Integer.parseInt(horse)==0 || Integer.parseInt(horse)>5)
        {
            Print.textln("You need to enter a horse number from available options");
            Print.textln("Response: ");
            horse=br.readLine();
        }
        Random rand = new Random();
        Print.textln("Okay! So, you've decided to bet on Horse "+horse+".\nLet's see if you're lucky enough or you return home with a duck!");
        Thread.sleep(1000);
        Print.text("Place your bet: ");
        int bet=Integer.parseInt(br.readLine());
        Thread.sleep(1500);
        /*if(bet>Stats.money){
        Print.textln("Go back and bring enough buckies before betting such a huge amount!");
        Print.textln("------------------");
        Print.textln("1. Place bet again\n2. Exit to main menu");
        Print.textln("------------------");
        int ch=Integer.parseInt(br.readLine());
        if(ch==1){
        gamble();
        }
        else
        {
        options();
        }
        }
        else{*/
        Print.textln("Cowboy Cody: Are you ready to loOoOsE?");
        Print.text("Response: ");
        br.readLine();
        Thread.sleep(1000);
        System.out.println();
        Print.textln("What a great sunny day here in OKTown,\nI would have been in front of some beach in Hawaii but here I am serving you rich heads");
        System.out.println();
        Thread.sleep(2500);
        Print.textln("Turn your bull-heads towards the race course because the powerful horses are out of their stables,\nready to rock & roll!");
        System.out.println();
        Thread.sleep(4000);
        Print.textln("Horse "+rand.nextInt(6)+" has taken the lead");
        Thread.sleep(1500);
        Print.textln("Horse "+rand.nextInt(6)+" has taken the lead");
        Thread.sleep(1500);
        Print.textln("Horse "+rand.nextInt(6)+" has taken the lead");
        Thread.sleep(1500);
        Print.textln("Horse "+rand.nextInt(6)+" has taken the lead");
        Thread.sleep(1500);
        Print.textln("Horse "+rand.nextInt(6)+" has taken the lead");
        Thread.sleep(1500);
        int winhorse=rand.nextInt(6);
        if(winhorse==0){
            winhorse=winhorse+1;
        }
        else if(winhorse>5){
            winhorse=winhorse-1;
        }
        Print.textln("Horse "+winhorse+" has taken the final lead, crossed the end line & won the RaceCon 2020!");
        Thread.sleep(1500);

        if(winhorse==Integer.parseInt(horse))
        {
            Print.textln("You! Yes You! Just got won the Grand RaceCon Gamble Jackpot!");
            Stats.money+=bet;
        }
        else
        {
            Print.textln("You looooose!");
            Stats.money-=bet;
        }
    }

    private static void race() throws InterruptedException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Print.textln("CowBoy Codey:\nI fear you aren't trained to ride a horse, yet.");
        Print.textln("Go, ride an Unicorn, kid....");
        Print.textln("Reapond: ");
        br.readLine();
        options();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}