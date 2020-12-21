package City.West;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CrustyCrabs //restaurant 1
{
    private static void exec1() throws InterruptedException, IOException { //First time main run method of ropyaH qach
        Scene.make("Crusty's Crabs","The finest Crabs in the city!",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        System.out.println();
        Print.textln("Kirk: Your crabs, my crabs, we all love Crusty's Crabs! ");
        Thread.sleep(2000);
        options();
        Thread.sleep(1000);
        Print.textln("Goodbye!");
        Thread.sleep(2000);
        Scene.clear();
        WestZone.main(new String[]{});
    }

    private static void options() throws IOException, InterruptedException {
        Random rand = new Random();
        int opt=rand.nextInt(2);
        if(opt==0){
            menu1();
        }
        else if(opt==1){
            menu2();
        }
        if(opt==2){
            menu3();
        }
    }

    private static void menu1() throws IOException, InterruptedException {
        Print.header("Today's Menu","-");
        Scene.choice(new String[]{"Warf Shrimp Salad ($5; HP: +5 )","Toad in the Hole ($7; HP: +7 )","The Codfather ($12; HP: +10 )","Nah, I'm full!"});
        Print.textln("Response: ");
        int choice=Input.Int();
        if(choice==1)
        {
            Stats.money-=5;
            Thread.sleep(1000);
            Print.textln("Kirk: A'ight... here you go...A plate full of plants...");
            Thread.sleep(1500);
            Print.header("5 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=5;
            if(Stats.HP>100)
                Stats.HP=100;
            menu1();
        }
        else if (choice==2)
        {
            Stats.money-=7;
            Thread.sleep(1000);
            Print.textln("Kirk: Here's your order, sir!");
            Thread.sleep(1500);
            Print.header("7 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=7;
            if(Stats.HP>100)
                Stats.HP=100;
            menu1();
        }
        else if (choice==3)
        {
            Stats.money-=12;
            Thread.sleep(1000);
            Print.textln("Kirk: Our signature dish....hope you're loving it ;)");
            Thread.sleep(1500);
            Print.header("10 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=10;
            if(Stats.HP>100)
                Stats.HP=100;
            menu1();
        }
        else if (choice==4)
        {
        }
        else
        {
            Print.textln("Go learn maths first....");
            menu1();
        }
    }

    private static void menu2() throws IOException, InterruptedException {
        Print.header("Today's Menu","-");
        Scene.choice(new String[]{"Fish & Chips ($6; HP: +5)","Frying Nemo ($9; HP: +8)","Fiscoteque ($14; HP: +12)","Burrrrrp...I'm full!"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1)
        {
            Stats.money-=6;
            Thread.sleep(1000);
            Print.textln("Kirk: DIALOGUE PENDING");
            Thread.sleep(1500);
            Print.header("5 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=5;
            if(Stats.HP>100)
                Stats.HP=100;
            menu2();
        }
        else if (choice==2)
        {
            Stats.money-=9;
            Thread.sleep(1000);
            Print.textln("Kirk: DIALOGUE PENDING");
            Thread.sleep(1500);
            Print.header("8 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=8;
            if(Stats.HP>100)
                Stats.HP=100;
            menu2();
        }
        else if (choice==3)
        {
            Stats.money-=14;
            Thread.sleep(1000);
            Print.textln("Kirk: DIALOGUE PENDING");
            Thread.sleep(1500);
            Print.header("12 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=12;
            if(Stats.HP>100)
                Stats.HP=100;
            menu2();
        }
        else if (choice==4)
        {
        }
        else
        {
            Print.textln("I have a lot of customers to serve, please don't waste my thime...");
            menu2();
        }
    }

    private static void menu3() throws IOException, InterruptedException {
        Print.header("Today's Menu","-");
        Scene.choice(new String[]{"Sea Weed ($4; HP: 4)","Crab-O-Nara ($7; HP:7)","Codrophenia ($11; HP: 10)","Oh lord! No more..."});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1)
        {
            Stats.money-=4;
            Thread.sleep(1000);
            Print.textln("Kirk: DIALOGUE PENDING");
            Thread.sleep(1500);
            Print.header("4 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=4;
            if(Stats.HP>100)
                Stats.HP=100;
            menu3();
        }
        else if (choice==2)
        {
            Stats.money-=7;
            Thread.sleep(1000);
            Print.textln("Kirk: DIALOGUE PENDING");
            Thread.sleep(1500);
            Print.header("7 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=7;
            if(Stats.HP>100)
                Stats.HP=100;
            menu3();
        }
        else if (choice==3)
        {
            Stats.money-=11;
            Thread.sleep(1000);
            Print.textln("Kirk: DIALOGUE PENDING");
            Thread.sleep(1500);
            Print.header("10 HP Restored!","*");
            Thread.sleep(2000);
            Stats.HP+=10;
            if(Stats.HP>100)
                Stats.HP=100;
            menu3();
        }
        else if (choice==4)
        {
        }
        else
        {
            Print.textln("Can you not waste my thime? I have to take my crabbie to the doc...");
            menu3();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}

