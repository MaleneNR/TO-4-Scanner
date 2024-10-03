import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	Scanner scan = new Scanner(System.in); 	

    if (scan.hasNextDouble()){
        int input = scan.nextInt();

        if (input == rnd_number){
            System.out.println("That is the correct number!");
        } else if (input < rnd_number) {
            System.out.println("Try again, your guess is too low");
            makeAGuess();
        } else if (input > rnd_number) {
            System.out.println("Try again, your guess is too high");
            makeAGuess();
        } else{
            System.out.println("X");
        }
    } else{ 
        System.out.println("Input isn't numeric");
    }
    }
}