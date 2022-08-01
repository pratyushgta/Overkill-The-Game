package City.North;
import Overkill_Engine.*;
import Backend.Stats;
import Backend.Tags;
import UI.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NetizensCafe {
    private static void exec1() throws InterruptedException, IOException { //First time main run method of Internet Cafe
        Scene.clear();
        Scene.make("@ Netizens @","The house of 'Pure' internet!",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        options();
        Thread.sleep(1000);
        Print.textln("See you s@@n!");
        Thread.sleep(1000);
        Scene.clear();
    }

    private static void options() throws IOException, InterruptedException {
        /* Scene.choice(new String[]{"Rest in Peace","Player Stats","Save Game","Exit Safehouse","Quit to Main Menu"});
        Print.text("Response: ");
        int choice=Input.Int();*/
        Print.header("SETTING UP COMPUTERS. CHECK BACK LATER!","@");
        System.out.println("\n");
        Thread.sleep(2000);
        Print.header("0: Go Back","-");
        int ch=Input.Int();
        if(ch==0){
        }
        else{
            options();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}
