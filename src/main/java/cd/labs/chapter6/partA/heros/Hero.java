package cd.labs.chapter6.partA.heros;

public class Hero {
    private static int heroCount;

    private String name;
    private String alias;
    private String [] superPowers;
    private String affiliation;
    private Integer healthPoints;

    public Hero(String name,
                String alias,
                String affiliation){
        this.name = name;
        this.alias = alias;
        this.affiliation = affiliation;
        superPowers = new String[5];
        healthPoints = 0;
        heroCount++;
    }

    public Boolean addSuperPower(String power){
        for(int x = 0; x < superPowers.length; x++){
            if(superPowers[x] == null){
                superPowers[x] = power;
                return true;
            }
        }
        return false;
    }

    public String[] displaySuperPowers(){
        return superPowers;
    }

    public Boolean removePower(String power){
        for(int x = 0; x < superPowers.length; x++){
            String p = superPowers[x];
            if(p != null && p.equals(power)){
                superPowers[x] = null;
                return true;
            }
        }
        return false;
    }

    public String teamUp(Hero hero){
        String msg = String.format("%s teams up with %s!",this.alias,hero.alias);
        return msg;
    }

    public static int getHeroCount(){
        return heroCount;
    }

}
