package Assets;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.IOException;
import City.North.*;
/**
 * 
 * This is a defunct class, earlier used for Intro/ Chapter 1 Missions in Development Builds v0.0.7 & v0.0.8
 * Temporary class for reference. Will be removed later. 
 * Last Updated: Developement Build v.0.0.9 | December Update 
 */
public class Introduction {
    public static void main(String[] args) throws IOException, InterruptedException  {
        Scene.clear();    
        Print.textln("Starting a new game...");
        Thread.sleep(2000);
        Print.textln("\nCreating a new world.....");
        Thread.sleep(3000);
        Print.textln("Pouring water in it....");
        Thread.sleep(2000);
        Print.textln("Growing vegetation...");
        Thread.sleep(2000);
        Print.textln("Waiting for the animals to grow..");
        Thread.sleep(3000);
        Print.textln("Sprinkling some humans to destroy everything.");
        Thread.sleep(3000);
        Print.textln("Loaded 99%. Taking time to load that 1% just to frustrate you...");
        Thread.sleep(4200);
        //M_Welcome.main(new String[]{}); 
    }
}
 