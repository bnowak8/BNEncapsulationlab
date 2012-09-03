
package lab2;


public class GameCharacter {
    private String name, character;
    private int health;
    
    public GameCharacter(){
        
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        //Needs Verification
        this.name = name;
    }

    private String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        //Needs Verification
        this.character = character;
    }

    private int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        //Needs Verification
        this.health = health;
    }
    
}
