import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MagicalArenaTest {

    private Player playerA;
    private Player playerB;
    private MagicalArena arena;

    @BeforeEach
    void setUp() {
        // Initialize players
        playerA = new Player("Player A", 50, 5, 10); // Lower health to start first
        playerB = new Player("Player B", 100, 10, 5);

        arena = new MagicalArena(playerA, playerB);
    }

    @Test
    void testFightOutcome() throws Exception {
        // Start the fight
        String result = arena.startFightAndGetResult(playerA, playerB, 0);

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0,
                "One player's health should reach zero at the end of the fight");

        // Verify the result message
        if (playerA.getHealth() == 0) {
            assertEquals("Player A has died. Player B wins!", result);
        } else {
            assertEquals("Player B has died. Player A wins!", result);
        }
    }

    @Test
    void testFightEndsWhenOnePlayerDies() throws Exception {
        // Start the fight
        arena.startFightAndGetResult(playerA, playerB, 0);

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0,
                "The fight should end when one player's health reaches zero");

        // Verify that `isAlive()` reflects the health status
        if (playerA.getHealth() == 0) {
            assertFalse(playerA.isAlive(), "Player A should be dead when health is zero");
            assertTrue(playerB.isAlive(), "Player B should be alive if Player A has died");
        } else {
            assertFalse(playerB.isAlive(), "Player B should be dead when health is zero");
            assertTrue(playerA.isAlive(), "Player A should be alive if Player B has died");
        }
    }
}
