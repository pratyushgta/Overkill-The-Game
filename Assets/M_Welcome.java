package Assets;
import Overkill_Engine.*;
import Backend.Stats;
import Backend.Tags;
import java.io.IOException;
import City.North.*;
/**
 * 
 * This class contains all the necessary methods and story for the Intro/ Chapter 1 Missions.
 * 
 */
public class M_Welcome{
    public static void main(String[] args) throws IOException, InterruptedException  {
        Scene.clear();
        Print.header("Welcome To The City","<>");
        Thread.sleep(2000);
        Print.textln("Dave:  Daddy's back, you people... Daddy's back!");
        Thread.sleep(4000);
        Print.textln("You:  Whooh yeah! Here she is...OKCity.");
        Thread.sleep(3500);
        Print.textln("Dave: Crazy place, <PLAYER NAME>");
        Thread.sleep(3500);
        Print.textln("You: You must be here since long...");
        Thread.sleep(4000);
        Print.textln("Dave: 10 years...They say, it is the land of opportunity. I always wanted to make it big...\nown a nice place, get a dog, a house... live the dream!");
        Thread.sleep(8000);
        Print.textln("You: So let's go...let's explore this so called 'land of opportunity'...\nsee some countryside, women, cars, parties...everything that you wrote in those wild emails that lured me here...");
        Thread.sleep(10000);
        Print.textln("Dave: The more you explore it, the more it gets wilder and wilder...So, lesss goo..we're going to rule the world!");
        Thread.sleep(5500);
        Print.textln("You: Okay. Is this a cab? Where's the sports car?");
        Thread.sleep(3000);
        Print.textln("Dave: Err, it's in the shop... come on!");
        Thread.sleep(2000);
        Print.textln("\n[EXPLORE MODULE COMES HERE. THE EXPLORE MODULE WILL TAKE THE USER THROUGH A MINI TOUR OF THE GAME AFTER WHICH SAFEHOUSE WILL LOAD]\n");
        Thread.sleep(7000); 
        Tags.M1=true;
        Safehouse.main(new String[]{});
    }
}

