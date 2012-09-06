/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Timer;
import javax.swing.JOptionPane;

public class Game{
    private int players = 0;
    private boolean validPlayers = false;
     
    Timer timer = new Timer();
    

    public Game(){
        
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        if (players > 2 || players < 0){
            validPlayers = false;
            
        }else{
        this.players = players;
        }
    }

    public boolean isValidPlayers() {
        return validPlayers;
    }

    public void setValidPlayers(boolean validPlayers) {
        this.validPlayers = validPlayers;
    }

    
}
