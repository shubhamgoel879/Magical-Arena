
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player("TestPlayer", 100, 10, 5);
    }

    @Test
    void testPlayerInitialization() {
        assertEquals("TestPlayer", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(5, player.getAttack());
    }

    @Test
    void testGetAttackDamageRange() {
        for (int i = 0; i < 100; i++) {   // Loop for randomness.
            int damage = player.getAttackDamage();
            assertTrue(damage >= 5 && damage <= 30,
                    "Attack damage should be between 5 and 30");
        }
    }

    @Test
    void testGetDefendedStrengthRange() {
        for (int i = 0; i < 100; i++) {
            int defense = player.getDefendedStrength();
            assertTrue(defense >= 10 && defense <= 60,
                    "Defended strength should be between 10 and 60");
        }
    }

    @Test
    void testTakeDamage() {
        player.takeDamage(30);
        assertEquals(70, player.getHealth(),
                "Health should be reduced by damage amount");

        player.takeDamage(80); // Exceed current health
        assertEquals(0, player.getHealth(),
                "Health should not go below zero");
    }

    @Test
    void testIsAlive() {
        assertTrue(player.isAlive(), "Player should be alive initially");

        player.takeDamage(100); // Set health to zero
        assertFalse(player.isAlive(), "Player should be dead if health is zero");
    }
}