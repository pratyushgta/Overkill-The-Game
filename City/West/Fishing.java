package City.West;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fishing //restaurant 1
{
    private static void exec1() throws InterruptedException, IOException { //First time main run method of ropyaH qach
        Scene.make("FISHING","Salmon!",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        options();
        Print.textln("Goodbye!");
        Thread.sleep(2000);
        Scene.clear();
    }

    private static void options() throws IOException, InterruptedException {
        //Scene.choice(new String[]{"Rest in Peace","Player Stats","Save Game","Quit to Main Menu","Go Back"});
        //Print.textln("Response:");
        //int choice=Input.Int();

        Print.header("NEW BOATS HAVEN'T ARRIVED YET\nPIER UNDER CONSTRUCTION","-");
        Thread.sleep(1500);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}

