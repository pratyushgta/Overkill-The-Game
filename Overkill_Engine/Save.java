package Overkill_Engine;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Format:
 * [name]
 * [HP]
 * [money]
 * [weapon]
 * [wanted]
 * [time]
 *
 * [labels...]
 */
public class Save {
    public static void make() throws IOException {
        PrintWriter file = new PrintWriter("SaveFile.txt", StandardCharsets.UTF_8);
        FileWriter fileWriter = new FileWriter("SaveFile.txt");
        BufferedWriter br=new BufferedWriter(fileWriter);
        br.write("default_player\n100.0\n0.0\nnoweapon\nfalse\n12:00");
        br.close();
        file.close();
    }
     public static String[] read() throws IOException {
         String[] saveData = new String[7];
         BufferedReader br= new BufferedReader(new FileReader("SaveFile.txt"));
         Scanner sc = new Scanner(br.readLine());
         saveData[0] = sc.next();
         sc = new Scanner(br.readLine());
         saveData[1] = sc.next();
         sc = new Scanner(br.readLine());
         saveData[2] = sc.next();
         sc = new Scanner(br.readLine());
         saveData[3] = sc.next();
         sc = new Scanner(br.readLine());
         saveData[4] = sc.next();
         sc = new Scanner(br.readLine());
         saveData[5] = sc.next();
         String labelLines;
        String labels="";
        while((labelLines= br.readLine())!=null){
            sc=new Scanner(labelLines);
            while(sc.hasNext()) {
                labels = labels.concat("\n" + sc.next());
            }
        }
        saveData[6]=labels;
        br.close();
        return saveData;
     }
     public static String getName() throws IOException {
        String[] save = read();
        return save[0];
     }
    public static double getHP() throws IOException {
        String[] save = read();
        return Double.parseDouble(save[1]);
    }
    public static double getMoney() throws IOException {
        String[] save = read();
        return Double.parseDouble(save[2]);
    }
    public static String getWeapon() throws IOException {
        String[] save = read();
        return save[3];
    }
    public static boolean getWanted() throws IOException {
        String[] save = read();
        return Boolean.parseBoolean(save[4]);
    }
    public static int[] getTime() throws IOException {
        String[] save = read();
        int[] time=new int[2];
        StringTokenizer st=new StringTokenizer(save[5],":");
        for (int i = 0; i < 2; i++) {
            time[i]= Integer.parseInt(st.nextToken());
        }
        return time;
    }
    public static String getLabels() throws IOException {
        String[] save = read();
        return save[6];
    }
    public static boolean SaveExists(){
        File file=new File("SaveFile.txt");
        return file.exists();
    }
    public static void setName(String newName) throws IOException {
        String[] oldSave=Save.read();
        PrintWriter file = new PrintWriter("SaveFile.txt");
        file.println(newName);
        for(int i = 1;i<=oldSave.length-1;i++)
            file.println(oldSave[i]);
        file.close();
    }
    public static void setHP(double newHP) throws IOException {
        String[] oldSave=Save.read();
        PrintWriter file = new PrintWriter("SaveFile.txt");
        file.println(oldSave[0]);
        newHP=Num.round(newHP,2);
        file.println(newHP);
        for(int i = 2;i<=oldSave.length-1;i++)
            file.println(oldSave[i]);
        file.close();
    }
    public static void setMoney(double newMoney) throws IOException {
        String[] oldSave=Save.read();
        PrintWriter file = new PrintWriter("SaveFile.txt");
        for (int j = 0; j < 2; j++) {
            file.println(oldSave[j]);
        }
        newMoney=Num.round(newMoney,2);
        file.println(newMoney);
        for(int i = 3;i<=oldSave.length-1;i++)
            file.println(oldSave[i]);
        file.close();
    }
    public static void setWeapon(String newWeapon) throws IOException {
        String[] oldSave=Save.read();
        PrintWriter file = new PrintWriter("SaveFile.txt");
        for (int j = 0; j < 3; j++) {
            file.println(oldSave[j]);
        }
        file.println(newWeapon);
        for(int i = 4;i<=oldSave.length-1;i++)
            file.println(oldSave[i]);
        file.close();
    }
    public static void setWanted(boolean wanted) throws IOException {
        String[] oldSave=Save.read();
        PrintWriter file = new PrintWriter("SaveFile.txt");
        for (int j = 0; j < 4; j++) {
            file.println(oldSave[j]);
        }
        file.println(wanted);
        for (int i = 5; i < 7; i++) {
            file.println(oldSave[i]);
        }
        file.close();
    }
    public static void setTime(int[] time) throws IOException {
        String[] oldSave=Save.read();
        PrintWriter file = new PrintWriter("SaveFile.txt");
        for (int j = 0; j < 5; j++) {
            file.println(oldSave[j]);
        }
        file.println(TimeModule.printableTime(time));
        for(int i = 6;i<=oldSave.length-1;i++)
            file.println(oldSave[i]);
        file.close();
    }
    public static void addLabel(String label) throws IOException {
        if(!LabelExists(label)){
            String[] oldSave=Save.read();
            PrintWriter file=new PrintWriter("SaveFile.txt");
            for(int i = 0;i<=6;i++)
                file.println(oldSave[i]);
            file.println(label.toLowerCase());
            file.close();
        }
    }
    public static void removeAllLabels() throws IOException {
        String[] oldSave=Save.read();
        PrintWriter file=new PrintWriter("SaveFile.txt");
        for(int i = 0;i<=5;i++)
            file.println(oldSave[i]);
        file.close();
    }
    public static void removeLabel(String labelToRemove)  throws IOException{
        String[] oldSave=Save.read();
        PrintWriter file = new PrintWriter("SaveFile.txt");
        for(int i=0;i<=5;i++){
            file.println(oldSave[i]);
        }
        String line;
        Scanner sc=new Scanner(oldSave[6]);
        while (sc.hasNext()) {
            if (!((line= sc.nextLine()).contains(labelToRemove.trim().toLowerCase()))) {
                file.println(line);
            }
        }
        file.close();
        sc.close();
    }
    public static boolean LabelExists(String labelToCheck) throws IOException {
        String labels=getLabels();
        return labels.contains(labelToCheck.toLowerCase());
    }
    public static void delete() throws IOException {
        Files.delete(Paths.get("SaveFile.txt"));
    }
}
