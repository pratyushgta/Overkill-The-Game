package Overkill_Engine;
/**
 * Write a description of class Print here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Print
{
    public static void text(String s){
        System.out.print(s);
    }

    public static void textln(String s){
        System.out.println(s);
    }

    public static void error(String s){
        System.out.println("Error: "+s);
    }

    public static void systemError(int error_code, String error_message){
        System.out.println("Error "+error_code+": "+error_message);
    }

    public static void line(String a, int length){
        int numberOfTimesToPrintFull=length/a.length();
        for(int i=1;i<=numberOfTimesToPrintFull;i++){
            text(a);
        }
        int numberOfTimesToPrintOne=length%a.length();
        for(int j=0; j<=numberOfTimesToPrintOne-1;j++){
            text(Character.toString(a.charAt(j)));
        }
    }
    public static void lineln(String a, int length){
        int numberOfTimesToPrintFull=length/a.length();
        for(int i=1;i<=numberOfTimesToPrintFull;i++){
            text(a);
        }
        int numberOfTimesToPrintOne=length%a.length();
        for(int j=0; j<=numberOfTimesToPrintOne-1;j++){
            text(Character.toString(a.charAt(j)));
        }
        textln("");
    }

    public static void lineAndText(String a, int length, String text){
        if(length>text.length()){
            int effectiveLength=length-text.length();  //a="--",length=6,text="abc",effectLengt=3
            boolean ifOdd=false;
            if(effectiveLength%2==1){   //ifOdd=true
                ifOdd=true;
            }
            if(ifOdd){
                line(a, (effectiveLength/2)+1);//works correctly HERE
            }
            else{
                line(a, effectiveLength/2);
            }
            text(text);//works correctly
            line(a, effectiveLength/2);//Fucks up shit, 
        }
        else if(length<text.length()){
            line(text,length);
        }
        else{
            text(text);
        }
    }
    public static void lineAndTextln(String a, int length, String text){
        if(length>text.length()){
            int effectiveLength=length-text.length();  //a="--",length=6,text="abc",effectLengt=3
            boolean ifOdd=false;
            if(effectiveLength%2==1){   //ifOdd=true
                ifOdd=true;
            }
            if(ifOdd){
                line(a, (effectiveLength/2)+1);//works correctly HERE
            }
            else{
                line(a, effectiveLength/2);
            }
            text(text);//works correctly
            line(a, effectiveLength/2);//Fucks up shit, 
        }
        else if(length<text.length()){
            line(text,length);
        }
        else{
            text(text);
        }
        textln("");
    }
}
