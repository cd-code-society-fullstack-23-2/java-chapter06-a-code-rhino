package cd.labs.chapter6.partB.players;

import java.util.ArrayList;

public class Player {
    private static int playerCount;
    private String name;
    private Integer age;
    private ArrayList<String> skills;
    private String position;
    private Integer goalsScored;

    public Player(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
        skills = new ArrayList<>();
        goalsScored = 0;
        playerCount++;
    }

    public Boolean addSkill(String skill){
        if(skills.size() >=5)
            return false;
        skills.add(skill);
        return true;
    }

    public Boolean removeSkill(String skill){
        return skills.remove(skill);
    }

    public ArrayList<String> displaySkills(){
        return skills;
    }

    public String teamUpWith(Player player){
        String response = String.format("%s has teamed up with %s",this.name, player.name);
        return response;
    }

    public static int getPlayerCount(){
        return playerCount;
    }
}
