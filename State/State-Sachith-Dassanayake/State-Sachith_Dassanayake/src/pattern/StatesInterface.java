package pattern;

/**
 * Defines all the activities of the coke vending machine
 * @author Sachith Dassanayake
 *
 */
public interface StatesInterface {

	public abstract String insertPound();

	public abstract String pressDispenseButton();

	public abstract String pressEjectButton();

	public abstract Boolean dispenseACoke();

	public abstract String refillCoke(int noOfCoke); //new state transition added
	

}