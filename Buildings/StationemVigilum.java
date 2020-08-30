package Buildings;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.IOException;

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
            Thread.sleep(1000);
            Print.textln("May the force be with you. Thank you for coming here!");
        }
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"View Current Crimes","Search Police Records","View Most Wanted List","Go Back"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            Thread.sleep(1500);
            Print.textln("You could have literally turned on the TV to view the crimes...");
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
            Print.textln("Ayyyy youu...c'mon! Don't waste ma time");
            Thread.sleep(1500);
            Print.textln("There are others who are waiting to die...");
            Thread.sleep(1500);
            Print.textln("Enter what is asked correctly. Don't cause any more trouble for this old receptionist.");
            options();
        }
    }

    private static void MostWanted() throws IOException, InterruptedException {
        Print.textln();
        Print.textln("Officer Kelly:\nOkie-Dokie...so these are the 'heroes' of our town....");
        Thread.sleep(1500);
        String[]peoplelist={"Raju","Golu","Bheem"};
        String[]crime={"Theft","Theft","Theft"};
        Print.textln();
        Print.lineln("-",25);
        Print.textln("NAME\t\tCrime");
        Print.lineln("-",25);
        for(int i=0;i<peoplelist.length;i++)
        {
            Print.textln(peoplelist[i]+"\t\t"+crime[i]);
        }
        Thread.sleep(1500);
        Print.textln();
        Print.textln("Officer Kelly: Are you done gazing at the list?");
        Print.textln("Respond: ");
        Input.String();
        options();
    }

    private static void CurrentCrimes() throws IOException, InterruptedException {
        Print.textln();
        Print.textln("Officer Kelly: No crimes have been reported yet..");
        Print.textln("Respond: ");
        Input.String();
        Thread.sleep(1000);
        options();
    }

    private static void SearchRecords() throws IOException, InterruptedException {
        Print.textln();
        String[] peoplelist={"Raju","Golu","Bheem"};
        String[]crime={"Theft","Theft","Theft"};
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
                Thread.sleep(1000);
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
        Print.textln("Respond: ");
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

    public static void main(/*String[] args*/) throws IOException, InterruptedException {
        exec1();
    }
}
