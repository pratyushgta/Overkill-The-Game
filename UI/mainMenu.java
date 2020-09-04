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
        Scene.choice(new String[]{"PLAY","SETTINGS","CREDITS","QUIT GAME"});
        int choice = Input.Int();
        if(choice==1)
            play();
        else if(choice==2)
            settings();
        else if(choice==3)
            credits();
        else if(choice==4)
            System.exit(0);
        else
            main(new String[]{});
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
                Print.text("Loading Saved Game...");
                Thread.sleep(1000);
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

    private static void settings() throws IOException, InterruptedException {
        Scene.clear();
        Print.header("SETTINGS","-");
        Scene.choice(new String[]{"CLEAR LOAD GAME","CHECK VERSION","GO BACK"});
        int choice = Input.Int();
        if(choice==1) {
            Print.textln("Type RESET if you're 101% sure you want to reset the game.\nRemember, you'll lose all your progress & achievements. This cannot be undone."); 
            String str=Input.String();
            if(str.toLowerCase().contains("reset")){
                Save.removeAllLabels();
                Thread.sleep(1000);
                Print.textln("Your game is as fresh as a lily!");
                Thread.sleep(1500);
                settings();
            }
            else{
                Print.error("Invalid Input");
                Thread.sleep(1000);
                settings();
            }
        }
        else if(choice==2){
            Print.textln("Game Version: August Update 4 | v4.1.0 Developement Build");
            Thread.sleep(2000);
            settings();
        }
        else{
            Scene.clear();
            main(new String[]{});
        }
    }

    private static void credits(){}//credits here.
}

