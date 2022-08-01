package City.West;

import Overkill_Engine.*;
import Backend.Stats;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Fishing //restaurant 1
{
    private static void exec1() throws InterruptedException, IOException {
        Scene.make("FISHING", "sOmEtHiN's FiShY", null, Num.round(Stats.money, 2), true, Stats.HP, true, Stats.weapon, false, Stats.wanted, false, TimeModule.printableTime(Stats.time), true);
        Thread.sleep(1000);
        Print.textln("\nSalavtore: The freshest Cuttle Fish you'd ever get...");
        options();
        Print.textln("Sayonara!");
        Thread.sleep(1000);
        Scene.clear();
    }

    private static void options() throws IOException, InterruptedException {
        Scene.choice(new String[]{"The Fresh Catch", "Eat your catch @ Crusty Crabs", "Go Back"});
        Print.text("Response: ");
        int choice = Input.Int();
        if (choice == 1) {
            Thread.sleep(800);
            Print.textln("Salvatore: Oh! So you've chosen to adventure! Lemme pull out my rusty Smack..");
            Thread.sleep(2000);
            fishing();
        } else if (choice == 2) {
            CrustyCrabs.main(new String[]{});
        } else if (choice == 3) {
        } else {
            Print.textln("3 options. You just have 3 options in the list.");
            Thread.sleep(1500);
            Print.textln("How hard is it to select one of them?");
            Thread.sleep(1500);
            options();
        }
    }

    private static void fishing() throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Print.textln("Salvatore: Ready fellas!!??");
        Print.text("Response: ");
        Input.String();
        Thread.sleep(1000);
        Print.textln("Salvatore: You know the rules...I get 50% of the sales proceeds..");
        Print.text("Response: ");
        Input.String();
        Thread.sleep(1000);
        Print.textln("Salvatore: But...what if you don't catch any fish today? Interesting question, right?\nYou PAYYY MEEEEE $50 boat charges");
        Print.text("Response: ");
        Input.String();
        Thread.sleep(1000);
        Print.textln("Salvatore: And if you don't.....I shall killll youuuu. Think again..do you wanna continue? [y/n]");
        String ch = "";
        while (!ch.equalsIgnoreCase("n") || !ch.equalsIgnoreCase("y")) {
            Print.text("Response: ");
            ch = Input.String();
            Thread.sleep(1000);

            if (!ch.equalsIgnoreCase("n") || !ch.equalsIgnoreCase("y")) {
                Print.textln("You think you're smart huh? Y or N. Y...OOORRR....N....choose between one you dumb");
            }
        }
        if (ch.equalsIgnoreCase("n")) {
            Print.textln("Wise decision....you saved your buckied");
            Thread.sleep(2000);
            options();
        } else if (ch.equalsIgnoreCase("y")) {
            thefreshcatch();
        }
    }

    private static void thefreshcatch() throws InterruptedException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        Print.textln("Salvatore: Wise decision...Now listen up you little punk...\nyou have 5 chances to catch as many fishes as possible by entering the distance to throw the bait.\nFor every fish caught, you get $20");
        int mode = rand.nextInt(2);
        int x = 5;
        int fish = 0;
        Thread.sleep(5000);
        Print.textln();
        switch (mode) {
            case 1:
                while (x > 0 && x < 6) {
                    System.out.println("Enter throw distance: ");
                    int N = Input.Int();
                    int sr = (int) Math.sqrt(N);
                    if (N < 50 && sr * sr == N) {
                        System.out.println("Yay! You caught a fish!");
                        fish++;
                    } else {
                        System.out.println("Oops! Missed it!");
                    }
                    x--;
                }
                break;

            case 0:
                while (x > 5 && x < 9) {
                    System.out.println("Enter throw distance: ");
                    int N = Input.Int();
                    int sr = (int) Math.sqrt(N);
                    if (N < 50 && sr * sr == N) {
                        System.out.println("Yay! You caught a fish!");
                        fish++;
                    } else {
                        System.out.println("Oops! Missed it!");
                    }
                    x--;
                }
                break;

            case 2:
                int rem = 0, sum = 0;
                System.out.println("Enter throw distance: ");
                int N = Input.Int();
                int res = N;
                while (res > 9) {
                    while (res > 0) {
                        rem = res % 10;
                        sum = sum + (rem * rem);
                        res = res / 10;
                    }
                }
                res = sum;
                sum = 0;
                if (res == 1) {
                    System.out.println("Oink! You caught a fishy fish!");
                    fish++;
                } else {
                    System.out.println("You found nothing....");
                }
        }
        double reward = 0.5 * (fish * 20);
        Thread.sleep(1000);
        if (fish > 0) {
            Print.textln("Salvatore: Sweet! You caught " + fish + (fish == 1 ? " fish" : " fishes") + "!!!\nThat's the highest I've caught in my entire life...");
            Print.textln("Response: ");
            Input.String();
            Thread.sleep(1000);
            Print.textln("Salvatore: As per the deal, you get $" + reward + " and I get to keep the other half...");
            Print.textln("Response: ");
            Input.String();
            Thread.sleep(1000);
            Stats.money += reward;
            options();
        } else {
            Print.textln("Salvatore: Youuuuuu...dumb loooser...you found nothing..\nand on top of that, you wasted the fuel");
            Print.textln("Response: ");
            Input.String();
            Thread.sleep(1000);
            Print.textln("Salvatore: C'mon...pay me my boat charges..or I'll kick you on your butts...");
            Print.textln("Response: ");
            Input.String();
            Thread.sleep(1000);
            Stats.money -= 50;
            options();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}

