import java.util.Scanner;

public class DragonCave {
    public static void randomNumber() {
        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(2) + 1; //Chooses 1 or 2 randomly.
        Scanner sc1 = new Scanner(System.in);
        int input = 0;
        System.out.println("\n");
        input = sc1.nextInt();

        //Randomly assigns user input to radom number
        if (input == tmp){
            System.out.println
                    ("\n\nYou approach the cave...\n" +
                            "It is dark and gloomy... \n" +
                            "A large"  +
                            " dragon jumps out in front of you! He opens his jaws and...\n" +
                            "Gobbles you down in one bite!\n");
        }

        //If input does not equal random number, it equals the other random number.
        else{
            System.out.println
                    ("\n\nYou approach the cave...\n" +
                            "It is dark and gloomy... \n" +
                            "A large"  +
                            " dragon jumps out in front of you! He approaches you speedily and...\n" +
                            "Shares his treasures with you!\n");
        }
    }
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
        randomNumber(); //Calls method
    }
}
