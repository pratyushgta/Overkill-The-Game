package UI;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.IOException;
import City.North.*;
/**
 * 
 * This class contains the cool transition which appears before a new game begins.
 * In this text animation, the game's name is being printed in a star pattern.
 * This code has been contributed by GeeksForGeeks: https://www.geeksforgeeks.org/print-the-alphabets-a-to-z-in-star-pattern/
 */
public class LoadGame {

    // Number of lines for the alphabet's pattern 
    static int height = 5; 

    // Number of character width in each line 
    static int width = (2 * height) - 1; 

    // Function to find the absolute value of a number D 
    private static int abs(int d) throws InterruptedException, IOException
    { 
        return d < 0 ? -1 * d : d; 
    } 
    // Function to print the pattern of 'O' 
    private static void printO() throws InterruptedException, IOException
    { 
        int i, j, space = (height / 3); 
        int width = height / 2 + height / 5 + space + space; 
        for (i = 0; i < height; i++)  
        { 
            for (j = 0; j <= width; j++)  
            { 
                if (j == width - abs(space)|| j == abs(space)) 

                    System.out.printf("*"); 
                else if ((i == 0 || i == height - 1) && j > abs(space) && j < width - abs(space)) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            if (space != 0 && i < height / 2)  
            { 
                space--; 
            } 
            else if (i >= (height / 2 + height / 5)) 
                space--; 
            System.out.printf("\n"); 
        } 
        System.out.print("\n");
    } 
    // Function to print the pattern of 'V' 
    private static void printV() throws InterruptedException, IOException
    { 
        int i, j, counter = 0; 
        for (i = 0; i < height; i++)  
        { 
            for (j = 0; j <= width; j++)  
            { 
                if (j == counter || j == width - counter - 1)
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            counter++; 
            System.out.printf("\n"); 
        } 
        System.out.print("\n");
    } 
    // Function to print the pattern of 'E' 
    private static void printE() throws InterruptedException, IOException
    { 
        int i, j; 
        for (i = 0; i < height; i++)  
        { 
            System.out.printf("*"); 
            for (j = 0; j < height; j++)  
            { 
                if ((i == 0 || i == height - 1) || (i == height / 2  && j <= height / 2)) 
                    System.out.printf("*"); 
                else
                    continue; 
            } 
            System.out.printf("\n"); 
        } 
        System.out.print("\n");
    } 
    // Function to print the pattern of 'R' 
    private static void printR() throws InterruptedException, IOException
    { 
        int i, j, half = (height / 2); 
        for (i = 0; i < height; i++)  
        { 
            System.out.printf("*"); 
            for (j = 0; j < width; j++)  
            { 
                if ((i == 0 || i == half) && j < (width - 2)) 
                    System.out.printf("*"); 
                else if (j == (width - 2) && !(i == 0 || i == half)) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            System.out.printf("\n"); 
        } 
        System.out.print("\n");
    } 
    // Function to print the pattern of 'K' 
    private static void printK() throws InterruptedException, IOException
    { 
        int i, j, half = height / 2, dummy = half; 
        for (i = 0; i < height; i++) 
        { 
            System.out.printf("*"); 
            for (j = 0; j <= half; j++) 
            { 
                if (j == abs(dummy)) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            System.out.printf("\n"); 
            dummy--; 
        } 
        System.out.print("\n");
    } 
    // Function to print the pattern of 'I' 
    private static void printI() throws InterruptedException, IOException
    { 
        int i, j; 
        for (i = 0; i < height; i++)  
        { 
            for (j = 0; j < height; j++) 
            { 
                if (i == 0 || i == height - 1) 
                    System.out.printf("*"); 
                else if (j == height / 2) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            System.out.printf("\n"); 
        } 
        System.out.print("\n");
    } 
    // Function to print the pattern of 'L' 
    private static void printL() throws InterruptedException, IOException
    { 
        int i, j; 
        for (i = 0; i < height; i++)  
        { 
            System.out.printf("*"); 
            for (j = 0; j <= height; j++) 
            { 
                if (i == height - 1) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            System.out.printf("\n"); 
        } 
        System.out.print("\n");
    } 

    public static void main(String[] args) throws IOException, InterruptedException  {
        Scene.clear();
        Thread.sleep(1000);
        printO();
        Thread.sleep(1300);
        printV();
        Thread.sleep(1300);
        printE();
        Thread.sleep(1300);
        printR();
        Thread.sleep(1300);
        printK();
        Thread.sleep(1300);
        printI();
        Thread.sleep(1300);
        printL();
        Thread.sleep(1300);
        printL();
        Thread.sleep(2000);
        Assets.M_Welcome.main(new String[]{}); 
    }
}