
package lab2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Startup {
    String name;
    
    
    public static void main(String[] args) {
    
    GUI gui = new GUI();
    Game game = new Game();
    
    gui.main();
    try{
    int i = Integer.parseInt(JOptionPane.showInputDialog("How Many Players"));
    }catch (NumberFormatException e){
        System.out.println("You must enter a number!");
        
    }
    
    GameCharacter player1 = new GameCharacter();
    
    player1.setHealth(100);
    player1.setLives(3);
    player1.setName(JOptionPane.showInputDialog("Player 1 Enter a name:"));
    
    
    }
    
}
