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
            Print.textln("Ahhh...this city is filled with more criminals than the hairs on your head...");
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
            int tag=0;
            MostWanted(tag);
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

    private static void MostWanted(int addtag) throws IOException, InterruptedException {
        String[]peoplelist={"Mark Panzee","Ella Vermeylen","Dimitri Rascolov","Stuart Bloom","Raju Singh","Aunt Funnypants"};
        String[]crime={"Terrorist","Murder","Drug Lord","Robbed Comic Book Store","Indian Scammer","Mass Killings"};
        String []newpeoplelist;
        String []newcrime;
        if(addtag==0){
            Print.textln();
            Print.textln("Officer Kelly:\nOkie-Dokie...so these are the 'heroes' of our town....");
            Thread.sleep(1500);
            Print.textln();
            Print.lineln("-",25);
            Print.textln("NAME\t\t\tCrime");
            Print.lineln("-",25);
            for(int i=0;i<peoplelist.length;i++)
            {
                Print.textln(peoplelist[i]+"\t\t\t"+crime[i]);
            }
            Thread.sleep(1500);
            Print.textln();
            Print.textln("Officer Kelly: Are you done gazing at the list?");
            Print.text("Respond: ");
            Input.String();
            options();
        }
        else
        {
            int add=0;

            if(add>0)
            {
                newpeoplelist=new String[add];
                newcrime=new String[add];
            }
            else
            {
                newpeoplelist=new String[peoplelist.length+1];
                newcrime=new String[crime.length+1];
            }

            System.out.println("Officer Kelly: Okay...do you suspect someone? If yes, write the name down... ");
            Print.text("Respond: ");
            String criminalName=Input.String();
            Thread.sleep(1000);
            StringTokenizer st=new StringTokenizer(criminalName);
            int count=st.countTokens();
            if(count>2||criminalName.toLowerCase().contains("no")||criminalName.toLowerCase().contains("none"))
            {
                System.out.println("Officer Kelly: Okay..Cool!"); 
                criminalName="Unknown Persons";
                Thread.sleep(1000);
            }

            System.out.println("Officer Kelly: Explain their crime in a word..!"); 
            Print.text("Respond: ");
            String newCrime=Input.String();
            Thread.sleep(1000);
            int len=peoplelist.length;

            String temp1[]=new String[len];
            String temp2[]=new String[len];

            for(int i=0;i<temp1.length;i++)
            {
                temp1[i]=peoplelist[i];
                temp2[i]=crime[i];
            }
            peoplelist=new String[len+1];
            crime=new String[len+1];
            for(int i=0;i<temp1.length;i++)
            {
                peoplelist[i]=temp1[i];
                crime[i]= temp2[i];
            }
            peoplelist[len]=criminalName;
            crime[len]=newCrime;
            /*for(int i=0;i<peoplelist.length;i++)
            {
            Print.textln(peoplelist[i]+"\t\t\t"+crime[i]);
            }*/
            System.out.println("Officer Kelly: Thank You for your inputs. We'll kick  the arse of the accused once we find em'"); 
            Print.text("Respond: ");
            Input.String();
            Thread.sleep(1000);
            //addtag=0;
            options();
        }
    } 

    private static void CurrentCrimes() throws IOException, InterruptedException {
        Print.textln();
        String currentCrimes="";
        String report=""; 
        if(currentCrimes.equals(""))
        {
            Print.textln("Officer Kelly: No crimes have been reported yet..");
            Print.text("Respond: ");
            Input.String();
            Thread.sleep(1000);
            Print.textln("Officer Kelly: Would you like to report a new crime? [Type yes or no]");
            Print.text("Respond: ");
            String choice=Input.String();
            if(choice.toLowerCase().contains("yes")){
                System.out.println("Officer Kelly: You'll have tell me everything...what? where? how? when?");
                Thread.sleep(1500);
                System.out.println("Officer Kelly: So..describe the crime..");
                Print.text("Respond: ");
                report=Input.String();
                Thread.sleep(1500);
                System.out.println("Officer Kelly: Gotcha! When and where did this incident exactly happen?");
                Print.text("Respond: ");
                Input.String();
                Thread.sleep(1000);
                int tag=1;
                MostWanted(tag);
            }
            else
            {
                System.out.println("Officer Kelly: Go away now. Comeback when you really have some 'work'");
                Thread.sleep(1500);
                options();
            }
        }
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

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}
