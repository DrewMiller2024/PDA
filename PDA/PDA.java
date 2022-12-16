import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    private Scanner scanner = new Scanner(System.in);
    private int age;
    private int LOWER_BOUND = 14;
    private double dateableYoung;
    private double dateable;
    private boolean loop;

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        loop = true;
        System.out.println("Note: enter 0 to quit the program");
        while (loop) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                if (age == 0) {
                    loop = false;
                } else
                if (age < LOWER_BOUND) {
                    System.out.println(age+" is too young!!");
                } else {
                    dateable = age;
                    dateable = dateable / 2 + 7;
                    dateable = Math.ceil(dateable);
                    System.out.println(dateable);
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
            
        }
    }
    
    public double getYoungerAge(int yourAge) {
        dateable = yourAge;
        dateable = dateable / 2 + 7;
        dateable = Math.ceil(dateable);
        return dateable;
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
