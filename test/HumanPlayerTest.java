import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class HumanPlayerTest {

    @Test
    public void testMakeGuessWithScanner() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.nextInt()).thenReturn(42);

        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.setScanner(mockScanner);
        int result = humanPlayer.makeGuess();

        assertEquals(42, result);
        Mockito.verify(mockScanner, Mockito.times(1)).nextInt();
    }

    @Test
    public void testMakeGuess() {
        HumanPlayer hpMockito = Mockito.mock(HumanPlayer.class);
        Mockito.when(hpMockito.makeGuess()).thenReturn(50);
        int number = hpMockito.makeGuess();
        assertTrue(number > 0 && number < 101);
    }

}