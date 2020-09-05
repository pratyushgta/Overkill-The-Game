package City.East;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RaceCon {
    private static void exec1() throws InterruptedException, IOException { //First time main run method of Racecourse
        Scene.make("RaceCon","Just because we couldn't fit a Sports Stadium, we made RaceCon! Welcome to the world of Racing Drama!",null,Num.round(Stats.money,2),true,Stats.HP,false,Stats.weapon,false,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        Print.textln("\nCowBoy Codey:\n**DIALOGUE**!");
        Thread.sleep(1500);
        Print.textln("I now present to you a new game mode! Only available in OKTown.");
        Thread.sleep(2000);
        options();
        Thread.sleep(1000);
        Print.textln("Thank you for coming here! I hope to see you again soon!");
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"The Ruthless Gamble (Entry Fee: $50)","Back in the Race(Cost: $150; Win: $600)","Go back"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            if(Stats.money<50){
                Print.textln("Nuh uh mate, you can't even pay the entry fees, forget 'bout gamblin'");
                Thread.sleep(2000);
                Print.textln("Don't mess with us bookies. Now shoo!");
            }
            else {
                Print.textln("Gambling is subject to market risks. Read all scheme related documents carefully...\n");
                Thread.sleep(2000);
                Stats.money -= 50;
                boolean ifFirst=true, ifFail=true;

                while(ifFail) {
                    ifFail=gamble(ifFirst);
                    ifFirst=false;
                }
            }
        }
        else if(choice==2){
            if(Stats.money<150){
                Print.textln("You're not gonna get that horse for free, come back when you have enough, aight?");
            }
            else {
                Print.textln("Buckle Up!!");
                Thread.sleep(2200);
                Print.textln("Put on your cowboy hats and leather boots, because we're gonna rock the dance floor!");
                Thread.sleep(2000);
                Stats.money -= 150;
                race();
            }
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

    private static void horseList() throws InterruptedException {
        System.out.println();
        Print.textln("CowBoy Codey:\n**DIALOGUE**");
        Print.textln();
        Thread.sleep(2500);
        Print.lineln("-",20);
        Print.textln("Horse 1: Red Raptor\nRaces Won: 18\nStrength: \nRemarks: ");
        Print.line("-",20);
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",20);
        Print.textln("Horse 2: EuroStar Unicorn\nRaces Won: 9\nStrength: \nRemarks: ");
        Print.line("-",20);
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",20);
        Print.textln("Horse 3: Blue Bandit\nRaces Won: 22\nStrength: \nRemarks: ");
        Print.line("-",20);
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",20);
        Print.textln("Horse 4: Inky Pinky\nRaces Won: 14\nStrength: \nRemarks: ");
        Print.line("-",20);
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",20);
        Print.textln("Horse 5: Gold Flake\nRaces Won: 9\nStrength: \nRemarks: ");
        Print.line("-",20);
        Print.textln();
    }

    private static boolean gamble(boolean ifFirst) throws InterruptedException, IOException {
        String horse;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(ifFirst) {
            Print.textln("CowBoy Codey:\nChoose a horse to gamble your stakes on!");
            horseList();
        }
        else
            Print.textln("CowBoyCodey:");
        Thread.sleep(1500);
        Print.textln("Sooo....Spoilt for choices...Aren't you? Choose a horse number you'd like to place your bet on");
        Print.textln("You can tell me if you wanna exit to back out of this!");
        Print.textln("Response: ");
        horse=Input.String();
        Thread.sleep(1000);
        if(horse.toLowerCase().contains("exit")){
            options();
        }
        while(Integer.parseInt(horse)==0 || Integer.parseInt(horse)>5)
        {
            Print.textln("You need to enter a horse number from available options");
            Print.textln("Response: ");
            horse=Input.String();
        }
        Random rand = new Random();
        Print.textln("Okay! So, you've decided to bet on Horse "+horse+".\nLet's see if you're lucky enough or you return home with a duck!");
        Thread.sleep(1000);
        Print.text("Place your bet: ");
        double bet=Input.Double();
        Thread.sleep(1500);
        if(bet>Stats.money){
            Print.textln("You should have enough buckies before messing with us bookies!");
            Scene.choice(new String[]{"Place a lower bet","Go back"});
            int ch=Input.Int();
            if(ch==1){
                return true;
            }
            else {
                options();
            }
        }
        Print.textln("CowBoy Codey: Are you ready to loOoOsE?");
        Print.text("Response: ");
        br.readLine();
        Thread.sleep(1000);
        System.out.println();
        Print.textln("What a great sunny day here in OKTown,\nI would have been in some beach in Hawaii but here I am serving you rich heads");
        System.out.println();
        Thread.sleep(2500);
        Print.textln("Turn your bull-heads towards the race course because the powerful horses are out of their stables,\nready to rock & roll!");
        System.out.println();
        Thread.sleep(4000);
        for(int i=1;i<=4;i++){
            Print.textln("Horse "+rand.nextInt(6)+" has taken the lead");
            Thread.sleep(2500);
        }
        int winhorse=rand.nextInt(6);
        if(winhorse==0)
            winhorse=1;
        Print.textln("Horse "+winhorse+" has taken the final lead, crossed the end line & won the RaceCon 2020!");
        Thread.sleep(1500);

        if(winhorse==Integer.parseInt(horse))
        {
            Print.textln("\nYou! Yes You! Just got won the Grand RaceCon Gamble Jackpot!");
            Stats.money+=bet;
            Thread.sleep(1500);  
        }
        else
        {
            Print.textln("\nYou looooose!");
            Stats.money-=bet;
            Thread.sleep(1500);
        }
        Print.textln("Press any key to continue when you're done admiring your luck..");
        br.readLine();
        options();
        return false;
    }

    private static void race() throws InterruptedException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Print.textln("CowBoy Codey:\nI fear you aren't trained to ride a horse, yet.");
        Print.textln("Go, ride a Unicorn, kid....");
        Print.textln("Respond: ");
        br.readLine();
        options();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}