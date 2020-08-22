package Backend;

import Overkill_Engine.Save;

import java.io.IOException;

public class Stats {
    public static String name="default_player";
    public static double HP=100.0d;
    public static double money=500.0d;
    public static boolean wanted=false;
    public static String weapon="fists";
    public static int[] time={12,00};
    public static String labels;
    public static void loadFromSave() throws IOException {
        name=Save.getName();
        HP=Save.getHP();
        money=Save.getMoney();
        wanted=Save.getWanted();
        weapon=Save.getWeapon();
        time=Save.getTime();
        labels=Save.getLabels();
    }
}
