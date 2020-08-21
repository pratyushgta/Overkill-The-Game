package Backend;

import Overkill_Engine.Save;

import java.io.IOException;

public class Stats {
    public static String name="default_player";
    public static double HP=100.0d;
    public static double money=500.0d;
    public static boolean wanted=false;
    public static String weapon="fists";
    public static String labels;
    public static void loadFromSave() throws IOException {
        String[] save= Save.read();
        name=save[0];
        HP=Double.parseDouble(save[1]);
        money=Double.parseDouble(save[2]);
        wanted=Boolean.parseBoolean(save[3]);
        weapon=save[4];
        labels=save[5];
    }
}
