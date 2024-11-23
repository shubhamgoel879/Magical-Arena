public class MagicalArena {
    private Player A;
    private Player B;

    MagicalArena(Player A, Player B) {
        this.A = A;
        this.B = B;
    }

    public String startFightAndGetResult(Player A, Player B, int delay) throws Exception {
        Player attacker, defender;
        if (A.getHealth() < B.getHealth()) {
            attacker = A;
            defender = B;
        } else {
            attacker = B;
            defender = A;
        }

        while (attacker.isAlive() && defender.isAlive()) {
            int attackDamage = attacker.getAttackDamage();
            int defenseStrength = defender.getDefendedStrength();
            int totalDamageOnDefender = attackDamage - defenseStrength;

            System.out.println("Attacker => " + attacker.getName() + " [Health=" + attacker.getHealth() + ", Strength="
                    + attacker.getStrength() + ", Attack=" + attacker.getAttack() + "]");
            System.out.println("Defender => " + defender.getName() + " [Health=" + defender.getHealth() + ", Strength="
                    + defender.getStrength() + ", Attack=" + defender.getAttack() + "]");
            System.out.println("Fight Starts...!!");

            Thread.sleep(delay);

            System.out.println(attacker.getName() + " attacks with damage: " + attackDamage);
            System.out.println(defender.getName() + " defends with strength: " + defenseStrength);
            System.out.println("Total Damage on " + defender.getName() + " : " + totalDamageOnDefender);

            Thread.sleep(delay);

            if (totalDamageOnDefender > 0) {
                defender.takeDamage(totalDamageOnDefender);
                System.out.println(defender.getName() + " got injured!");
            } else {
                System.out.println(defender.getName() + " successfully defended the attack!");
            }

            Thread.sleep(delay);

            // Swap attacker and defender
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (attacker.isAlive())
            return defender.getName() + " has died. " + attacker.getName() + " wins!";
        else
            return attacker.getName() + " has died. " + defender.getName() + " wins!";
    }
}
