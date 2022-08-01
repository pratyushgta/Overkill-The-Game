package City.Downtown;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Downtown{
    public static void main(String[] args) throws IOException, InterruptedException  {
        Scene.clear();
        Print.header("DOWNTOWN","*");
        Scene.choice(new String[]{"Death Valley Health Center","Flippin Sheriff Station","Central Station"});
        Print.text("Response: ");
        int choice = Input.Int();
        if(choice==1){
            MedischCentrum.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==2){
            StationemVigilum.main(new String[]{});
            main(new String[]{});
        }
        else if(choice==3){
            EstacioCentral.main(new String[]{});
            main(new String[]{});
        }
        else{
            main(new String[]{});
        }   
    }
}

