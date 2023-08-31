package cd.labs.chapter6.partA.heros;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HeroTest {

    @Test
    public void addAndDisplayTest01(){
        // Given
        Hero hero = new Hero("Luke Cage","Powerman", "Defenders");
        String power = "Super Strength";

        // Then
        hero.addSuperPower(power);
        String[] expectedPowers = new String[5];
        expectedPowers[0] = power;
        String[] actualPowers = hero.displaySuperPowers();
        // When
        assertArrayEquals(expectedPowers, actualPowers);
    }

    @Test
    public void addSuperPowerTest01(){
        // Given
        Hero hero = new Hero("Luke Cage","Powerman", "Defenders");
        hero.addSuperPower("Super Strength");
        hero.addSuperPower("Durability");
        hero.addSuperPower("Healing Factor");
        hero.addSuperPower("Power of Christmas");
        hero.addSuperPower("Black man");

        // expected
        Boolean actual = hero.addSuperPower("Atomic Dawg");

        assertFalse(actual);
    }

    @Test
    public void removePowerTest01(){
        // Given
        Hero hero = new Hero("Jason Todd","Red Hood", "Bat Family");
        hero.addSuperPower("Resurrection");

        // When
        Boolean actual = hero.removePower("Resurrection");

        // Then
        assertTrue(actual);
    }

    @Test
    public void removePowerTest02(){
        // Given
        Hero hero = new Hero("Jason Todd","Red Hood", "Bat Family");
        hero.addSuperPower("Resurrection");

        // When
        Boolean actual = hero.removePower("Super Strength");

        // Then
        assertFalse(actual);
    }

    @Test
    public void teamUpTest01(){
        Hero frank = new Hero("Frank Castle","The Punisher", "His Damn self");
        Hero luke = new Hero("Luke Cage","Powerman", "Defenders");

        String expectMsg = "Powerman teams up with The Punisher!";
        String actualMsg = luke.teamUp(frank);

        assertEquals(expectMsg, actualMsg);
    }

    @Test
    public void getHeroCountTest01(){
        Hero frank = new Hero("Frank Castle","The Punisher", "His Damn self");

        int expected = 1;
        int actual = Hero.getHeroCount();

        assertEquals(expected, actual);
    }

}
