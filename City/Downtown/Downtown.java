package City.Downtown;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import Overkill_Engine.AIEngine;

public class Downtown{
    private static AIEngine aiEngine = new AIEngine();

    public static void main(String[] args) throws IOException, InterruptedException  {
        Scene.clear();
        Print.header("DOWNTOWN","*");
        Scene.choice(new String[]{"Death Valley Health Center","Flippin Sheriff Station","Central Station", "AI Challenge"});
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
        else if(choice==4){
            aiChallenge();
            main(new String[]{});
        }
        else{
            main(new String[]{});
        }   
    }

    private static void aiChallenge() throws InterruptedException {
        Print.textln("AI Challenge: " + aiEngine.generateAIChallenge());
        Thread.sleep(2000);
        Print.textln("NPC Behavior: " + aiEngine.simulateNPCBehavior());
        Thread.sleep(2000);
        Print.textln("Dynamic Event: " + aiEngine.generateDynamicEvent());
        Thread.sleep(2000);
        Print.textln("AI Decision: " + aiEngine.makeDecision());
        Thread.sleep(2000);
    }
}
