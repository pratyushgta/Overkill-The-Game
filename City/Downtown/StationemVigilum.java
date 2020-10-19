package City.Downtown;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.IOException;
import java.util.*;

public class StationemVigilum //Yeah...we made it super difficult for you to understand what the class name means lmao
{
    private static void exec1() throws InterruptedException, IOException { //First time main run method of comisaria
        Scene.make("Flippin Sheriff Station","Eyes on the city...",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,false,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        if(Stats.wanted)
        {
            arrest();
        }
        else
        {
            System.out.println();
            Print.textln("Officer:\nIf you're not a robber, how may I help you?");
            Thread.sleep(1500);
            options();
            //Thread.sleep(1000);
            Print.textln("May the force be with you. Thank you for coming here!");
            Thread.sleep(1500);
        }
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"View Recent Crimes","Search Police Records","View Most Wanted","Go Back"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            Thread.sleep(1500);
            Print.textln("Ahhh...this city is filled with more criminals than hairs on your head...");
            Thread.sleep(1000);
            CurrentCrimes();
        }
        else if(choice==2){
            Thread.sleep(1500);
            Print.textln("What better way could you find to get the number of your crush...isn't it?");
            Thread.sleep(2000);
            SearchRecords();
        }
        else if(choice==3){
            Thread.sleep(1500);
            Print.textln("A'ight....lemme pull out the list real quick..");
            Thread.sleep(1000);
            MostWanted();
        }
        else if(choice==4){
        }
        else{
            Print.textln("Really? You thought there's really an option "+choice+" ?");
            Thread.sleep(1500);
            Print.textln("Do that again and I'll arrest you for wastin' ma thime...");
            Thread.sleep(1500);
            options();
        }
    }

    private static void MostWanted() throws IOException, InterruptedException {
        String[]serialno={"7841458","9511260","8834697","7312591","6317428","1957322"};
        String[]peoplelist={"Mark Panzee","Ella Vermeylen","Dimitri Rasclov","Stuart Bloom","Raju Singh","Aunt Funnypants"};
        String[]crime={"Terrorist","Murder","Human Trafficking","Robbed Comic Book Store","Indian Scammer","Mass Killings"};
        String[]height={"6'44''|120lbs.","5'69''|250lbs.","5'32''|100lbs.","4'99''|89lbs.","5'51''|155lbs.","4'73''|248lbs."};
        String[]date={"02/01/2018","30/02/2017","29/04/2008","24/09/2007","31/03/2005","15/12/2019"};
        Print.textln();
        Print.textln("Officer Kelly:\nOkie-Dokie...so these are the 'heroes' of our town....");
        Thread.sleep(1500);
        Print.textln();
        Print.lineln("-",150);
        Print.textln("Serial\t\tName\t\t\tHeight & Weight\t\tDate\t\t\tCrime");
        Print.lineln("-",150);
        for(int i=0;i<peoplelist.length;i++)
        {
            Print.textln("#"+serialno[i]+"\t"+peoplelist[i]+"\t\t"+height[i]+"\t\t"+date[i]+"\t\t"+crime[i]);
        }
        Thread.sleep(4500);
        Print.textln();
        Print.textln("Officer Kelly: Are you done gazing at the list?");
        Print.text("Respond: ");
        Input.String();
        options();
    }

    private static void CurrentCrimes() throws IOException, InterruptedException {
        Print.textln();
        String[]serialno={"PI730258","DT554413","WE289707","EH312591"};
        String[]recent_crimes={"Theft at 5th Avenue, Party Island","President's child Linderbergh Kidnapped","Bank Robbery at West End","Grand Theft Auto at East Hills"};
        Thread.sleep(1500);
        Print.textln("Officer JohnnyPig: Willy-wonka! Here are the recent crimes... ");
        Thread.sleep(1500);
        Print.lineln("-",30);
        Print.textln("RECENT CRIMES");
        Print.lineln("-",30);
        for(int i=0;i<serialno.length;i++)
        {
            Print.textln("#"+serialno[i]+"\t"+recent_crimes[i]);
        }
        Thread.sleep(4500);
        Print.textln();
        Print.textln("Officer JohnnyPig: Now shooo");
        Print.text("Respond: ");
        Input.String();
        options();
    }

    private static void SearchRecords() throws IOException, InterruptedException {
        Print.textln();
        String[]peoplelist={"Mark Panzee","Ella Vermeylen","Dimitri Rascolov","Stuart Bloom","Raju Singh","Aunt Funnypants"};
        String[]crime={"Sands Casino Terror Attack","Murder","Human Trafficking","Robbed Comic Book Store","Scams-over-call","Mass Killings"};
        Print.textln("Officer Tenpenny: So..can I know the person's name whom you're searching for?");
        Print.text("Response: ");
        String search=Input.String();
        int flag=0;
        for(int i=0;i<peoplelist.length;i++)
        {
            if(search.equalsIgnoreCase(peoplelist[i]))
            {
                Print.textln();
                Thread.sleep(1000);
                Print.textln("RECORD FOUND");
                Thread.sleep(1000);
                Print.textln("Analysing Criminal Backgrounds. Hold on...");
                Thread.sleep(2000);
                Print.lineln("#",30);
                System.out.println(peoplelist[i]+" has commited "+crime[i]);
                flag=1;
                Print.lineln("#",30);
                Thread.sleep(2000);
            }
        }
        if(flag==0)
        {
            Thread.sleep(1000);
            System.out.println();
            System.out.println("Officer Tenpenny: Umm....this guy isnt there...A clean record, indeed!");
        }
        Print.textln();
        Thread.sleep(1500);
        Print.textln("Officer Tenpenny: C'mon let's get movin'");
        Print.text("Respond: ");
        Input.String();
        Thread.sleep(1000);
        options();
    }

    private static void arrest() throws IOException, InterruptedException {
        Print.textln();
        Print.lineln("#",7);
        Print.textln("WASTED");
        Print.lineln("#",7);
        Thread.sleep(1000);
        Print.textln("You'll be staying here for another 12 hours.\nAll you weapons have been confiscated and\nsome of your money taken away for bail proceedings.");
        Thread.sleep(2500);
        Stats.wanted=false;
        Stats.money-=(0.2*Stats.money);
        Print.textln();
        Print.textln("You're now as free as a bird...");
        Print.textln("Respond: ");
        Input.String();
        Thread.sleep(1000);
        options();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}