package game;
import java.util.Scanner;
import java.util.Random;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hey there!");
        System.out.println("I have picked a random number between 0 and 100");
        System.out.println("Let's see if you can guess the number");

        Random generator = new Random();
        int pickedNumber = generator.nextInt(101);
        int maxAttempts = 5;
        int attempts = 0;
        
        Scanner sc = new Scanner(System.in);
        try {
            while (attempts < maxAttempts) {
                System.out.println("Guess the number:");
                int guess = sc.nextInt();

                if (guess == pickedNumber) {
                    System.out.println("That's correct! The number is " + pickedNumber);
                    break;  
                } else if (guess < 0 || guess > 100) {
                    System.out.println("Your guess must be between 0 and 100");
                } else {
                    attempts++;
                    System.out.println("No, you didn't guess right. Try again! Remaining attempts: " + (maxAttempts - attempts));
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Game over! You've run out of attempts. The correct number was: " + pickedNumber);
            }

        } catch (Exception e) {
            System.out.println("An error occurred. Please enter a valid number.");
        } finally {
            sc.close();
        }
    }
}


