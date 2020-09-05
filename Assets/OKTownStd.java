package Assets;
import Overkill_Engine.*;
import Backend.Stats;
import Buildings.*;
import Minigames.*;
import java.io.IOException;

/**
 * This class contains methods to allow you to play the regular version of the game.
 * Click on Play class to play the game.
 * Since the game is still in development, various features might not function as intented.
 */
public class OKTownStd{
    private static void options() throws InterruptedException, IOException { //First time main run method of LuckyBucky
        Scene.make("THE FABULOUS OK TOWN","The Valley of Death Welcomes You!",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        Print.textln();
        Print.header("QUICK TRAVEL KIOSK","-");
        Print.textln("Where would you like to go?");
        Scene.choice(new String[]{"Safehouse","Lucky Bucky","RaceCon","Police Station","Hospital","GunPoint","Exit"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            Safehouse.main(new String[]{});
            options();
        }
        else if(choice==2){
            LuckyBucky.main(new String[]{});
            options();
        }
        else if(choice==3){
            RaceCon.main(new String[]{});
            options();
        }
        else if(choice==4){
            StationemVigilum.main(new String[]{});
            options();
        }
        else if(choice==5){
            MedischCentrum.main(new String[]{});
            options();
        }
        else if(choice==6){
            GunPoint.main(new String[] {});
            options();
        }
        else if(choice==7){
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

