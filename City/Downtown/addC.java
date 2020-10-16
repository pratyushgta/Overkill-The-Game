package City.Downtown;
import java.io.*; 
import java.lang.*; 
import java.util.*; 
import Overkill_Engine.*;
import Backend.Stats;
import java.io.IOException;

class addC { 

    // Function to add x in arr 
    public static void MostWanted(int addtag) throws IOException, InterruptedException 
    { 
        String[]peoplelist={"Mark Panzee","Ella Vermeylin","Dimitri Rascolov","Stuart Bloom","Raju Singh","Aunt Funnypants"};
        String[]crime={"Terrorist","Murder","Drug Lord","Robbed Comic Book Store","Indian Scammer","Mass Killings"};
        if(addtag==1){
            System.out.println("Officer Kelly: Okay...do you suspect someone? If yes, write the name down... ");
            Print.textln("Respond: ");
            String criminalName=Input.String();
            Thread.sleep(1000);
            StringTokenizer st=new StringTokenizer(criminalName);
            int count=st.countTokens();
            if(count>2||criminalName.toLowerCase().contains("no")||criminalName.toLowerCase().contains("none"))
            {
                System.out.println("Officer Kelly: Cool!"); 
                Print.textln("Respond: ");
                Input.String();
                Thread.sleep(1000);
                //options();
            }
            else
            {
                System.out.println("Officer Kelly: Explain their crime in a word..!"); 
                Print.textln("Respond: ");
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
                for(int i=0;i<peoplelist.length;i++)
                {
                    Print.textln(peoplelist[i]+"\t\t\t"+crime[i]);
                }
            }
        } 
    }

    // Driver code 
    public static void CurrentCrimes(String[] args) throws IOException, InterruptedException 
    { 
        Print.textln();
        String currentCrimes="";
        String report=""; 
        if(currentCrimes.equals(""))
        {
            Print.textln("Officer Kelly: No crimes have been reported yet..");
            Print.textln("Respond: ");
            Input.String();
            Thread.sleep(1000);
            Print.textln("Officer Kelly: Would you like to report a new crime? [Type yes or no]");
            Print.text("Respond: ");
            String choice=Input.String();
            if(choice.toLowerCase().contains("yes")){
                System.out.println("Officer Kelly: You'll have tell me everything...what? where? how? when?");
                Thread.sleep(1500);
                System.out.println("Officer Kelly: So..describe the crime..");
                Print.textln("Respond: ");
                report=Input.String();
                Thread.sleep(1500);
                System.out.println("Officer Kelly: Gotcha! When and where did this incident exactly happen?");
                Print.textln("Respond: ");
                Input.String();
                Thread.sleep(1000);
                int tag=1;
                MostWanted(tag);

            }
            else
            {
                System.out.println("Officer Kelly: Go away now. Comeback when you really have some 'work'");
                Thread.sleep(1500);
                //options();
            }
        }
    } 
} 