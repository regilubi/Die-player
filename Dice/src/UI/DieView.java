// Source file: c:/dice/UI/DieView.java

package UI;

import java.awt.*;
import Core.Die;
import java.util.*;

public class DieView extends Panel implements Observer {

	/**
	 * 
	 * @uml.property name="m_RollForm"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private RollForm m_RollForm;

    private Label l;
    /**
       @roseuid 3802FD09010C
     */
    public DieView(Die die) {
	this.add(l=new Label("Die:"+die.getValue()));
    }
    
    /**
       @roseuid 3811D44701E6
     */
    public void update(Observable o, Object arg) {
	l.setText("Die:"+((Die)o).getValue());
    }
    
  
}

