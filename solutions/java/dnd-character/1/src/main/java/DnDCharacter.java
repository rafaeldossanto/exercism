import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private final Random rand = new Random();

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    int hitpoints;


    public int ability(List<Integer> scores) {
        scores.remove(Collections.min(scores));
        return scores.stream().mapToInt(Integer::intValue).sum();
    }

    List<Integer> rollDice() {
        List<Integer> dices = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            dices.add(rand.nextInt(6) + 1);
        }
        return dices;
    }

    int modifier(int input) {
        return (int) Math.floor((double) (input - 10) / 2);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
