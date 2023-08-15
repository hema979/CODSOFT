//import Libraries

import java.util.Scanner;
import java.util.Random;

class Task1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rd  = new Random();

        int minValue  = 1;
        int maxValue  = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while(playAgain)
        {
            int targetNumber  = rd.nextInt(maxValue - minValue + 1)+minValue;
            int attempts = 0;

            System.out.println("\nRound "+(rounds+1));
            System.out.println("A Random number was generated in blw "+minValue+"and "+maxValue+".");
            System.out.println("You have "+attempts+"attempts to guess the number.");

            while(attempts < maxAttempts)
            {
                System.out.println("Enter your guess"+(attempts+1)+":");
                
                int userGuess = sc.nextInt();
                attempts++;

                if(userGuess == targetNumber)
                {
                    System.out.println("Congratualtions! You guessed the number correctly "+targetNumber+" in "+attempts+" attempts");
                    score++;
                    break;
                }
                else if(userGuess < targetNumber)
                {
                    System.out.println("Toooo Low! Try Again.");
                }
                else
                {
                    System.out.println("Toooo High! Try Agian.");
                }

                if(attempts == maxAttempts)
                {
                    System.out.println("Sorr, You have run out of attempts.The correct number was"+targetNumber+".");
                }
            }

            rounds++;
            System.out.println("Do you want to play Again. Enter (yes/no) : ");
            String st = sc.next().toLowerCase();
            playAgain = st.equals("yes") || st.equals("y");
            
        }
        System.out.println("\n You played "+ rounds + " rounds and score is "+ score + ".");
        System.out.println("\n********************Game Over!***************************");
    }
}