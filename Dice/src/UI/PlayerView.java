// Source file: c:/dice/UI/PlayerView.java

package UI;

import Core.Player;
import java.awt.*;
import java.io.*;
import java.util.*;

public class PlayerView extends Panel implements Observer {

	/**
	 * 
	 * @uml.property name="m_RollForm"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public RollForm m_RollForm;

    private Label nameLabel;
    private Label scoreLabel;
    private Label turnLabel;

    /**
       @roseuid 3802FC5C030B
     */
    public PlayerView(Player player) {
	this.add(nameLabel=new Label("Name:"+player.getName()));
	this.add(scoreLabel=new Label("Score:"+player.getScore()));
	this.add(turnLabel=new Label("Turn:"+player.getTurn()));
		 
    }
    
    /**
       @roseuid 38033290003D
     */
    public void update(Observable o, Object arg) {
	scoreLabel.setText("Score:"+((Player)o).getScore());
	turnLabel.setText("Turn:"+((Player)o).getTurn());
    }
    
}
