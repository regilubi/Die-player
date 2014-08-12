// Source file: c:/dice/Core/DiceGame.java

package Core;

public class DiceGame {

	/**
	 * 
	 * @uml.property name="dg"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private static DiceGame dg = null;

	/**
	 * 
	 * @uml.property name="dies"
	 * @uml.associationEnd multiplicity="(0 -1)"
	 */
	private Die dies[] = new Die[2];

	/**
	 * 
	 * @uml.property name="thePlayer"
	 * @uml.associationEnd multiplicity="(0 1)"
	 */
	private Player thePlayer = null;

    
    /**
       @roseuid 37F877B3027B
     */
    private DiceGame() {
	dies[0]=new Die();
	dies[1]=new Die();
	Persist.PersistKit.getInstance().makeKit();
    }
    
    /**
       @roseuid 3802F61403A0
     */
    public static DiceGame getInstance() {
	if (dg==null) {
	    dg=new DiceGame();
	}
	return dg;
    }
    
    /**
       @roseuid 37F8781A014D
     */
    public void start(String playerName) {
	thePlayer=new Player(playerName);
    }
    
    public Die getDie(int i) {
	return dies[i];
    }
    
    public Player getPlayer() {
	return thePlayer;
    }

}
