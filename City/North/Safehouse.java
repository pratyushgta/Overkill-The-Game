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

public class Safehouse {
    private static void exec1() throws InterruptedException, IOException { //First time main run method of ropyaH qach
        Scene.clear();
        Scene.make("Safehouse","Home-not-so-sweet home.",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        if(Tags.M1==true){
            introduction();
        }
        else{
            options();
        }
        Print.textln("See ya");
        Thread.sleep(1000);
        Scene.clear();
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"Rest in Peace","Player Stats","Save Game","Exit Safehouse","Quit to Main Menu"});
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
        else if(choice==5){
            Print.textln("All unsaved changes will be lost.");
            Scene.choice(new String[]{"Save and Quit","Quit without saving","Go Back"});
            choice=Input.Int();
            if(choice==1){
                if(Stats.wanted==true)
                    Stats.wanted=false;
                savegame();
                mainMenu.main(new String[]{});
            }
            else if(choice==2)
                mainMenu.main(new String[]{});
            else
                options();
        }
        else if(choice==4){
            NorthZone.main(new String[]{});
        }
        else{
            Print.textln("What were you even thinking huh?..that's not a valid option from the list...");
            options();
        }
    }

    private static void rest() throws InterruptedException, IOException {
        if(Stats.wanted==true)
            Stats.wanted=false;
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
        Print.text("C'mon..Blabber something real quick.. : ");
        Thread.sleep(1000);
        br.readLine();
        Stats.HP=100;
        options();
    }

    private static void playerstats() throws InterruptedException, IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Print.lineln("-",20);
        Print.textln("You have: "+Num.round(Stats.money,2)+"\nYour HP: "+Stats.HP+"\nGF: None..just like you don't have one in real life\nCurrent Weapon: "+Stats.weapon+"\nTime: "+TimeModule.printableTime(Stats.time));
        if(!Stats.wanted){
            Print.textln("Wanted Status: You are not on the wanted list");
        }
        else
        {
            Print.textln("Wanted Status: The cops are looking for you in every nook and corner...");
        }
        Print.lineln("-",20);
        Print.textln("Press any key when you are done mesmerizing the facts..");
        br.readLine();
        options();
    }

    private static void savegame() throws InterruptedException, IOException {
        Stats.writeToSave();
        Print.textln("Your progress has been saved! Enjoy!");
        Thread.sleep(1500);
        options();
    }

    private static void introduction() throws IOException, InterruptedException {
        Thread.sleep(3000);
        Print.textln("\nYou:  This...is...the mansion?");
        Thread.sleep(3000);
        Print.textln("Dave: Just a temporary place. The mansion is coming, brother. That's the dream... follow me.");
        Thread.sleep(5500);
        Print.textln("\n[HERE COMES A SMALL TUTORIAL ABOUT SAFEHOUSE]");
        Thread.sleep(5000);
        Tags.M1=false;
        exec1();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}

/*private static void savegame() throws InterruptedException, IOException {
if(Save.SaveExists()){
Print.textln("An earlier save already exists.\nPress [1] if you would like to overwrite the already saved file. Otherwise press any key to go back.");
int ch=Input.Int();
if(ch==1){
Save.delete();
Stats.writeToSave();
Print.textln("The game has been saved");
Thread.sleep(1000);
options();
}
else{
options();
}
}
else{
Stats.writeToSave();
Print.textln("The game has been saved");
Thread.sleep(1000);
options();
}
}*/

