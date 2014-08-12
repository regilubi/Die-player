// Source file: c:/dice/UI/RollForm.java

package UI;

import java.awt.*;
import java.awt.event.*;
import Core.*;

public class RollForm extends Frame implements ActionListener {

	/**
	 * 
	 * @uml.property name="m_MainForm"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public MainForm m_MainForm;

	/**
	 * 
	 * @uml.property name="thePlayerView"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public PlayerView thePlayerView;

	/**
	 * 
	 * @uml.property name="theDieView"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 */
	public DieView theDieView[];

    public Button ok=new Button("Ok");
    public Button cancel=new Button("Cancel");


    public void actionPerformed(ActionEvent e) {
	if (e.getSource()==ok) {
	    rollAction();
	}
	if (e.getSource()==cancel) {
	    cancelAction();
	}
    }

    /**
       @roseuid 3802EA8C016C
     */
    public void rollAction() {
	Player p= DiceGame.getInstance().getPlayer();
	if (p.getTurn()<10) {
	    p.play();
	} else {
	    HighScore.getInstance().add(new Entry(p.getName(),p.getScore()));
	    this.setVisible(false);
	}
    }
    
    /**
       @roseuid 3802EA920193
     */
    public void cancelAction() {
	this.setVisible(false);
    }
    
    /**
       @roseuid 3802FA7F020B
     */
    public RollForm() {

	this.setLayout(new BorderLayout());

	this.add("North",DiceGame.getInstance().getPlayer().display());

	Panel p=new Panel();
	p.add(DiceGame.getInstance().getDie(0).display());
	p.add(DiceGame.getInstance().getDie(1).display());
	this.add("Center", p);
	Panel south=new Panel();
	
	south.add(ok);
	ok.addActionListener(this);
	south.add(cancel);
	cancel.addActionListener(this);

	this.add("South",south);
    }
}

