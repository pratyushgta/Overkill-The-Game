package Overkill_Engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class contains all methods regarding input and interaction with the player
 *
 * @author BoltonB07
 * @version 0.0.0
 */
public class Input
{
    public static String String() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().trim();
    }
    public static double Double() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(br.readLine().trim());
    }
    public static int Int() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine().trim());
    }
    public static int Char() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt((br.readLine().trim()));
    }
    public static long Long() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return Long.parseLong(br.readLine().trim());
    }
    public static float Float() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return Float.parseFloat(br.readLine().trim());
    }
}
