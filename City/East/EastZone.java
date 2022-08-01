package City.East;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class EastZone {
    public static void main(String[] args) throws IOException, InterruptedException  {
        Scene.clear();
        Print.header("EAST HILLS","*");
        Scene.choice(new String[]{"RaceCon","GunPoint","East Hills Metro"});
        Print.text("Response: ");
        int choice = Input.Int();
        if(choice==1){
            RaceCon.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==2){
            GunPoint2.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==3){
            EastHillsMetro.main(new String[]{});
            main(new String[]{});
        }
        else{
            main(new String[]{});
        }   
    }
}