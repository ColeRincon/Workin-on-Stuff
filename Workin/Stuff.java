import java.util.Scanner;

/**
 * Write a description of class Stuff here.
 *
 * @author (Cole Rincon)
 * @version (8.29.2018)
 */
public class Stuff
{
    public static void main (String[] args)
    {
        int validClass = 1;
        Scanner in = new Scanner(System.in);
        String playerClass = "";
        int HP = 0;
        int MP = 0;
        int STR = 0;
        int STL = 0;
        while (validClass > 0 )
        { 
            System.out.println("Choose your class:");
            System.out.println("[Knight]  [Mage]  [Theif]");
            System.out.println("");
            playerClass = in.nextLine();
            if ((playerClass.contains("Knight")) || (playerClass.contains("Mage")) || (playerClass.contains("Theif")))
            {
                System.out.println("You have selected the " + playerClass + " class!");
                validClass = 0;
            }
            else
            {
                System.out.println("Invalid Class!");
                System.out.println("");
            }
        }
        if ( playerClass.contains("Knight"))
        {
            HP = 30;
            MP = 0;
            STR = 30;
            STL = 12;
        }
        if ( playerClass.contains("Mage"))
        {
            HP = 25;
            MP = 35;
            STR = 10;
            STL = 14;
        }
        if (playerClass.contains("Theif"))
        {
            HP = 15;
            MP = 15;
            STR = 18;
            STL = 25;
        }
        System.out.println("Your stats are:");
        System.out.println("HP: " + HP);
        System.out.println("MP: " + MP);
        System.out.println("STR: " + STR);
        System.out.println("STL: " + STL);
        System.out.println("");
        System.out.println("Press ENTER to continue");
        String cont = in.nextLine();
    }
}