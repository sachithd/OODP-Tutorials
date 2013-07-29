package pattern;

/**
 * Implementation of No pound state class
 * @author Sachith Dassanayake
 *
 */
public class NoPoundState implements StatesInterface {
	
	SimpleCokeVendingMachine simpleCokeVM;
	

	public NoPoundState(SimpleCokeVendingMachine scvm)
	{
		this.simpleCokeVM = scvm;
	}
	
	/**
	 * If a customer inserts a pound it changes the current state to HasPoundState.
	 */
	@Override
	public String insertPound()
	{
		simpleCokeVM.setNewState(simpleCokeVM.getHasPoundState());
		return "Inserted a £1 coin";
	}
	
	/**
	 *  If pressed dispenser button at NoPoundState displays a message 
	 */
	@Override
	public String pressDispenseButton()
	{
		return "Please insert £1.00 coin";
	}
	
	/**
	 *  Can not eject the coin at this state 
	 */
	@Override
	public String pressEjectButton()
	{
		return "No coin inserted. Nothing to eject.";
	}
	
	/**
	 *   Can not dispense a coke without money.
	 * @return 
	 */
	@Override
	public Boolean dispenseACoke()
	{
		System.out.println("Can not dispense without £1.00");
		return false;
	}
	
	/**
	 * We do not need to refill at this stage
	 */
	@Override
	public String refillCoke(int noOfCoke) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
