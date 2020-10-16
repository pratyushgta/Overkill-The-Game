package UI;
import Assets.*;
import Backend.Stats;
import City.North.*;
import Overkill_Engine.Input;
import Overkill_Engine.Print;
import Overkill_Engine.Save;
import Overkill_Engine.Scene;
import java.io.*;

/**
 * Not the main class of the game. If you are a user, WTF are you doing here? Go to the Run class and do as instructed pls.
 * Version: 0.0.7 Developement Build: September Update 
 */
public class mainMenu {
    public static void main(String[] args) throws IOException, InterruptedException  { 
        while(true) {
            Scene.clear();
            Print.header("OVERKILL","~-");
            Scene.choice(new String[]{"PLAY","SETTINGS","CREDITS","QUIT GAME"});
            int choice = Input.Int();
            if (choice == 1)
                play();
            else if (choice == 2)
                settings();
            else if (choice == 3)
                credits();
            else if (choice == 4)
                break;
            else {
                Print.randomln(new String[]{"Your input seems to be incorrect. You have been given another chance to try again",
                        "The choice is between a few numbers, I thought you were smart enough to understand that",
                        "The Game: *Gives choice between a few simple natural numbers*\nThe Stupid User: *Enters some number out of range*"});
                main(new String[]{});
            }
        }
        System.exit(0);
    }

    private static void play() throws IOException, InterruptedException {
        Scene.clear();
        Print.header("PLAY","-");
        Scene.choice(new String[]{"START A NEW ADVENTURE","LOAD GAME","GO BACK","QUICK START"});
        int choice = Input.Int();
        if(choice==1) {
            if(Save.SaveExists())
                Save.delete();
            Save.make();
            Introduction.main(new String[]{});
        }
        else if(choice==2) {
            if (Save.SaveExists()) {
                Print.text("Loading Saved Game...");
                Thread.sleep(1000);
                Stats.loadFromSave();
                Safehouse.main(new String[]{});
            }
            else{
                Print.error("Save file does not exist or has been tampered with. Starting a new game instead");
                Thread.sleep(2000);
                Save.make();
                Introduction.main(new String[]{});
            }
        }
        else if(choice==4) {
            OKTown.main(new String[]{});
        }
        else{
            mainMenu.main(new String[]{});
        }
    }

    private static void settings() throws IOException, InterruptedException {
        Scene.clear();
        Print.header("SETTINGS");
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
            settings();
        }
        else if(choice==2){
            Print.header("Game Version: September Update 2 | v0.0.7 Development Build");
            Thread.sleep(3000);
            settings();
        }
        else if(choice==3) {
            Scene.clear();
            main(new String[]{});
        }
        else{
            Print.randomln(new String[]{"Your input seems to be incorrect. You have been given another chance to try again",
                    "The choice is between a few numbers, I thought you were smart enough to understand that",
                    "Choice = simple.\nYou = stupid."});
            settings();
        }
    }

    private static void credits() throws InterruptedException, IOException {    //credits here.
        Thread.sleep(2000);
        Print.header("OVERKILL: We don't know what's too much","~-");
        Print.textln("\nA passion project by Pratyush Kumar and Rahil Shaban\n");
        Thread.sleep(2000);
        Print.textln("CREATIVE DIRECTOR\nPratyush Kumar\n");
        Thread.sleep(2000);
        Print.textln("OVERKILL ENGINE HANDCRAFTED BY\nRahil Shaban\n");
        Thread.sleep(2000);
        Print.textln("PROGRAMMERS\nPratyush Kumar\nRahil Shaban\n");
        Thread.sleep(2000);
        Print.textln("JAVA IDEs USED FOR DEVELOPMENT\nJetBrains IntelliJ IDEA\nBlueJ\n");
        Thread.sleep(2000);
        Print.textln("Thanks to GitHub for their services");
        mainMenu.main(new String[]{});
    }
}
