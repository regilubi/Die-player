// Source file: c:/dice/UI/HighScoreView.java

package UI;

import java.util.*;
import java.awt.*;
import Core.HighScore;

public class HighScoreView extends Panel implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @uml.property name="m_HighScoreForm"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public HighScoreForm m_HighScoreForm;

    private java.awt.List l=null;

    public HighScoreView(Core.HighScore hs) {
	l=new java.awt.List(10);
	for (Enumeration e = hs.elements() ; e.hasMoreElements() ;) {
	    l.add(e.nextElement().toString());
	}	
	this.add(l);
    }
    /**
       @roseuid 3803329E00CA
     */
    public void update(Observable o, Object arg) {
	HighScore hs=(HighScore)o;
	l.clear();
	for (Enumeration e = hs.elements() ; e.hasMoreElements() ;) {
	    l.add(e.nextElement().toString());
	}
    }
}
