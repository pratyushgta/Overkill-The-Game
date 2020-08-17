package Buildings;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class StationemVigilum //Yeah...we made it super difficult for you to understand what the class name means lmao
{
    public static void exec1() throws InterruptedException, IOException { //First time main run method of comisaria
        Scene.make("Flippin Sheriff Station","Put your hands up in the air....and dance..",null,Num.round(Stats.money,2),true,Stats.HP,true);
        Thread.sleep(1000);
        Print.lineln("-",46);
        Print.textln("The Police Station is still Under Construction");
        Print.lineln("-",46);
        Print.textln("Don't think that no one's watchin you....");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}
