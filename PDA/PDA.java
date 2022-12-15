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
    private int dateable;
    private int dateableAge;

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
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    System.out.println(age+" is too young!!");
                } else {
                    getYoungerAge();
                    dateableAge = dateable;
                    System.out.println(dateableAge);
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
            
        }
    }
    
    public int getYoungerAge(int yourAge) {
        this.age = age;
        dateableYoung = age / 2 + 7;
        dateable = Math.ceil(dateableYoung);
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
