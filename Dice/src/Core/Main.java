package Core;

import UI.MainForm;
import Persist.*;
import java.awt.*;

class Main {
    public static void main(String args[]) {
	 //SrKit srk=new SrKit();
	JdbcKit srk=new JdbcKit();
	DiceGame dg=DiceGame.getInstance();
	Frame f=MainForm.getInstance();
	f.setSize(300,300);
	f.show();
    }
}
