import java.util.Scanner;

public class DragonCave {

    public static void main(String[] args){
        System.out.println
                ("You are in a land of full of dragons. In front of you,\n" +
                        "you see two caves. " +
                        "In one cave, the dragon is friendly\n" +
                        "and will share his treasures with you. " +
                        "The other dragon\n" +
                        "is greedy and hungry and will eat you on sight.\n" +
                        "Which cave will" +
                        " you go into? (1,2)");
        //Calls method

        Scanner sc1 = new Scanner(System.in);
        boolean again = true;
        int input = 0;

        while (again) {
            try {
                input = sc1.nextInt();
                if (input <= 0 || input > 2) {
                    // this gets caught in the catch block
                    throw new IllegalArgumentException("\n\nInput invalid: Choose 1 or 2\n\n");
                } else {
                    again = false;
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("\n\nNo characters or words: Choose 1 or 2\n\n");
                sc1.next();

            }
        }
        System.out.println(randomNumber(input));
    }
    public static String randomNumber(int input) {


        String result = "";
        System.out.println("\n");

        String str = "\n\nYou approach the cave...\n" +
                "It is dark and gloomy... \n" +
                "A large" +
                " dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!\n";
        String str2 = "\n\nYou approach the cave...\n" +
                "It is dark and gloomy... \n" +
                "A large" +
                " dragon jumps out in front of you! He approaches you speedily and...\n" +
                "Shares his treasures with you!\n";

        //Input validation

        //Randomly assigns user input to radom number
        if (input == 1) {
            result = str;
        }

        //If input does not equal random number, it equals the other random number.
        else {
                    result = str2;

        }
        return result;
    }

}