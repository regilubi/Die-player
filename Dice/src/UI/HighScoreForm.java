// Source file: c:/dice/UI/HighScoreForm.java

package UI;

import java.awt.*;
import java.awt.event.*;
import Core.HighScore;

public class HighScoreForm extends Frame implements ActionListener {

	/**
	 * 
	 * @uml.property name="hv"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private HighScoreView hv;

	/**
	 * 
	 * @uml.property name="mf"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private MainForm mf;

    
    private Button close=new Button("Close");

    public void actionPerformed(ActionEvent e) {
	if (e.getSource()==close) {
	    closeAction();
	}
    }

    

    public HighScoreForm() {
	this.setLayout(new BorderLayout());
	this.add("South",close);
	close.addActionListener(this);
	this.add("Center",HighScore.getInstance().display());
    }
    /**
       @roseuid 3802EAA103E3
     */
    public void closeAction() {
	this.setVisible(false);
    }
    
}
