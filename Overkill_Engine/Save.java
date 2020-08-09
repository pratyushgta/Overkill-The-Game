package Overkill_Engine;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Save {
    public static void make() throws IOException {
        PrintWriter file = new PrintWriter("SaveFile.txt", StandardCharsets.UTF_8);
        FileWriter fileWriter = new FileWriter("SaveFile.txt",true);
        BufferedWriter br=new BufferedWriter(fileWriter);
        br.write("name:\tnull\nlabel:\tstartGame\nHP:\t0.0\nmoney:\t0.0");
        br.close();
        file.close();
    }
     static String[] read() throws IOException {
        String[] saveData = new String[4];
        BufferedReader br= new BufferedReader(new FileReader("saveFile.txt"));
        Scanner sc=new Scanner(br.readLine().trim());
        sc.next();
        saveData[0]= sc.next();
         sc=new Scanner(br.readLine().trim());
         sc.next();
        saveData[1]= sc.next();
         sc=new Scanner(br.readLine().trim());
         sc.next();
        saveData[2]= sc.next();
         sc=new Scanner(br.readLine().trim());
         sc.next();
        saveData[3]= sc.next();
        sc.close();
        br.close();
        return saveData;
     }
     public static String getName() throws IOException {
        String[] name = read();
        return name[0];
     }
    public static String getLabel() throws IOException {
        String[] name = read();
        return name[1];
    }
    public static double getMoney() throws IOException {
        String[] name = read();
        return Double.parseDouble(name[2]);
    }
    public static double getHP() throws IOException {
        String[] name = read();
        return Double.parseDouble(name[3]);
    }
    public static boolean ifSaveExists(){
        File file=new File("SaveFile.txt");
        return file.exists();
    }
    public static void write(String name, String label,double HP, double money) throws IOException {
        PrintWriter file = new PrintWriter("SaveFile.txt");
        file.println("name:\t"+name.trim()+"\nlabel:\t"+label.trim()+"\nHP:\t"+HP+"\nmoney:\t"+money);
        file.close();
    }

    public static void main(String[] args) throws IOException { //test psvm method; DELETE AFTER TESTS ARE DONE!
        make();
        System.out.println(ifSaveExists());
        write("BooBooBaaBaa","buckyshouse",90,230);
        Print.textln(getName());
        Print.textln(getLabel());
        Print.textln(getMoney());
        Print.textln(getHP());
    }
}
