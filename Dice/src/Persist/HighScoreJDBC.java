// Source file: c:/dice/Persist/HighScoreJDBC.java

package Persist;

import Core.HighScore;
import java.sql.*;
import Core.Entry;
import java.util.*;

public class HighScoreJDBC extends HighScore {
    public static final String url="jdbc:odbc:dice";
    Connection con=null;

    public HighScoreJDBC() {
	try {
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //loads the driver
	    con=DriverManager.getConnection(url,"Administrateur","");
	} catch (Exception e) {
	    e.printStackTrace();
	    new Error("Cannot access Database at"+url);
	}
	hs=this; // register unique instance !
	this.load();
    }

    /**
       @roseuid 38044FD002EA
     */
    public void load() {
	try {
	    Statement select=con.createStatement();
	    ResultSet result=select.executeQuery
		("SELECT Name,Score FROM HighScore");
	    while (result.next()) {
		this.add(new Entry(result.getString(1), result.getInt(2)));
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    /**
       @roseuid 38044FD603B0
     */
    public void save() {
	try {
	    for (Enumeration e = this.elements() ; e.hasMoreElements() ;) {
		Entry entry=(Entry)e.nextElement();
		Statement s=con.createStatement();
		s.executeUpdate("INSERT INTO HighScore (Name,Score)"+
				"VALUES('"+entry.getName()+"',"+
				entry.getScore()+")");
	    }    
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
