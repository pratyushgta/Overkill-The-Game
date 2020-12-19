package UI;
import Overkill_Engine.*;
import Backend.Stats;
import Minigames.*;
import java.io.IOException;
import City.Downtown.*;
import City.North.*;
import City.South.*;
import City.East.*;
import City.West.*;

/**
 * This class contains methods to allow you to explore the OKTown.
 * Click on RunTemp class to play the game.
 * Since the game is still in development, various features might not function as intended.
 */
public class QuickStart{
    private static void options() throws InterruptedException, IOException { //First time main run method of LuckyBucky
        Scene.make("THE FABULOUS OK TOWN","The Valley of Death Welcomes You!",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        Print.textln();
        Print.header("EXPLORE THE CITY!");
        Print.textln("Where would you like to go?");
        Scene.choice(new String[]{"Downtown","North Point","South: Party Island","East Hills","West Bank","Exit"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            Downtown.main(new String[]{});
            options();
        }
        else if(choice==2){
            NorthZone.main(new String[]{});
            options();
        }
        else if(choice==3){
            SouthZone.main(new String[]{});
            options();
        }
        else if(choice==4){
            EastZone.main(new String[]{});
            options();
        }
        else if(choice==5){
            WestZone.main(new String[]{});
            options();
        }
        else if(choice==6){
            Print.textln("Thank You for visiting The Fabulous OKTown. Hope to see you soon!");
        }
        else{
            Print.error("Invalid Input");
            Thread.sleep(1000);
            options();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        options();
    }
}

