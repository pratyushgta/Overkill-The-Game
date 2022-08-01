package City.West;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import City.Downtown.*;
import City.South.*;
import City.East.*;
import City.North.*;
public class WestBankMetro {
    private static void exec1() throws InterruptedException, IOException { 
        Scene.clear();
        Scene.make("Town Metro","Going places, together.",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,true,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000); 
        options();
        Print.textln("See ya");
        Thread.sleep(2000);
        Scene.clear();
    }

    private static void options() throws IOException, InterruptedException {
        Print.header("Beach Line",">");
        Print.textln("Welcome to West Banks Station. Where would you like to travel to?");
        Thread.sleep(1000);
        Scene.choice(new String[]{"Downtown\t\t$2","North Point\t\t$5","South: Party Island\t$5","East Hills\t\t$8","Go Back"});
        Print.text("Response: ");
        int choice=Input.Int();
        if(choice==1){
            Thread.sleep(1500);
            Stats.money-=2;
            Downtown.main(new String[]{});
        }
        else if(choice==2){
            Thread.sleep(1500);
            Stats.money-=5;
            NorthZone.main(new String[]{});
        }
        else if(choice==3){
            Thread.sleep(1500);
            Stats.money-=5;
            SouthZone.main(new String[]{});
        }
        else if(choice==4){
            Thread.sleep(1500);
            Stats.money-=8;
            EastZone.main(new String[]{});
        }  
        else if(choice==5){
            WestZone.main(new String[]{});
        }
        else{
            Print.textln("It's a small world. There's no where else you can go other than that.");
            options();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}