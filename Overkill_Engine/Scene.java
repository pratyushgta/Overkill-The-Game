package Overkill_Engine;
/**
 * Write a description of class Scene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scene
{
    public static void clear(){
        System.out.println('\u000C');
    }

    public static void make(String currentLoc, String describeLoc, String choicePrompt, double money, boolean showMoney, double HP, boolean ShowHP){
        if(currentLoc!=null){
            Print.textln("");
            Print.lineln("*",currentLoc.length());
            Print.textln(currentLoc.toUpperCase());
            Print.lineln("*",currentLoc.length());
        }
        if(describeLoc!=null){
            Print.textln(describeLoc);
            Print.textln("");
        }
        if(choicePrompt!=null){
            Print.textln(choicePrompt);
            Print.textln("");
        }
        if(showMoney){
            Print.textln("You have $"+money);
            Print.textln("");
        }
        if(ShowHP){
            Print.textln("Your HP: "+HP);
        }
    }

    public static void choice(String[] choices){
        Print.textln("");
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
        Print.textln("");
    }
}
