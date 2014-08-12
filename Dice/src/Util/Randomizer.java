// Source file: c:/dice/Util/Randomizer.java

package Util;

import java.util.Random;

public class Randomizer {
    private Random random;

	/**
	 * 
	 * @uml.property name="r"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private static Randomizer r = null;

    
    /**
       @roseuid 38032F410003
     */
    public static Randomizer getInstance() {
	if (r==null) {
	    r=new Randomizer();
	}
	return r;
    }
    
    /**
       @roseuid 38032F600120
     */
    public int getValue() {
	return (random.nextInt(6)+1);
    }
    
    /**
       @roseuid 3807471203B7
     */
    private Randomizer() {
	random=new Random();
    }
}
