import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    GuessTheNumber guess;

    @BeforeEach
    void setUp() {
        guess = new GuessTheNumber();
    }

    @Test
    void main() {
        assertEquals("try", guess.play(1), "done");
        assertEquals("try", guess.play(2), "done");
        assertEquals("try", guess.play(3), "done");
        assertEquals("try", guess.play(4), "done");
        assertEquals("try", guess.play(5), "done");
        assertEquals("try", guess.play(6), "done");
        assertEquals("try", guess.play(7), "done");
        assertEquals("try", guess.play(8), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(9), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(10), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(11), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(12), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(13), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(14), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(15), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(16), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(17), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(18), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(19), "done");
        assertEquals("\"Hello! What is your name?\\n\\n\"", guess.play(20), "done");

    }

    @AfterEach
    void tearDown() {
    }
}