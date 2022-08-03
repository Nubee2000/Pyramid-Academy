import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName = "";
        System.out.println("Hello! What is your name?\n\n");
        boolean again_1 = true;
        //Input validation for string with no special characters or numbers
        while (again_1) {
            try {
                userName = myObj.nextLine();
                for (int i = 0; i < userName.length(); i++) {
                    if (userName.charAt(i) <= 64 || userName.charAt(i) >= 91 &&
                            userName.charAt(i) <= 96 || userName.charAt(i) > 122) {
                        throw new RuntimeException("Invalid: No special characters or numbers");
                    }
                    else {
                        again_1 = false;
                    }
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                again_1 = true;
            }
        }
        System.out.println("\n\nWell, " + userName + ", " +
                "I am thinking of a number between 1 and 20.");
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
                char c = 0;
                boolean again = true;
                while (again) {
                    try {
                        c = sc.next().charAt(0);
                        //asci values of y and n
                        if (c > 121 || c < 121 && c != 110) {
                            throw new IllegalArgumentException("Input Invalid: Choose (y/n)");
                        } else {
                            again = false;
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }

                //Play again if input == 'y'
                if (c == 'y') {
                    random_int = (int) Math.floor(Math.random() * (double) (max - min + 1) + (double) min);
                    System.out.println("\n");
                }
                //terminate loop if user input 'n' to end game.
                else if (c == 'n') {
                    playAgain = false;
                    System.out.println();
                }
            }
        }
    }












