package Overkill_Engine;
/**
 * Note: This class uses Military Time (24-Hour Format) 
 *
 * @author BoltonB07
 * @version 1.0.0
 */
public class TimeModule {
    public static int[] TimeChange(int[] time, int changeHour, int changeMin) {
        time[1] += changeMin;
        if (time[1] >= 60) {
            while (time[1] >= 60) {
                time[1] -= 60;
                time[0]++;
            }
        }
        if (time[1] < 0) {
            while (time[1] < 0) {
                time[1] += 60;
                time[0]--;
            }
        }
        time[0] += changeHour;
        if (time[0] >= 24) {
            while (time[0] >= 24) {
                time[0] -= 24;
            }
        }
        if (time[0] < 0) {
            while (time[0] < 0) {
                time[0] += 24;
            }
        }
        return time;
    }

    public static String PrintableTime(int[] time) {
        StringBuilder hour = new StringBuilder(String.valueOf(time[0]));
        StringBuilder min = new StringBuilder(String.valueOf(time[1]));
        if (hour.length() == 1)
            hour.insert(0, "0");
        if (min.length() == 1)
            min.insert(0, "0");
        return hour + ":" + min;
    }

    public static void main(String[] args) {
    }
}
