package Buildings;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Safehouse {
    public static void exec1() throws InterruptedException, IOException { //First time main run method of ropyaH qach
        Scene.make("Safehouse","Home-not-so-sweet home.",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,true,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        options();
        Print.textln("Seeya");
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"Rest in Peace","Player Stats","Save Game","Load Game","Go Back"});
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
            Thread.sleep(1500);
            loadgame();
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
        Print.textln("Yay! You are now as fresh as daisy!");
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
        Print.textln("You have: "+Stats.money+"\nYour HP: "+Stats.HP+"\nTime:\nCurrent Weapon: "+Stats.weapon);
        Print.lineln("-",20);
        Print.textln("Press any key when you are done mesmerizing the stats..");
        br.readLine();
        options();
    }

    private static void savegame() throws InterruptedException, IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy\tHH.mm");
        Date dateobj = new Date();
        String printTime=sdf.format(dateobj);
        Print.lineln("-",45);
        Print.textln("Game Saved Successfully @"+printTime);
        Print.lineln("-",45);
        Thread.sleep(2000);
        Print.textln("Press any key to go back");
        br.readLine();
        options();
    }

    private static void loadgame() throws InterruptedException, IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Print.lineln("-",20);
        Print.textln("No Load Game Found");
        Print.lineln("-",20);
        Thread.sleep(2000);
        Print.textln("Press any key to go back");
        br.readLine();
        options();
    }

    public static void main(/*String[] args*/) throws IOException, InterruptedException {
        exec1();
    }
}

