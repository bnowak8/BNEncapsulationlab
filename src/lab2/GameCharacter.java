
package lab2;


public class GameCharacter {
    private String name;
    private int health, lives;
    public boolean standing = true;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //Needs Verification
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 60 && health > 0){
            System.out.println("Low Health!!");
        }else if (health <= 0){
            System.out.println("You have died!");
        }
        this.health = health;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        if (lives == 2){
            System.out.println("Only Two Lives Left!");
        } else if (lives == 1){
            System.out.println("Only One Life left!");
        } else if (lives == 0){
            System.out.println("You Have No More Lives Left! Game Over!");
        }
        this.lives = lives;
    }
    
    public void sit(){
        System.out.println("sit");
        if (this.standing == true){
            this.standing = false;
        }else{
            System.out.println("You are already sitting!");
        }
    }
    public void stand(){
        if (this.standing == false){
            this.standing = true;
        }else{
            System.out.println("You are already standing!");
        }
    }
    
    public void walk(){
        if (this.standing == true){
            System.out.println("You are now walking!");
        }else{
            System.out.println("You must be standing to walk!");
        }
    }
    

    
}
