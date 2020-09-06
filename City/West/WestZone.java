package City.West;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class WestZone {
    public static void main(String[] args) throws IOException, InterruptedException  {
        Scene.clear();
        Print.header("HOVE BEACH","*");
        Scene.choice(new String[]{"Fishing","CrustyCrab's","NorthZone Metro"});
        int choice = Input.Int();
        if(choice==1){
            Fishing.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==2){
            CrustyCrabs.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==3){
            WestBankMetro.main(new String[]{});
            main(new String[]{});
        }
        else{
            main(new String[]{});
        }   
    }
}