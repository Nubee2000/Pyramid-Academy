import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName = "";
        try {
            System.out.println("Hello! What is your name?\n\n");
            userName = myObj.nextLine();
        } catch (Exception e) {
            System.out.println("Worn");
        }
        System.out.println("\n\nWell, " + userName + ", I am thinking of a number between 1 and 20.");
        int min = 1;
        int max = 20;
        int count = 1;
        int num = 0;
        Scanner number = new Scanner(System.in);

        int random_int = (int) Math.floor(Math.random() * (double) (max - min + 1) + (double) min);
        boolean playAgain = true;

        //Loops until playAgain == false
        while (playAgain) {
            //User get 6 chances
            for (count = 1; count < 7; count = count + 1) {
                //Ask for user input again
                boolean again = true;
                while (again) {
                    try {
                        System.out.println("Take a guess\n\n");
                        num = number.nextInt();
                        again = false;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input");
                        number.next();
                    }
                }
                if (num == random_int && count == 1) {
                    System.out.println("\n\nGood job, " + userName + "! You guessed my number in " + count + " guess!");
                    break;
                }

                //If num is less than random number, guess is too low.
                if (num < random_int) {
                    System.out.println("\n\nYour guess is too low");

                    //num is greater than random number, guess too high.
                } else {
                    if (num <= random_int) {
                        System.out.println("\n\nGood job, " + userName + "! You guessed my number in " + count + " guesses!");
                        break;
                    }

                    System.out.println("\n\nYour guess is too high");
                }

            }

            if (count == 7) {
                System.out.println("You lose!!!");
                System.out.println("Would you like to play again? (y/n)\n\n");
            } else {
                System.out.println("Would you like to play again? (y/n)\n\n");
            }
            Scanner sc = new Scanner(System.in);
            final char y = 'y';
            final char n = 'n';
            char c;
            boolean again = true;
            while(again) {
                try {
                    c = sc.next().charAt(0);
                    if(c == 'y');
                    again = false;

                } catch (Exception e) {
                    again = true;
                    System.out.println("Invalid");
                    sc.next();

                }
            }
            c = 'y';

            //Play again if input == 'y'


            if (c == y) {
                random_int = (int) Math.floor(Math.random() * (double) (max - min + 1) + (double) min);
                System.out.println("\n");
                playAgain = true;
            }
                else if(c == n){
                    playAgain = false;
                }
            }
                }
                }
                //terminate loop if user input 'n' to end game.











