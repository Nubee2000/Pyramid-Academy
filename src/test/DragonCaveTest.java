import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class DragonCaveTest {
    DragonCave cave;
    @BeforeEach
    void setUp(){
        cave = new DragonCave();
    }

    @Test
    void checkIfCaveNumberMatches(){
        assertEquals("\n\nYou approach the cave...\n" +
                "It is dark and gloomy... \n" +
                "A large" +
                " dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!\n", cave.randomNumber(1), "Test of input 1 failed");

        assertEquals("\n\nYou approach the cave...\n" +
                "It is dark and gloomy... \n" +
                "A large" +
                " dragon jumps out in front of you! He approaches you speedily and...\n" +
                "Shares his treasures with you!\n", cave.randomNumber(2), "Test of input 2 failed");
    }

    @AfterEach
    void TearDown(){

    }



}