package City.South;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class SouthZone {
    public static void main(String[] args) throws IOException, InterruptedException  {
        Print.header("PARTY ISLAND","*");
        Scene.choice(new String[]{"Fishing","George's Grubs Diner","Party Island Metro"});
        int choice = Input.Int();
        if(choice==1){
            LuckyBucky.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==2){
            GeorgesGrubs.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==3){
            PartyIslandMetro.main(new String[]{});
            main(new String[]{});
        }
        else{
            main(new String[]{});
        }   
    }
}