// Source file: c:/dice/Core/Die.java

package Core;

import Util.Randomizer;
import UI.DieView;
import java.util.*;
import java.awt.Component;

public class Die extends Observable implements Displayable {
    private int faceValue = 1;
    
    /**
       @roseuid 37F1D8180081
     */
    public int roll() {
	setValue(Randomizer.getInstance().getValue());
	return getValue();
    }
    
    /**
       @roseuid 37F877590087
     */
    public Die() {
    }
    
    /**
       @roseuid 3802FCB70366
     */
    public java.awt.Component display() {
	Component c=new DieView(this);
	this.addObserver((Observer)c);
	return c;
    }
    
    /**
       @roseuid 3806E272026C
     */
    public void setValue(int value) {
	faceValue=value;
	this.setChanged();
	this.notifyObservers();
    }
    public int getValue() {
	return faceValue;
    }
}
