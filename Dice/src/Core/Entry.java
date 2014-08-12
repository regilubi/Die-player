// Source file: c:/dice/Core/Entry.java

package Core;

import java.io.Serializable;

public class Entry implements Serializable {
    private String  name;
    private int score;
    
    /**
       @roseuid 3801A33002D0
     */
    public Entry(String name,int score) {
	this.name=name;
	this.score=score;
    }

	/**
	 * 
	 * @uml.property name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @uml.property name="score"
	 */
	public int getScore() {
		return score;
	}

    public String toString() {
	return getName()+","+getScore();
    }
}
