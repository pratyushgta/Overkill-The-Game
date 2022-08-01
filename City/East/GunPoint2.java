package City.East;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GunPoint2 //rip-off of Ammu Nation 
{
    public static void exec1() throws InterruptedException, IOException { //First time main run method of ropyaH qach
        Scene.make("Gun Point","The OMG gun shop.",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,false,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000);
        System.out.println();
        Print.textln("Albert:\nWelcome back homie....\nWhich type of weapon are you lookin' for, today?");
        Thread.sleep(1500);
        options();
        Thread.sleep(1000);
        Print.textln("Seeya soon! We're always ready for your calls of duty!");
    }

    private static void options() throws IOException, InterruptedException {
        Print.lineln("-",21);
        Print.text("    CATALOGUE");
        Scene.choice(new String[]{"Melee & Handguns","Assault Rifles","Machine Guns","Snipers & Shotguns","Exit"});
        Print.text("Response: ");
        int choice=Input.Int();
        if(choice==1){
            Thread.sleep(1500);
            Print.textln("Okie dokie...lemme pull out the catalogue");
            Thread.sleep(2000);
            NonLethalWeapons();
        }
        else if(choice==2){
            Thread.sleep(1500);
            Print.textln("Sweet!");
            Thread.sleep(1200);
            AssaultRifles();
        }
        else if(choice==3){
            Thread.sleep(1500);
            Print.textln("Ahhh..Kill with a snap...");
            Thread.sleep(1700);
            SMG_LMG();
        }
        else if(choice==4){
            Thread.sleep(1500);
            Print.textln("Silver & gold are inferior than this...");
            Thread.sleep(2000);
            Sniper_Shot();
        }
        else if(choice==5){
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

    private static void NonLethalWeapons() throws InterruptedException, IOException {
        System.out.println();
        Print.header("NON-LETHAL WEAPONS","*");
        //Print.textln();
        Thread.sleep(1000);
        Scene.choice(new String[]{"Knives & Axes","Pistols","Armours & Shields","Go Back"});
        Print.textln("Response: ");
        int ch=Input.Int();
        Thread.sleep(800);
        if(ch==1){
            Print.lineln("-",20);
            Print.textln("[1] KNIFE\nDamage: 10\nHit Rate: 1/sec\nAccuracy: 60\nPrice: $10");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.lineln("-",20);
            Print.textln("[2] COMBAT AXE\nDamage: 40\nRadius: 35\nAccuracy: 50\nPrice: $35");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.header("[3] Go Back","-");
            Thread.sleep(1000);
            Print.textln("Response: ");
            int choice=Input.Int();
            if(choice==1 && Stats.money>=10){
                Stats.weapon="Knife";
                Print.textln("Weapon Purchased");
                Stats.money-=10;
                Thread.sleep(1500);
                NonLethalWeapons();
            }
            else if(choice==2 && Stats.money>=35){
                Stats.weapon="Combat Axe";
                Print.textln("Weapon Purchased");
                Stats.money-=35;
                Thread.sleep(1500);
                NonLethalWeapons();
            }
            else if(choice==3){
                NonLethalWeapons();
            }
            else{
                Print.error("You can't buy that!");
                Thread.sleep(1000);
                NonLethalWeapons();
            }
        }
        else if(ch==3){
            Print.lineln("-",20);
            Print.textln("[1] ARMOUR\nHitpoints: 100\nPrice: 150");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.lineln("-",20);
            Print.textln("[2] SHIELD\nHitpoints: 50\nPrice: 75");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.header("[3] Go Back","-");
            Thread.sleep(1000);
            Print.textln("Response: ");
            int choice=Input.Int();
            if(choice==1 && Stats.money>=150){
                Print.textln("Armour Purchased");
                Stats.money-=10;
                Stats.HP+=100;
                Thread.sleep(1500);
                if(Stats.HP>200){
                    Stats.HP=200;
                }
                NonLethalWeapons();
            }
            else if(choice==2 && Stats.money>=75){
                Print.textln("Shield Purchased");
                Stats.money-=35;
                Stats.HP+=50;
                Thread.sleep(1500);
                if(Stats.HP>200){
                    Stats.HP=200;
                }
                NonLethalWeapons();
            }
            else if(choice==3){
                NonLethalWeapons();
            }
            else{
                Print.error("You can't buy that!");
                Thread.sleep(1000);
                NonLethalWeapons();
            }
        }
        else if(ch==2){
            Print.lineln("-",20);
            Print.textln("[1] MW11 Pistol\nDamage: 29\nFire Rate: 44\nAccuracy: 45\nPrice: 75");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.lineln("-",25);
            Print.textln("[2] J358 Double Action Revolver\nDamage: 38\nFire Rate: 38\nAccuracy: 55\naPrice: 100");
            Print.lineln("-",25);
            Print.textln();
            Thread.sleep(1000);
            Print.header("[3] Go Back","-");
            Thread.sleep(1000);
            Print.textln("Response: ");
            int choice=Input.Int();
            if(choice==1 && Stats.money>=75){
                Stats.weapon="MW11 Pistol";
                Print.textln("Weapon Purchased");
                Stats.money-=75;
                Thread.sleep(1500);
                NonLethalWeapons();
            }
            else if(choice==2 && Stats.money>=100){
                Stats.weapon="J358 Revolver";
                Print.textln("Weapon Purchased");
                Stats.money-=100;
                Thread.sleep(1500);
                NonLethalWeapons();
            }
            else if(choice==3){
                NonLethalWeapons();
            }
            else{
                Print.error("You can't buy that!");
                Thread.sleep(1000);
                NonLethalWeapons();
            }
        }
        else if(ch==4){
            Thread.sleep(500);
            options();
        }
        else{
            Print.error("Do you see option "+ch+" list? No, right! So enter what's been asked for...");
            Thread.sleep(2000);
            NonLethalWeapons();
        }
    }

    private static void AssaultRifles() throws InterruptedException, IOException {
        System.out.println();
        Print.header("ASSAULT RIFLES","*");
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",25); 
        Print.textln("[1] OBZ 95 Bullpup Rifle\nDamage: 39\nFire Rate: 79\nAccuracy: 50\nPrice: $150");
        Print.lineln("-",25);
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",25); 
        Print.textln("[2] M4 Carbine Rifle\nDamage: 41\nFire Rate: 68\nAccuracy: 62\nPrice: $170");
        Print.lineln("-",25);
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",25);
        Print.textln("[3] AK47 Advanced Rifle\nDamage: 45\nFire Rate: 65\nAccuracy: 67\nPrice: $185");
        Print.lineln("-",25);
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",25);
        Print.textln("[4] ASM10 Assault Rifle\nDamage: 49\nFire Rate: 55\nAccuracy: 72\n\nPrice: $200");
        Print.lineln("-",20);
        Print.textln();
        Thread.sleep(1000);
        Print.header("[5] Go Back","-");
        Thread.sleep(1000);
        Print.textln("Response: ");
        int choice=Input.Int();
        if(choice==1 && Stats.money>=150){
            Stats.weapon="OBZ 95 Bullpup";
            Print.textln("Weapon Purchased");
            Stats.money-=150;
            Thread.sleep(1500);
            options();
        }
        else if(choice==2 && Stats.money>=170){
            Stats.weapon="M4 Carbine";
            Print.textln("Weapon Purchased");
            Stats.money-=170;
            Thread.sleep(1500);
            options();
        }
        else if(choice==3 && Stats.money>=185){
            Stats.weapon="AK47";
            Print.textln("Weapon Purchased");
            Stats.money-=185;
            Thread.sleep(1500);
            options();
        }
        else if(choice==4 && Stats.money>=200){
            Stats.weapon="ASM10";
            Print.textln("Weapon Purchased");
            Stats.money-=200;
            Thread.sleep(1500);
            options();
        }
        else if(choice==5){
            Thread.sleep(800);
            options();
        }
        else{
            Print.error("You can't buy that!");
            Thread.sleep(1000);
            AssaultRifles();
        }
    }

    private static void SMG_LMG() throws InterruptedException, IOException {
        System.out.println();
        Print.header("MACHINE GUNS","*");
        Print.textln();
        Thread.sleep(1000);
        Scene.choice(new String[]{"SMG","LMG","Go Back"});
        Print.textln("Response: ");
        int ch=Input.Int();
        Thread.sleep(1000);
        if(ch==1){
            Print.lineln("-",20);
            Print.textln("[1] Machine Pistol\nDamage: 37\nFire Rate: 92\nAccuracy: 37\nPrice: $115");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.lineln("-",20);
            Print.textln("[2] P90 Assault SMG\nDamage: 40\nFire Rate: 78\nAccuracy: 49\nPrice: $140");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.header("[3] Go Back","-");
            Thread.sleep(1000);
            Print.textln("Response: ");
            int choice=Input.Int();
            if(choice==1 && Stats.money>=115){
                Stats.weapon="Machine Pistol";
                Print.textln("Weapon Purchased");
                Stats.money-=115;
                Thread.sleep(1500);
                SMG_LMG();
            }
            else if(choice==2 && Stats.money>=140){
                Stats.weapon="P90 SMG";
                Print.textln("Weapon Purchased");
                Stats.money-=140;
                Thread.sleep(1500);
                SMG_LMG();
            }
            else if(choice==3){
                SMG_LMG();
            }
            else{
                Print.error("You can't buy that!");
                Thread.sleep(1000);
                SMG_LMG();
            }
        }
        else if(ch==2){
            Print.lineln("-",20);
            Print.textln("[1] M4LMG\nDamage: 63\nFire Rate: 46\nAccuracy: 61\nPrice: $350");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.lineln("-",20);
            Print.textln("[2] RP-46 Degtyaryov Mounted LMG\nDamage: 66\nFire Rate: 95\nAccuracy: 50\nPrice: $450");
            Print.lineln("-",20);
            Print.textln();
            Thread.sleep(1000);
            Print.header("[3] Go Back","-");
            Thread.sleep(1000);
            Print.textln("Response: ");
            int choice=Input.Int();
            if(choice==1 && Stats.money>=350){
                Stats.weapon="M4LMG";
                Print.textln("Weapon Purchased");
                Stats.money-=350;
                Thread.sleep(1500);
                SMG_LMG();
            }
            else if(choice==2 && Stats.money>=450){
                Stats.weapon="RP-46 LMG";
                Print.textln("Weapon Purchased");
                Stats.money-=450;
                Thread.sleep(1500);
                SMG_LMG();
            }
            else if(choice==3){
                SMG_LMG();
            }
            else{
                Print.error("You can't buy that!");
                Thread.sleep(1000);
                SMG_LMG();
            }
        }
        else if(ch==3){
            Thread.sleep(800);
            options();
        }
        else{
            Print.error("Do you see option "+ch+" list? No, right! So enter what's been asked for...");
            Thread.sleep(2000);
            SMG_LMG();
        }
    }

    private static void Sniper_Shot() throws InterruptedException, IOException {
        System.out.println();
        Print.header("SNIPERS & SHOTGUNS","*");
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",20); 
        Print.textln("[1] Sawed-off Shotgun\nDamage: 92\nFire Rate: 27\nAccuracy: 45\nPrice: $350");
        Print.lineln("-",20);
        Print.textln();
        Thread.sleep(1000);
        Print.lineln("-",20); 
        Print.textln("[2] Arctic 50 Sniper\nDamage: 98\nFire Rate: 31\nAccuracy: 84\nPrice: $500");
        Print.lineln("-",20);
        Print.textln();
        Thread.sleep(1000);
        Print.header("[3] Go Back","-");
        Thread.sleep(1000);
        Print.textln("Response: ");
        int choice=Input.Int();
        if(choice==1 && Stats.money>350){
            Stats.weapon="Swaed-off Shotgun";
            Print.textln("Weapon Purchased");
            Stats.money-=150;
            Thread.sleep(1500);
            options();
        }
        else if(choice==2 && Stats.money>=500){
            Stats.weapon="M4 Carbine";
            Print.textln("Weapon Purchased");
            Stats.money-=170;
            Thread.sleep(1500);
           options();
        }
        else if(choice==3){
            Thread.sleep(800);
            options();
        }
        else{
            Print.error("You can't buy that!");
            Thread.sleep(1000);
            Sniper_Shot();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}

