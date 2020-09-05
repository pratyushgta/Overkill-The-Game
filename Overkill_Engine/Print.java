package Overkill_Engine;
/**
 * This class contains all methods regarding printing and outputting simple single line text and patterns.
 *
 * @author BoltonB07
 * @version 0.0.0
 */
public class Print
{
    public static void text(String text){ System.out.print(text); }
    public static void text(boolean bool){
        System.out.print(bool);
    }
    public static void text(int num){
        System.out.print(num);
    }
    public static void text(char character){
        System.out.print(character);
    }
    public static void text(double num){
        System.out.print(num);
    }
    public static void text(float num){
        System.out.print(num);
    }
    public static void text(long num){
        System.out.print(num);
    }
    public static void textln(String text){
        System.out.println(text);
    }
    public static void textln(boolean bool){
        System.out.println(bool);
    }
    public static void textln(int num){
        System.out.println(num);
    }
    public static void textln(char character){
        System.out.println(character);
    }
    public static void textln(double num){
        System.out.println(num);
    }
    public static void textln(float num){
        System.out.println(num);
    }
    public static void textln(long num){
        System.out.println(num);
    }
    public static void textln(){
        System.out.println();
    }
    public static void header(String headerText,String headerLineMaker){
        Print.textln();
        Print.lineln(headerLineMaker,headerText.length());
        Print.textln(headerText.toUpperCase().trim());
        Print.lineln(headerLineMaker,headerText.length());
        Print.textln();
    }
    public static void error(String error_message){

        System.out.println("Error: "+error_message.trim());
    }

    public static void error(int error_code, String error_message){
        System.out.println("Error "+error_code+": "+error_message.trim());
    }

    public static void line(String line, int length){
        line=line.trim();
        int numberOfTimesToPrintFull=length/line.length();
        for(int i=1;i<=numberOfTimesToPrintFull;i++){
            text(line);
        }
        int numberOfTimesToPrintOne=length%line.length();
        for(int j=0; j<=numberOfTimesToPrintOne-1;j++){
            text(Character.toString(line.charAt(j)));
        }
    }
    public static void lineln(String line, int length){
        line(line,length);
        textln();
    }
    public static void line(String line, int length, String text){
        line=line.trim();text=text.trim();
        if(length>text.length()){
            int effectiveLength=length-text.length();
            boolean ifOdd=false;
            if(effectiveLength%2==1){
                ifOdd=true;
            }
            if(ifOdd){
                line(line, (effectiveLength/2)+1);
            }
            else{
                line(line, effectiveLength/2);
            }
            text(text);
            line(line, effectiveLength/2);
        }
        else if(length<text.length()){
            line(text,length);
        }
        else{
            text(text);
        }
    }
    public static void lineln(String line, int length, String text){
        line(line,length,text);
        textln();
    }
}
