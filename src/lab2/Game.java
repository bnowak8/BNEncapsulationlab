/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Timer;

public class Game {
    private int players;
    private boolean validPlayers;
    
    Timer timer = new Timer();
    

    public Game(){
        
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {

        this.players = players;
       
    }

    public boolean isValidPlayers() {
        return validPlayers;
    }

    public void setValidPlayers(boolean validPlayers) {
        this.validPlayers = validPlayers;
    }

    
}
