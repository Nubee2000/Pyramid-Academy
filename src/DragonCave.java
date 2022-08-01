import java.util.Scanner;

public class DragonCave {
    public static void myMethod() {
        java.util.Random random = new java.util.Random();
        int tmp = random.nextInt(2) + 1;
        // code to be executed
        Scanner sc1 = new Scanner(System.in);
        int input = 0;
        System.out.println("\n");
        input = sc1.nextInt();
        if (input == tmp){
            System.out.println
                    ("\n\nYou approach the cave...\n" +
                            "It is dark and gloomy... \n" +
                            "A large"  +
                            " dragon jumps out in front of you! He opens his jaws and...\n" +
                            "Gobbles you down in one bite!\n");
        }
        else{
            System.out.println
                    ("\n\nYou approach the cave...\n" +
                            "It is dark and gloomy... \n" +
                            "A large"  +
                            " dragon jumps out in front of you! He aproaches you speedily and...\n" +
                            "Shares his treasures with you!\n");
        }
    }
    //hello

    public static void main(String[] args){
        System.out.println
                ("You are in a land of full of dragons. In front of you,\n" +
                        "you see two caves. " +
                        "In one cave, the dragon is friendly\n" +
                        "and will share his treasures with you. " +
                        "The other dragon\n" +
                        "is greedy and hungry and will eat on sight.\n" +
                        "Which cave will" +
                        " you go into? (1,2)");
        myMethod();
    }
}
