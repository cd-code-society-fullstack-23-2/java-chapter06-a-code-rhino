## Lab Activity:Part A

**Objective**: Design a Marvel Superheroes database using Object-Oriented Programming. Apply encapsulation principles with access modifiers, use of static members, and ensure correct functionality with JUnit testing.

**Part 1: Build the Marvel Superhero Database**

1. **Hero Class**:

    - **Properties**:
        - `private String name`: The superhero's real name.
        - `private String alias`: The superhero's codename/alias.
        - `private String[] superPowers`: A array of max 5 superhero's powers.
        - `private String affiliation`: Superhero's team affiliation.
        - `private int healthPoints`: Superhero's health.
        - `private static int heroCount`: A static counter for total superheroes created.
    - **Methods**:
        - `public void addSuperpower(String power)`: Adds a new superpower to the hero's list of powers.
        - `protected boolean removeSuperpower(String power)`: Removes a specific superpower from the list.
        - `public List<String> displayPowers()`: Returns a list of superpowers.
        - `public String teamUpWith(Hero hero)`: Returns a statement of the hero teaming up with another hero.
        - `protected String battle(Hero opponent)`: During a battle, a random outcome decides who loses health points and returns the winner.
        - `public static int getHeroCount()`: Returns the total number of superhero objects created.
        - `public` getters and setters for each property (excluding the static heroCount).

    - **Constructor**:
        - The constructor should increment the `heroCount` each time a new superhero object is created.
        - Initialize the superPowers array to a size of 5

2. **Implementation**:
    - In the Main Class :
        -  	You should create at least 5 Marvel superhero objects.
        - Implement interactions between these superheroes.
        - Display the total count of superheroes using the static method.

**Part 2: JUnit Testing with JUnit 5**

1. **Setting Up**:
    - Make sure JUnit 5 library is added to your project.

2. **Writing Tests**:
    - For each public method in the `Hero` class, write corresponding tests in a separate `HeroTest` class.
    - Include a test for the static `getHeroCount()` method.

**UML**:

```
 +--------------------------------+
 |        Hero            		  |
 +--------------------------------+
 | - name: String                 |
 | - alias: String                |
 | - superpowers: String[String]  |
 | - affiliation: String          |
 | - healthPoints: int            |
 | - heroCount: int (static)      |
 +--------------------------------+
 | + Hero(name: String,           |
 |			alias: String,        |
 |        affiliation: String)    |
 | + addSuperpower(String): void  |
 | + displayPowers(:String[String]|
 | + teamUpWith(hero: Hero):String|
 | # removeSuperPower(String):boolean|
 | # battle(opponent: Hero): String |
 | + get/set Name(): String         |
 | + get/set Alias(): String        |
 | + get/set Affiliation(): String  |
 | + get/set HealthPoints(): int    |
 | + static getHeroCount(): int     |
 +----------------------------------+
```

**Lab Activity: Part B**

**Objective**: Design a Football Team database using Object-Oriented Programming. Apply encapsulation principles with access modifiers, use of static members, and ensure correct functionality with JUnit testing.

**Part 1: Build the Football Team Database**

1. **Player Class**:

    - **Properties**:
        - `private String name`: The player's full name.
        - `private int age`: The player's age.
        - `private String[] skills`: An array of a maximum of 5 skills (e.g., "Passing", "Shooting", etc.).
        - `private String position`: Player's position on the field (e.g., "Striker", "Defender", etc.).
        - `private int goalsScored`: Number of goals scored by the player.
        - `private static int playerCount`: A static counter for total players created.
    - **Methods**:
        - `public void addSkill(String skill)`: Adds a new skill to the player's list of skills.
        - `protected boolean removeSkill(String skill)`: Removes a specific skill from the list.
        - `public List<String> displaySkills()`: Returns a list of skills.
        - `public String teamUpWith(Player player)`: Returns a statement of the player teaming up with another player.
        - `protected String competeWith(Player opponent)`: During a match, a random outcome decides who scores and returns the scorer.
        - `public static int getPlayerCount()`: Returns the total number of player objects created.
        - `public` getters and setters for each property (excluding the static playerCount).

    - **Constructor**:
        - The constructor should increment the `playerCount` each time a new player object is created.

2. **Implementation**:
    - In the Main Class :
        -  	You should create at least 5 football player objects.
        - Implement interactions between these players.
        - Display the total count of players using the static method.

**Part 2: JUnit Testing with JUnit 5**

1. **Setting Up**:
    - Make sure JUnit 5 library is added to your project.

2. **Writing Tests**:
    - For each public method in the `Player` class, write corresponding tests in a separate `PlayerTest` class.
    - Include a test for the static `getPlayerCount()` method.

**UML**:

```
 +--------------------------------+
 |        Player                  |
 +--------------------------------+
 | - name: String                 |
 | - age: int                     |
 | - skills: String[]       |
 | - position: String             |
 | - goalsScored: int             |
 | - playerCount: int (static)    |
 +--------------------------------+
 | + Player(name: String,         |
 |			age: int,              |
 |        position: String)       |
 | + addSkill(String): void       |
 | + displaySkills():String[]|
 | + teamUpWith(player: Player):String|
 | # removeSkill(String): boolean |
 | # competeWith(opponent: Player): String |
 | + get/set Name(): String       |
 | + get/set Age(): int           |
 | + get/set Position(): String   |
 | + get/set GoalsScored(): int   |
 | + static getPlayerCount(): int |
 +----------------------------------+
```
