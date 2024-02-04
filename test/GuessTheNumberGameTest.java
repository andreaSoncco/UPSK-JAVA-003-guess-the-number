
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class GuessTheNumberGameTest {
    @Test
    public void testMain() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.nextInt())
                .thenReturn(100);
        HumanPlayer human = new HumanPlayer();
        human.setScanner(mockScanner);
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.playGame(human, new ComputerPlayer(), 100);
        assertTrue(game.checkGuess(human));
    }

    @Test
    public void testMainTooHigh() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.nextInt())
                .thenReturn(150);
        HumanPlayer human = new HumanPlayer();
        human.setScanner(mockScanner);
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.playGame(human, new ComputerPlayer(), 100);
        assertFalse(game.checkGuess(human));
    }

    @Test
    public void testMainTooLow() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.nextInt())
                .thenReturn(50);
        HumanPlayer human = new HumanPlayer();
        human.setScanner(mockScanner);
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.playGame(human, new ComputerPlayer(), 100);
        assertFalse(game.checkGuess(human));
    }
}

