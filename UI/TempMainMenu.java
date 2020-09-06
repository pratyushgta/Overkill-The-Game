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
 * Not the main class of the game. If you are a user, WTF are you doing here? Go to the Run class and do as instructed pls.
 * Version: 0.0.5 Developement Build: September Update 
 */
public class TempMainMenu {
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
            if(Save.SaveExists())
                Save.delete();
            Save.make();
            OKTownStd.main(new String[]{});
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
                OKTownStd.main(new String[]{});
            }
        }
        TempMainMenu.main(new String[]{});
    }

    private static void settings() throws IOException, InterruptedException {
        Scene.clear();
        Print.header("SETTINGS","-");
        Scene.choice(new String[]{"DELETE SAVE","CHECK VERSION","GO BACK"});
        int choice = Input.Int();
        if(choice==1) {
            if (Save.SaveExists()) {
                Print.textln("Type 'RESET' if you're 101% sure you want to reset the game.\nRemember, you'll lose all your progress & achievements. This cannot be undone.");
                String str=Input.String();
                if(str.toLowerCase().contains("reset")){
                    Save.delete();
                    Thread.sleep(1000);
                    Print.textln("Your game is now deleted. It's gone like Unus Annus");
                    Thread.sleep(1500);
                    settings();
                }
                else{
                    Print.error("Invalid Input");
                    Thread.sleep(1000);
                    settings();
                }
            }
            else{
                Print.textln("No Saved File exists.");
                Thread.sleep(1500);
                settings();
            }
        }
        else if(choice==2){
            Print.textln("Game Version: September Update 1 | v0.0.5 Developement Build");
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

