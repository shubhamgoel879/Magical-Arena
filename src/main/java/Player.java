
public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getAttack() {
        return this.attack;
    }

    Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public int getAttackDamage() {
        return this.attack * this.rollDice();
    }

    public int getDefendedStrength() {
        return this.strength * this.rollDice();
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0)
            this.health = 0;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
