package pattern;
/**
 * 
 * @author Sachith Dassanayake
 *
 */
public class SoldState implements StatesInterface{

	SimpleCokeVendingMachine SimpleCVM;
	
	
	public SoldState(SimpleCokeVendingMachine scwm)
	{
		this.SimpleCVM = scwm;
	}
	
	
	/**
	 * Can not insert a coin until the previous transaction is completed
	 */
	@Override
	public String insertPound() {
		return "Please wait until the previous transaction is completed";
		
	}
	
	/**
	 *  Nothing should happen if this button is pressed at the SoldSate
	 */
	@Override
	public String pressDispenseButton() {
		return "You can only have 1 coke for £1.00";
		
	}
	
	/**
	 *  Can not eject coin after pressing the dispense button and a coke is sold
	 */
	@Override
	public String pressEjectButton() {
		return "We have already pressed the dispense Button";
		
	}

	/**	
	 * Dispensing a coke
	 */
	@Override
	public Boolean dispenseACoke() {
		
		//Dispense a coke
		Boolean blnDispensed = SimpleCVM.cokeDispensed();
		
		
		//Depend on the total number of coke remaining sets the new state
		if(SimpleCVM.getCokeCount() >0)
		{
			SimpleCVM.setNewState(SimpleCVM.getNoPoundState());
		
		}
		else
		{	
			System.out.println("Sorry sold out. No more coke");
			SimpleCVM.setNewState(SimpleCVM.getSoldOutState());
			
		}
		return blnDispensed;
		
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
