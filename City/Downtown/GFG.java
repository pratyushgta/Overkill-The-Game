package City.Downtown;
import java.io.*; 
import java.lang.*; 
import java.util.*; 
import Overkill_Engine.*;
import Backend.Stats;
import java.io.IOException;

class GFG { 

    // Function to add x in arr 
    public static void MostWanted(int n, String criminallist[], String crime[], String newCriminal, String newCrime, int tag) throws IOException, InterruptedException 
    { 
        String peoplelist[]= new String[n + 1]; 
        String crimes[]= new String[n+1];

        for (int i = 0; i < n; i++) 
        {
            peoplelist[i]= criminallist[i];
            crimes[i]= crime[i];
        }

        peoplelist[n]=newCriminal;
        crimes[n]=newCrime;

      
        
            Print.textln(Arrays.toString(peoplelist)+"\t\t"+Arrays.toString(crimes));
        
        //return newarr; 
    } 

    // Driver code 
    public static void CurrentCrimes(String[] args) throws IOException, InterruptedException 
    { 
        Print.textln();
        String currentCrimes="";
        String report="";
        int n = 6; 
        String[]criminallist={"Mark Panzee","Ella Vermeylin","Dimitri Rascolov","Stuart Bloom","Raju Singh","Aunt Funnypants"};
        String[]crime={"Terrorist","Murder","Drug Lord","Robbed Comic Book Store","Indian Scammer","Mass Killings"};
        if(currentCrimes.equals(""))
        {
            Print.textln("Officer Kelly: No crimes have been reported yet..");
            Print.textln("Respond: ");
            Input.String();
            Thread.sleep(1000);
            Print.textln("Officer Kelly: Would you like to report a crime? [Type yes or no]");
            Print.textln("Respond: ");
            String choice=Input.String();
            if(choice.toLowerCase().contains("yes")){
                System.out.println("Officer Kelly: Yooo...really? What? When? Where? Howww? Tell meeeh eeevrryything..");
                Thread.sleep(1500);
                System.out.println("Officer Kelly: So..describe the crime..");
                Print.textln("Respond: ");
                report=Input.String();
                Thread.sleep(1500);
                System.out.println("Officer Kelly: Gotcha! When and where did this incident exactly happen?");
                Print.textln("Respond: ");
                Input.String();
                Thread.sleep(1000);
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
                    int tag=1;
                    MostWanted(n,criminallist,crime,criminalName,newCrime,tag);
                }
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