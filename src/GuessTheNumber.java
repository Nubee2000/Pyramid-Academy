import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Hello! What is your name?\n\n");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        System.out.println("\n\nWell, " + userName + ", I am thinking of a number between 1 and 20.");
        int min = 1;
        int max = 20;
        int count = 1;
        Scanner number = new Scanner(System.in);

        int random_int = (int)Math.floor(Math.random() * (double)(max - min + 1) + (double)min);
        boolean playAgain = true;

        //Loops until playAgain == false
        while(playAgain) {
            //User get 6 chances
            for(count = 1; count < 7; count = count + 1) {
                //Ask for user input again
                System.out.println("Take a guess\n\n");
                int num = number.nextInt();
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

            if(count == 7){
                System.out.println("You lose!!!");
                System.out.println("Would you like to play again? (y/n)\n\n");
            }
            else {
                System.out.println("Would you like to play again? (y/n)\n\n");
            }
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            //Play again if input == 'y'
            if (c == 'y') {
                random_int = (int)Math.floor(Math.random() * (double)(max - min + 1) + (double)min);
                System.out.println("\n");
              //terminate loop if user input 'n' to end game.
            } else {
                playAgain = false; //Set playAgain == true.
                System.out.println("\n");
            }
        }
    }
}
