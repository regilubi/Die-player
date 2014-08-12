// Source file: c:/dice/Persist/SrKit.java

package Persist;

import Core.HighScore;

public class SrKit extends PersistKit {
    
    /**
       @roseuid 38044FBA008F
     */
    public HighScore makeKit() {
	return new HighScoreSr();
    }
    
    /**
       @roseuid 38074C190123
     */
    public SrKit() {
	pk=this;
    }
}
