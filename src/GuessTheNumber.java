import java.util.Scanner;

public class GuessTheNumber {
    public GuessTheNumber() {
    }

    public static void main(String[] args) {
        System.out.println("Hello! What is your name?\n\n");
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();
        System.out.println("\n\nWell, " + userName + ", I am thinking of a number between 1 and 20.");
        System.out.println("Take a guess\n\n");
        int min = 1;
        int max = 20;
        int count = 1;
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        int random_int = (int)Math.floor(Math.random() * (double)(max - min + 1) + (double)min);
        boolean input = true;

        while(input) {
            for(; count != 6; ++count) {
                if (num == random_int && count == 1) {
                    System.out.println("\n\nGood job, " + userName + "! You guessed my number in " + count + " guess!");
                    break;
                }

                if (num < random_int) {
                    System.out.println("\n\nYour guess is too low");
                    System.out.println("Take a guess\n\n");
                    num = number.nextInt();
                } else {
                    if (num <= random_int) {
                        System.out.println("\n\nGood job, " + userName + "! You guessed my number in " + count + " guesses!");
                        break;
                    }

                    System.out.println("\n\nYour guess is too high");
                    System.out.println("Take a guess\n\n");
                    num = number.nextInt();
                }
            }

            System.out.println("Would you like to play again?\n\n");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);
            if (c == 'y') {
                input = true;
                count = 1;
                random_int = (int)Math.floor(Math.random() * (double)(max - min + 1) + (double)min);
                System.out.println("Take a guess\n\n");
                num = number.nextInt();
            } else {
                input = false;
                System.out.println("\n");
            }
        }

    }
}
