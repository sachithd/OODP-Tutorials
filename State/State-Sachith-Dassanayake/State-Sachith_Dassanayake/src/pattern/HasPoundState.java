package pattern;
/**
 * 
 * @author Sachith Dassanayake
 *
 */
public class HasPoundState implements StatesInterface{
	SimpleCokeVendingMachine SimpleCVM;
	
	
	public HasPoundState(SimpleCokeVendingMachine scvm) {
		this.SimpleCVM = scvm;
	}

	/**
	 * Can not insert if a coin is already inserted
	 */
	@Override
	public String insertPound() {
		return "You have already inserted £1.00. Can not insert more";

	}

	/**
	 * Dispense a coke and changes the state to SoldSate
	 */
	@Override
	public String pressDispenseButton() {
		
		SimpleCVM.setNewState(SimpleCVM.getSoldState());
		return "Coke is now ready to dispense";
		
	}

	/**
	 * Returns the coin and change the current states to NoPoundSate
	 */
	@Override
	public String pressEjectButton() {
		
		SimpleCVM.setNewState(SimpleCVM.getNoPoundState());
		return "Ejecting the £1.00";
		
	}

	/**
	 *  Nothing will happen at this stage
	 * @return 
	 */
	@Override
	public Boolean dispenseACoke() {	
		System.out.println("Nothing happense here");
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
