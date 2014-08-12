// Source file: c:/dice/Persist/PersistKit.java

package Persist;

import Core.HighScore;

public abstract class PersistKit {

	/**
	 * 
	 * @uml.property name="pk"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	protected static PersistKit pk = null;

    protected PersistKit() {
    }

    public static PersistKit getInstance() {
	if (pk==null) {
	    new Error("No PersistKit declared");
	}
	return pk;
    }
    /**
       @roseuid 38044E22033B
     */
    public abstract HighScore makeKit();
}
