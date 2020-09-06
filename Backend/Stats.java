package Backend;

import Overkill_Engine.Save;

import java.io.IOException;

public class Stats {
    public static String name="default_player";
    public static double HP=100.0d;
    public static double money=500.0d;
    public static boolean wanted=false;
    public static String weapon="Fists";
    public static int[] time={12,0};
    public static String labels="";
    public static void loadFromSave() throws IOException {
        name=Save.getName();
        HP=Save.getHP();
        money=Save.getMoney();
        wanted=Save.getWanted();
        weapon=Save.getWeapon();
        time=Save.getTime();
        labels=Save.getLabels();
    }
    public static void writeToSave() throws IOException {
        Save.setName(name);
        Save.setHP(HP);
        Save.setMoney(money);
        Save.setWanted(wanted);
        Save.setWeapon(weapon);
        Save.setTime(time);
        Save.removeAllLabels();
        Save.addLabel(labels);
    }

}
