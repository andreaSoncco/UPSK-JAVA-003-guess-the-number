import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void testGetName() {
        HumanPlayer player = new HumanPlayer();
        assertEquals("Primer Jugador", player.getName());
    }

    @Test
    void testSetName() {
        HumanPlayer player = new HumanPlayer();
        player.setName("Andrea");
        assertEquals("Andrea", player.getName());
    }

}