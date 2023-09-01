package cd.labs.chapter6.partB.players;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PlayerTest {

    @Test
    public void addDisplaySkillsTest01(){
        // Given
        Player player = new Player("Hamlet", 23  , "Pitcher");
        String skillToAdd = "Curve Ball";

        // When
        ArrayList<String> expectedSkills = new ArrayList<>();
        expectedSkills.add(skillToAdd);

        player.addSkill(skillToAdd);
        ArrayList<String> actualSkills = player.displaySkills();
        // Then
        Assertions.assertEquals(expectedSkills.size(), actualSkills.size());
        Assertions.assertEquals(expectedSkills.get(0), actualSkills.get(0));
    }

    @Test
    public void addMoreThan5SkillsTest01(){
        Player player = new Player("Hamlet", 23  , "Pitcher");
        String skillToAdd = "Curve Ball";
        for (int x = 0; x < 5; x++){
            player.addSkill(skillToAdd);
        }
        Boolean actual = player.addSkill(skillToAdd);
        Assertions.assertFalse(actual);
    }

    @Test
    public void removeSkillTest01(){
        Player player = new Player("Hamlet", 23  , "Pitcher");
        String skillToAdd = "Curve Ball";
        player.addSkill(skillToAdd);
        Boolean actual = player.removeSkill(skillToAdd);
        Assertions.assertTrue(actual);
    }

    @Test
    public void removeSkillTest02(){
        Player player = new Player("Hamlet", 23  , "Pitcher");
        String skillToAdd = "Curve Ball";
        Boolean actual = player.removeSkill(skillToAdd);
        Assertions.assertFalse(actual);
    }

    @Test
    public void teamUpWithTest01(){
        Player player1 = new Player("Mario", 23  , "Pitcher");
        Player player2 = new Player("Lugi", 23  , "Catcher");

        String expected = "Mario has teamed up with Lugi";
        String actual = player1.teamUpWith(player2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPlayerCount(){
        Player player1 = new Player("Mario", 23  , "Pitcher");
        Player player2 = new Player("Lugi", 23  , "Catcher");

        int expected = 2;
        int actual = Player.getPlayerCount();

        Assertions.assertEquals(expected, actual);
    }

}
