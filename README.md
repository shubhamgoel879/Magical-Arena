**Problem Statement**

Design a Magical Arena. Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0. 
Any two player can fight a match in the arena. Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice. The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. Whatever damage created by attacker which is in excess of the damage defended by the defender will reduce the “health” of the defender. Game ends when any players health reaches 0.
Player with lower health attacks first at the start of a match. 

**Example**

Assume two players . Player A 50 health 5 strength 10 attack Player B 100 health 10 stregnth and 5 attack . Attacking die and Defending die are both 6 sided die with values ranging from 1- 6
Player A attacks and rolls die. Die roll : 5 . Player B defends and rolls die. Die roll 2
Attack damage is 5 * 10 = 50 ; Defending strength = 10 * 2 = 20 ; Player B health reduced by 30 to 70
Player B attacks and rolls die. Die roll : 4. Player A defends and rolls die. Die Roll 3
Attack damage is 4 * 5 = 20 ; Defending strength = 5 * 3 = 15 ; Player A health reduced by 5 to 45
And so on.

**Tech Used**

- JAVA
- Oops Concepts
- Junit Framework 

**Steps to run the project**

- Open folder in VS Code.
- Add Extension -> With name - 'Extension Pack for Java'
- Wait for autobuild of the project.
- Go to main.java and click on 'run'
- To run the test case right click on Test file and click run tests.

**Output**

- Arena started!!
- Attacker => A [Health=50, Strength=5, Attack=10]
- Defender => B [Health=100, Strength=10, Attack=5]
- Fight Starts...!!
- A attacks with damage: 10
- B defends with strength: 20
- Total Damage on B : -10    
- B successfully defended the attack!
- Attacker => B [Health=100, Strength=10, Attack=5]
- Defender => A [Health=50, Strength=5, Attack=10]
- Fight Starts...!!
- B attacks with damage: 10
- A defends with strength: 25
- Total Damage on A : -15    
- A successfully defended the attack!
- Attacker => A [Health=50, Strength=5, Attack=10]
- Defender => B [Health=100, Strength=10, Attack=5]
- Fight Starts...!!
- A attacks with damage: 50
- B defends with strength: 20
- Total Damage on B : 30
- B got injured!
- Attacker => B [Health=70, Strength=10, Attack=5]
- Defender => A [Health=50, Strength=5, Attack=10]
- Fight Starts...!!
- B attacks with damage: 5
- A defends with strength: 5
- Total Damage on A : 0
- A successfully defended the attack!
- Attacker => A [Health=50, Strength=5, Attack=10]
- Defender => B [Health=70, Strength=10, Attack=5]
- Fight Starts...!!
- A attacks with damage: 10
- B defends with strength: 10
- Total Damage on B : 0
- B successfully defended the attack!
- Attacker => B [Health=70, Strength=10, Attack=5]
- Defender => A [Health=50, Strength=5, Attack=10]
- Fight Starts...!!
- B attacks with damage: 30
- A defends with strength: 30
- Total Damage on A : 0
- A successfully defended the attack!
- Attacker => A [Health=50, Strength=5, Attack=10]
- Defender => B [Health=70, Strength=10, Attack=5]
- Fight Starts...!!
- A attacks with damage: 30
- B defends with strength: 50
- Total Damage on B : -20
- B successfully defended the attack!
- Attacker => B [Health=70, Strength=10, Attack=5]
- Defender => A [Health=50, Strength=5, Attack=10]
- Fight Starts...!!
- B attacks with damage: 30
- A defends with strength: 15
- Total Damage on A : 15
- A got injured!
- Attacker => A [Health=35, Strength=5, Attack=10]
- Defender => B [Health=70, Strength=10, Attack=5]
- Fight Starts...!!
- A attacks with damage: 50
- B defends with strength: 20
- Total Damage on B : 30
- B got injured!
- Attacker => B [Health=40, Strength=10, Attack=5]
- Defender => A [Health=35, Strength=5, Attack=10]
- Fight Starts...!!
- B attacks with damage: 30
- A defends with strength: 5
- Total Damage on A : 25
- A got injured!
- Attacker => A [Health=10, Strength=5, Attack=10]
- Defender => B [Health=40, Strength=10, Attack=5]
- Fight Starts...!!
- A attacks with damage: 20
- B defends with strength: 40
- Total Damage on B : -20
- B successfully defended the attack!
- Attacker => B [Health=40, Strength=10, Attack=5]
- Defender => A [Health=10, Strength=5, Attack=10]
- Fight Starts...!!
- B attacks with damage: 10
- A defends with strength: 10
- Total Damage on A : 0
- A successfully defended the attack!
- Attacker => A [Health=10, Strength=5, Attack=10]
- Defender => B [Health=40, Strength=10, Attack=5]
- Fight Starts...!!
- A attacks with damage: 40
- B defends with strength: 20
- Total Damage on B : 20
- B got injured!
- Attacker => B [Health=20, Strength=10, Attack=5]
- Defender => A [Health=10, Strength=5, Attack=10]
- Fight Starts...!!
- B attacks with damage: 30
- A defends with strength: 10
- Total Damage on A : 20
- A got injured!
- A has died. B wins!
