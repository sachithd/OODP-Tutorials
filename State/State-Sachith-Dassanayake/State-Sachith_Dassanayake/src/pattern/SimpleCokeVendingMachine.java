package pattern;

/**
 * 
 * @author Sachith Dassanayake
 *
 */

/*
 * This is an example of a simple vending machine to demonstrate the state pattern.
 * 
 * The following assumptions were taken to develop the initial model of the software
 *  	1. Vending machine can accept only £1 coins
 *  	2. It only has one type of Coke bottles
 *  	3. The price of a bottle of coke is £1
 *  
 *  The coke vending machine has 4 states
 *  	1. SoldOutState 	//No coke available to sell
 *  	2. NoPoundSate	 	//No pound coin inserted
 *  	3. HasPoundState 	//Pound coin inserted
 *  	4. SoldState	 		//Successfully sold a coke
 *  
 *  It has the following state transitions
 *  	1. insertPound			
 *  	2. pressDispenseButton
 *  	3. pressEjectButton
 *  	4. dispenseACoke
 *  
 *  This model can be extended in future to add more states/state transitions easily because it has used the state design pattern 
 *  
 *  	eg: Adding 1 more state transition
 *  	5. refillCoke // refills the vending machine state from SoldOutState to NoPoundSate
 */

public class SimpleCokeVendingMachine {
	
	
	StatesInterface soldOutState;
	StatesInterface soldState;
	StatesInterface hasPoundState;
	StatesInterface noPoundState;
	
	StatesInterface currentState = soldOutState; //Initial state of the vending machine
	int cokeCount = 0;
	
	public SimpleCokeVendingMachine(int initialNoOfCoke)
	{
		soldOutState = new SoldOutState(this);
		noPoundState = new NoPoundState(this);
		hasPoundState = new HasPoundState(this);
		soldState = new SoldState(this);
		
		this.cokeCount = initialNoOfCoke;
		
		if (initialNoOfCoke > 0)
		{
			currentState = noPoundState;
		}
	}
	
	/**
	 * Custom toString() Method
	 */
	public String toString()
	{
		return "\n\nWaiting for a coin";
		
	}
	
	
	
	/**
	 * According to the current state we call the appropriate class method
	 * @return 
	 */
	
	public String insertPound()
	{
		return currentState.insertPound();
		
	}
	

	public Boolean pressDispenseButton()
	{
		currentState.pressDispenseButton();
		return currentState.dispenseACoke();
		
	}
	
	public String pressEjectButton()
	{
		return currentState.pressEjectButton();
		
	}
	
	public String refillCoke(int newCokeCount)
	{
		return currentState.refillCoke(newCokeCount);
	}
	
	/**
	 * Sets the new number of coke after refilling
	 * @param newCokeCount
	 */

	public void setCokeCount(int newCokeCount) {
		// TODO Auto-generated method stub
		this.cokeCount=newCokeCount;
	}
	
	
	/**
	 * Sets the new state as the current state
	 * @param newState
	 */
	public void setNewState(StatesInterface newState) {
		this.currentState = newState;
		
	}
	
	/**
	 * This method is called after the coke is dispensed
	 */
	
	public Boolean cokeDispensed()
	{
		System.out.println("Please collect your coke. Thanks for using state vending machine");
		
		//Reduce the coke count by one
		if (cokeCount != 0 )
		{
			cokeCount--;
		}
		return true;
	}

	

	/**
	 * Methods to return the current states and coke count
	 * @return
	 */
	public StatesInterface getHasPoundState() {
		// TODO Auto-generated method stub
		return hasPoundState;
	}


	public StatesInterface getNoPoundState() {
		// TODO Auto-generated method stub
		return noPoundState;
	}

	public StatesInterface getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}

	public StatesInterface getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}

	public int getCokeCount() {
		// TODO Auto-generated method stub
		return cokeCount;
	}
	

	

	

}
