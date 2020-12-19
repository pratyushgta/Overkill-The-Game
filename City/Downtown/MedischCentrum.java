package City.Downtown;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MedischCentrum //Yeah...we made it super difficult for you to understand what the class name means lmao
{
    private static void exec1() throws InterruptedException, IOException { //First time main run method of ropyaH qach
        Scene.make("Death Valley Health Center","The only place where being 'positive' is a nightmare.",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,false,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        if(Stats.HP<=10)
        {
            emergency();
        }
        else
        {
            System.out.println();
            Print.textln("Receptionist:\nWelcome back for the 20th time this freakin month!\nCombiflam or Metformin? What would you like to order?");
            Thread.sleep(1500);
            options();
            Thread.sleep(1000);
            Print.textln("Hospital ceiling are boring to look at...Just sayin'...Thank you for coming here!");
        }
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"Regular Check-Up (Cost: $75; Time: 60 mins)","Emergency (Cost: $169; Time: 20 mins)","Chit-Chat with Doc(Cost: $50; Time: 30 mins","Go Back"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            Thread.sleep(1500);
            if(Stats.money<75)
                Print.error("This isn't charity. No free healthcare!");
            else {
                Print.textln("After exiting this room, turn next right, then turn left, then make a sharp left followed by a left again to the lift lobby\nand from there, take the sixth lift to sixteenth floor. Once you reach there, \nturn left, then right, up the stairs to the OPD no.5!");
                Thread.sleep(8000);
                Stats.money -= 75;
                checkup();
            }
        }
        else if(choice==2){
            Thread.sleep(1200);
            if(Stats.money<169)
                Print.error("Free healthcare is injurious to our health.");
            else {
                Print.textln("Okay!...Let's make this aqap..as quick as possible..");
                Thread.sleep(1000);
                Stats.money -= 200;
                emergency();
            }
        }
        else if(choice==3){
            Thread.sleep(1500);
            if(Stats.money<50)
                Print.error("Blabbering with our docs isn't free, dumbo!");
            else {
                Print.textln("GET AWAY PEOPLE! Depressed person on the wayyyyyy...vroooommmmmmm");
                Thread.sleep(2000);
                Stats.money -= 50;
                councilor();
            }
        }
        else if(choice==4){
        }
        else{
            Print.textln("Ayyyy youu...c'mon! Don't waste ma time");
            Thread.sleep(1500);
            Print.textln("There are others who are waiting to die...");
            Thread.sleep(1500);
            Print.textln("Enter what is asked correctly. Don't cause any more trouble for this fat receptionist.");
            options();
        }
    }

    private static void checkup() throws InterruptedException, IOException {
        System.out.println();
        Print.textln("Doctor Strange: Swallowed dog-bones? Drank mercury? Fractured your hips? What troubleth's thee mine own taxpay'r? ");
        Thread.sleep(1000);
        Print.text("Respond: ");
        Input.String();
        Thread.sleep(1000);
        Print.textln("Doctor Strange: No problem! Just take 700 grams of Aspirin & 12 tablets of Morphine\nand you'll be neighing like a horse again!");
        Thread.sleep(2000);
        Print.text("Respond: ");
        Input.String();
        Thread.sleep(1000);
        Stats.HP+=55;
        if(Stats.HP>100){
            Stats.HP=100;
        }
        options();
    }

    private static void emergency() throws InterruptedException, IOException {
        System.out.println();
        if(Stats.HP<10){
            Print.textln("Hope: ALL CLEAR! Mooooove awaayyy...broke person rushing in....");
            Thread.sleep(1000);
            Print.text("Corresponder 101... Person lost his brains in a car attack...bleeding like a volcanic eruption...repeat...injury level 9999\nrushing OPD 14");
            Thread.sleep(2000);
            Print.textln("Surgeon: Nurse, pass on the scissors plesse...pliars...grass choppers...lawn mower...75gsm sand paper...aanndd...\n We're done! Operation successful!");
            Thread.sleep(3000);
            Print.text("Respond: ");
            Input.String();
            Thread.sleep(1000);
            Stats.HP=100;
            options();
        }
        else
        {
            Print.textln("Hope: I'll repair you with a snap....Tell me your probss..");
            Thread.sleep(1000);
            Print.text("Respond: ");
            Input.String();
            Thread.sleep(700);
            Print.textln("Hope: Okay!...here you go! I've stiched all your problems ;)");
            Thread.sleep(1500);
            Stats.HP=100;
            options();
        }
    }

    private static void councilor() throws InterruptedException, IOException {
        System.out.println();
        Print.textln("The hospital hasn't appointed a councilor to hear your bs, yet...");
        Thread.sleep(750);
        Print.textln("Would you like to apply for the post tho?");
        Print.text("Respond: ");
        Input.String();
        Thread.sleep(800);
        Print.textln("Ahh..How can a person who itself needs a councilor, be a councilor?");
        Thread.sleep(1000);
        Print.textln("Nevermind...come back later!");
        Thread.sleep(1000);
        Stats.money+=50;
        options();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}

