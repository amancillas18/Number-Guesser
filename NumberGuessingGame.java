import java.util.*;

public class NumberGuessingGame{
    
    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);

        int randomNo = (int)(100 * Math.random());

        int NumOfTries = 0, guess;
        final int MAX_NUM_OF_TRIES = 12;
        final int MAX_GUESS_LIMIT = 100;

        System.out.println("Try to guess a number between 1 and " + MAX_GUESS_LIMIT);

        do{
            System.out.println("Current try number: " + ++NumOfTries + "\n");
            
            System.out.print("Guess a number: ");
            guess = sc.nextInt();

            if(randomNo < guess)
                System.out.println("The random number is less than " + guess + "\n");

            if(randomNo > guess)
                System.out.println("The random number is greater than " + guess + "\n");

            if(randomNo == guess){
                System.out.println("Congratulations! You have guessed the random number.\n");
                break;
            }

            if(NumOfTries == MAX_NUM_OF_TRIES){
                System.out.println("You have ran out of tries. The random number was " + randomNo);
                break;
            }
        }while(true);
    }

    public static void main(String[] args){
        guessNumber();
    }
}