package City.North;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class NorthZone {
    public static void main(String[] args) throws IOException, InterruptedException  {
        Scene.clear();
        Print.header("NORTH ZONE","*");
        Scene.choice(new String[]{"Safehouse","Gun Point","Netizens C@fe","NorthZone Metro"});
        int choice = Input.Int();
        if(choice==1){
            Safehouse.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==2){
            GunPoint1.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==3){
            NetizensCafe.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==4){
            NorthMetro.main(new String[]{});
            main(new String[]{});
        }
        else{
            main(new String[]{});
        }   
    }
}

