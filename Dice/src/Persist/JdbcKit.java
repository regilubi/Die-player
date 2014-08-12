// Source file: c:/dice/Persist/JdbcKit.java

package Persist;

import Core.HighScore;

public class JdbcKit extends PersistKit {
    
    public JdbcKit() {
	pk=this;
    }
    /**
       @roseuid 38044FB50236
     */
    public HighScore makeKit() {
	return new HighScoreJDBC();
    }
}
