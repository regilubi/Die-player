// Source file: c:/dice/Core/Player.java

package Core;

import java.util.*;
import UI.PlayerView;
import java.awt.Component;

public class Player extends Observable implements Displayable {
    private String name;
    private int score = 0;
    private int turn=0;
    private final int WIN_NUMBER=7;
    private final int WIN_SCORE=10;
    
    /**
       @roseuid 37F878B80208
     */
    public Player(String name) {
	this.name=name;
    }

    private Die die1() {
	return DiceGame.getInstance().getDie(0);
    }

    private Die die2() {
	return DiceGame.getInstance().getDie(1);
    }

    public void play() {
	int d1=die1().roll();
	int d2=die2().roll();
	if ((d1+d2)==WIN_NUMBER) {
	    setScore(score+WIN_SCORE);
	}
	setTurn(getTurn()+1);
    }
    
    /**
       @roseuid 3802FC0103DD
     */
    public Component display() {
	Component c=new PlayerView(this);
	this.addObserver((Observer)c);
	return c;
    }

	/**
	 * 
	 * @uml.property name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @uml.property name="score"
	 */
	public int getScore() {
		return score;
	}

	/**
	 * 
	 * @uml.property name="turn"
	 */
	public int getTurn() {
		return turn;
	}

	/**
	 * 
	 * @uml.property name="turn"
	 */
	public void setTurn(int value) {
		turn = value;
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * 
	 * @uml.property name="score"
	 */
	public void setScore(int value) {
		score = value;
		this.setChanged();
		this.notifyObservers();
	}

}

