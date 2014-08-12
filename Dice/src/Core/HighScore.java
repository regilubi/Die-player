// Source file: c:/dice/Core/HighScore.java

package Core;

import java.util.*;
import java.awt.Component;
import UI.HighScoreView;

public abstract class HighScore extends Observable implements java.io.Serializable, Displayable {

	/**
	 * 
	 * @uml.property name="hs"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	protected static HighScore hs = null;

    public Vector entries=new Vector();
    
    protected HighScore() {
    }
    
    /**
       @roseuid 3801A3CF022F
     */
    public void add(Entry entry) {
	entries.addElement(entry);
	this.setChanged();
	this.notifyObservers();
    }
    
    public Enumeration elements() {
	return entries.elements();
    }

    /**
       @roseuid 3802E91F0117
     */
    public abstract void load();
    
    /**
       @roseuid 3802E92C0057
     */
    public abstract void save();

    public Component display() {
	Component c=new HighScoreView(this);
	this.addObserver((java.util.Observer)c);
	return c;
    }

    
    /**
       @roseuid 38074B2B0348
     */
    public static HighScore getInstance() {
	if (hs==null) {
	    new Error("No Persist Kit declared");
	}
	return hs;
    }
}
