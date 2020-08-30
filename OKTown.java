/**
 * This class contains methods to allow you to quickly test various features of the game.
 * Click on Run class to play the game. 
 * Since the game is still in development, various features might not function as intented.
 */
import Overkill_Engine.*;
import Backend.Stats;
import Buildings.*;
import Minigames.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OKTown{
    public static void options() throws InterruptedException, IOException { //First time main run method of LuckyBucky
        Scene.make("THE FABULOUS OK TOWN","The Valley of Death Welcomes You!",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        Print.textln();
        Print.lineln("-",19);
        Print.textln("QUICK TRAVEL KIOSK");
        Print.lineln("-",19);
        Print.textln("Where would you like to go?");
        Scene.choice(new String[]{"Safehouse","Lucky Bucky","RaceCon","Police Station","Hospital","Exit"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            Safehouse.main();
            options();
        }
        else if(choice==2){
            LuckyBucky.main();
            options();
        }
        else if(choice==3){
            RaceCon.main();
            options();
        }
        else if(choice==4){
            StationemVigilum.main();
            options();
        }
        else if(choice==5){
            MedischCentrum.main();
            options();
        }
        else if(choice==6){
            Print.textln("Thank You for visiting The Fabulous OKTown. Hope to see you soon!");
        }
        else{
            Print.textln("Invalid Input");
            Thread.sleep(1000);
            options();
        }
    }
}

