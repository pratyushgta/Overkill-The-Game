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
        Scene.clear();
    }

    private static void options() throws IOException, InterruptedException {
        Print.header("Today's Menu","-");
        Random rand = new Random();
        int opt=rand.nextInt(2);
        if(opt==0){
            Scene.choice(new String[]{"Dish 1","Dish 2","Dish 3","Nah, I'm full!"});
            Print.textln("Response:");
            int choice=Input.Int();
            if(choice==1)
            {
                Print.textln();
            }
            else if (choice==2)
            {
                Print.textln();
            }
            else if (choice==3)
            {
                Print.textln();
            }
            else if (choice==4)
            {
                Print.textln();
            }
            else
            {
            }
        }
        else if(opt==1){
            Scene.choice(new String[]{"Dish 1","Dish 2","Dish 3","Dish 4","Nah, I'm full!"});
            Print.textln("Response:");
            int choice=Input.Int();
            if(choice==1)
            {
                Print.textln();
            }
            else if (choice==2)
            {
                Print.textln();
            }
            else if (choice==3)
            {
                Print.textln();
            }
            else if (choice==4)
            {
                Print.textln();
            }
            else
            {
            }
        }
        if(opt==2){
            Scene.choice(new String[]{"Dish 1","Dish 2","Dish 3","Dish 4","Nah, I'm full!"});
            Print.textln("Response:");
            int choice=Input.Int();
            if(choice==1)
            {
                Print.textln();
            }
            else if (choice==2)
            {
                Print.textln();
            }
            else if (choice==3)
            {
                Print.textln();
            }
            else if (choice==4)
            {
                Print.textln();
            }
            else
            {
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}

