// Source file: c:/dice/Persist/HighScoreSr.java

package Persist;

import Core.HighScore;
import java.io.*;

public class HighScoreSr extends HighScore {
    /**
       Constance...
     */
    private static String filename = "C:\\temp\\high.sco";
    
    /**
       @roseuid 38044FD30185
     */
    public void load() {
	try {
	    FileInputStream istream = new FileInputStream(filename);
	    ObjectInputStream q = new ObjectInputStream(istream);
	    
	     hs = (HighScoreSr)q.readObject();                
	}
	catch (FileNotFoundException e) {
	    System.out.println("No file:"+filename+" found");
	    hs=this; // No file; conserve this as getInstance()...
	}
	catch (Exception e) {
	    e.printStackTrace();
	    new Error("Error while loading HighScore");
	}
    }
    
    /**
       @roseuid 38044FDB01A5
     */
    public void save() {
	try {
	    FileOutputStream ostream = new FileOutputStream(filename);
	    ObjectOutputStream p = new ObjectOutputStream(ostream);
	    
	    p.writeObject(this); // Write the tree to the stream.
	    p.flush();
	    ostream.close();    // close the file.
	} catch (Exception e) {
	    e.printStackTrace();
	    new Error("Error while Saving HighScore...");
	}
    }
    
    /**
       @roseuid 38074D930090
     */
    public HighScoreSr() {
	load();
    }
}
