// Source file: c:/dice/UI/MainForm.java

package UI;

import java.awt.*;
import java.awt.event.*;
import Core.*;

public class MainForm extends Frame implements ActionListener {

	/**
	 * 
	 * @uml.property name="pf"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private PlayerForm pf;

	/**
	 * 
	 * @uml.property name="hf"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private HighScoreForm hf;

	/**
	 * 
	 * @uml.property name="rf"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private RollForm rf;

    
    private Button start=new Button("Start");
    private Button quit=new Button("Quit");
    private Button high=new Button("HighScore");

	/**
	 * 
	 * @uml.property name="mf"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private static MainForm mf = null;

    
    public void actionPerformed(ActionEvent e) {
	if (e.getSource()==start) {
	    startAction();
	}
	if (e.getSource()==quit) {
	    quitAction();
	}
	if (e.getSource()==high) {
	    highAction();
	}
    }

    /**
       @roseuid 3802EA490314
     */
    public void quitAction() {
	HighScore.getInstance().save();
	System.exit(0);
    }
    
    /**g
       @roseuid 3802EA6501F2
     */
    public void startAction() {
	pf=new PlayerForm();
	pf.pack();
	pf.setVisible(true);
    }
    
    /**
       @roseuid 3802EA6A0145
     */
    public void highAction() {
	hf=new HighScoreForm();
	hf.pack();
	hf.setVisible(true);
    }
    
    /**
       @roseuid 3802F8E60036
     */
    private MainForm() {
	this.setLayout(new BorderLayout());
	Panel south=new Panel();
	south.add(start);
	start.addActionListener(this);
	south.add(high);
	high.addActionListener(this);
	south.add(quit);
	quit.addActionListener(this);
	this.add("South",south);
    }

    public static MainForm getInstance() {
	if (mf==null) {
	    mf=new MainForm();
	}
	return mf;
    }
}
