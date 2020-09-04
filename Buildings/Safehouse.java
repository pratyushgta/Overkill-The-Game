package Buildings;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Safehouse {
    private static void exec1() throws InterruptedException, IOException { //First time main run method of ropyaH qach
        Scene.make("Safehouse","Home-not-so-sweet home.",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        options();
        Print.textln("See ya");
        Thread.sleep(2000);
        Scene.clear();
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"Rest in Peace","Player Stats","Save Game","Quit to Main Menu","Go Back"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            Thread.sleep(1500);
            rest();
        }
        else if(choice==2){
            Thread.sleep(1500);
            playerstats();
        }
        else if(choice==3){
            Thread.sleep(1500);
            savegame();
        }
        else if(choice==4){
            Print.textln("All unsaved changes will be lost.");
            Scene.choice(new String[]{"Save and Quit","Quit without saving"});
            choice=Input.Int();
            if(choice==1)
                savegame();
        }
        else if(choice==5){
            Thread.sleep(1500);
        }
        else{
            Print.textln("Enter what is asked correctly. Don't cause any more trouble for this old receptionist.");
            options();
        }
    }

    private static void rest() throws InterruptedException, IOException {

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Print.textln("ZZZzzzzzzzzz");
        Thread.sleep(1500);
        Print.textln("zzzzzzzzZZZZ");
        Thread.sleep(1500);
        Print.textln("ZZZzzzzzzzzz");
        Thread.sleep(1500);
        Print.textln("Yay! You are now as fresh as a daisy!");
        Thread.sleep(1500);
        Print.text("Blabber something real quick.. : ");
        Thread.sleep(1000);
        br.readLine();
        Stats.HP=100;
        options();

    }

    private static void playerstats() throws InterruptedException, IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Print.lineln("-",20);
        Print.textln("You have: "+Num.round(Stats.money,2)+"\nYour Hp: "+Stats.HP+"\nCurrent Weapon: "+Stats.weapon+"\nTime: "+TimeModule.printableTime(Stats.time));
        if(!Stats.wanted){
            Print.textln("Wanted Status: You are not on the wanted list");
        }
        else
        {
            Print.textln("Wanted Status: The cops are looking for you in every nook and corner...");
        }
        Print.lineln("-",20);
        Print.textln("Press any key when you are done mesmerizing the stats..");
        br.readLine();
        options();
    }

    private static void savegame() throws InterruptedException, IOException {
        Stats.writeToSave();
        Print.textln("The game has been saved");
        options();
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}

