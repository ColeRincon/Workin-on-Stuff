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
        while (validClass > 0 )
        {
            Scanner in = new Scanner(System.in); 
            System.out.println("Choose your class:");
            System.out.println("Knight    Mage    Theif");
            String playerClass = in.nextLine();
            if ((playerClass.contains("Knight")) || (playerClass.contains("Mage")) || (playerClass.contains("Theif")))
            {
                System.out.println("You have selected the " + playerClass + " class!");
                validClass = 0;
            }
            else
            {
                System.out.println("Invalid Class!");
            }
        }
    }
    
}
