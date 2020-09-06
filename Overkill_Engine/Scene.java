package Overkill_Engine;
/**
 * This class contains methods regarding scenes and quickly generates scenes and options
 *
 * @author BoltonB07
 * @version 0.0.0
 */
public class Scene
{
    public static void clear(){
        System.out.println('\u000C');
    }

    public static void make(String currentLoc, String describeLoc, String choicePrompt, double money, boolean showMoney, double HP, boolean showHP, String weapon, boolean showWeapon,boolean wanted, boolean showWanted,String time,boolean showTime){
        Scene.clear();
        if(currentLoc!=null){
            currentLoc=currentLoc.trim();
            Print.header(currentLoc,"*");
        }
        if(describeLoc!=null){
            describeLoc=describeLoc.trim();
            Print.textln(describeLoc+"\n");
        }
        if(choicePrompt!=null){
            choicePrompt=choicePrompt.trim();
            Print.textln(choicePrompt+"\n");
        }
        if(showMoney){
            Print.textln("You have $"+money);
        }
        if(showHP){
            Print.textln("Your HP: "+HP);
        }
        if(showWeapon){
            Print.textln("Your weapon: "+weapon);
        }
        if(showWanted){
            Print.textln((wanted)?"Wanted status: You are wanted":"Wanted status: You are not in the wanted list");
        }
        if(showTime){
            Print.textln("The time is "+time);
        }
    }

    public static void choice(String[] choices){
        Print.textln();
        for(int k=0;k<=choices.length-1;k++){
            choices[k]=choices[k].trim();
        }
        int longest=0, longestIndex=0;
        String longestOptionNumber;
        for(int j=0;j<=choices.length-1;j++){
            if(choices[j].length()>longest){
                longest=choices[j].length();
                longestIndex=j;
            }
        }
        longestOptionNumber=String.valueOf(longestIndex+1);
        Print.lineln("-",longest+longestOptionNumber.length()+2);
        for(int i=0;i<=choices.length-1;i++){
            Print.textln((i+1)+": "+choices[i]);
        }
        Print.lineln("-",longest+longestOptionNumber.length()+2);
        Print.textln();
    }
}
