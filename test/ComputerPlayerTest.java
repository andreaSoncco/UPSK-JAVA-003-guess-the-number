import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerPlayerTest {
    @Test
    public void makeGuess() {
        ComputerPlayer generate = new ComputerPlayer();
        int number = generate.makeGuess();
        assertTrue(number > 0 && number < 101);
    }

    @Test
    public void makeGuessMockito() {
        ComputerPlayer cpMockito = Mockito.mock(ComputerPlayer.class);
        Mockito.when(cpMockito.makeGuess()).thenReturn(new Random().nextInt(100) + 1);
        int number = cpMockito.makeGuess();
        assertTrue(number > 0 && number < 101);
    }

}