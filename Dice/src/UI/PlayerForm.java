// Source file: c:/dice/UI/PlayerForm.java

package UI;

import java.awt.*;
import java.awt.event.*;
import Core.*;

public class PlayerForm extends Frame implements ActionListener {

	/**
	 * 
	 * @uml.property name="m_MainForm"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	public MainForm m_MainForm;

    private Button ok=new Button("Ok");
    private TextField tf=new TextField("Momo");
    private Button cancel=new Button("Cancel");

    public void actionPerformed(ActionEvent e) {
	if (e.getSource()==ok) {
	    okAction();
	}
	if (e.getSource()==cancel) {
	    cancelAction();
	}
	if (e.getSource()==tf) {
	    okAction();
	}
    }

    /**
       @roseuid 3802EA7B00DB
     */
    public void okAction() {
	DiceGame.getInstance().start(tf.getText());
	this.setVisible(false);
	Frame f=new RollForm();
	f.pack();
	f.setVisible(true);
    }
    
    /**
       @roseuid 3802EA7E03D9
     */
    public void cancelAction() {
	this.setVisible(false);
    }
    
    /**
       @roseuid 3802F96303E4
     */
    public PlayerForm() {
	this.setLayout(new BorderLayout());
	this.add("Center",tf);
	Panel south=new Panel();
	south.add(ok);
	ok.addActionListener(this);
	south.add(cancel);
	cancel.addActionListener(this);
	this.add("South",south);
    }
}
