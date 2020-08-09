package Overkill_Engine;

public class Num {
    public static double round(double number,int howManyPlaces){
        return ((Math.round(number*Math.pow(10,howManyPlaces)))/Math.pow(10,howManyPlaces));
    }
    public static int random(int howManyDigits){
        return (int) (Math.random()*(Math.pow(10,howManyDigits)));
    }
}
