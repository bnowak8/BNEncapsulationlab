
package lab2;

import javax.swing.JOptionPane;

public class Startup {

    
    
    public static void main(String[] args) {
    int n = 0;    
    GUI gui = new GUI();
    Game game = new Game();    
    gui.main();
    while (game.isValidPlayers() == false){
    try{
    game.setPlayers(Integer.parseInt(JOptionPane.showInputDialog("1 or 2 Players?")));
    game.setValidPlayers(true);
    }catch (NumberFormatException e){
        JOptionPane.showMessageDialog(gui,"You must enter a number!");   
        }
    }
    GameCharacter[] player = new GameCharacter[game.getPlayers()];
    
        System.out.println(game.getPlayers());
    for (int i = 0; i < player.length; i++){
    player[i] = new GameCharacter();
    player[i].setHealth(100);
    player[i].setLives(3);
    player[i].setName(JOptionPane.showInputDialog("Player " + (i + 1) + " Enter a name:"));
    System.out.print(player[i].getName() + " ");
    player[i].sit();
    }
    
    
    }
    
}
