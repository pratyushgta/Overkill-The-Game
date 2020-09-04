package UI;

import Assets.*;
import Backend.Stats;
import Buildings.*;
import Overkill_Engine.Input;
import Overkill_Engine.Print;
import Overkill_Engine.Save;
import Overkill_Engine.Scene;

import java.io.*;

/**
 * This is the main class of the game. Click on run on this class to play the game. 
 * Version: 4.0.0 Developement Build: August Update 
 */
public class mainMenu {
    public static void main(String[] args) throws IOException, InterruptedException  {
        Print.header("OVERKILL","~-");
        Scene.choice(new String[]{"PLAY","CREDITS","QUIT GAME"});
        int choice = Input.Int();
        if(choice==1)
            play();
        else if(choice==2)
            credits();
        else if(choice==3)
            System.exit(0);

    }
    private static void play() throws IOException, InterruptedException {
        Scene.clear();
        Print.header("PLAY","-");
        Scene.choice(new String[]{"START A NEW ADVENTURE","LOAD GAME","GO BACK"});
        int choice = Input.Int();
        if(choice==1) {
            Save.make();
            OKTown.main(new String[]{});
        }
        else if(choice==2) {
            if (Save.SaveExists()) {
                Stats.loadFromSave();
                Safehouse.main(new String[]{});
            }
            else{
                Print.error("Save file does not exist. Starting a new game instead");
                Thread.sleep(2000);
                Save.make();
                OKTown.main(new String[]{});
            }
        }
        mainMenu.main(new String[]{});
    }
    private static void credits(){}//credits here.
}

