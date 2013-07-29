package pattern;
/**
 * 
 * @author Sachith Dassanayake
 *
 */
public class SoldOutState implements StatesInterface{

	SimpleCokeVendingMachine simpleCVM; 
	
	public SoldOutState(SimpleCokeVendingMachine scvm) {
		this.simpleCVM = scvm;
	}

	@Override
	public String insertPound() {
		return "Sorry can not insert. Machine is sold Out";
		
	}

	@Override
	public String pressDispenseButton() {
		return "Sorry. Sold Out";
		
	}

	@Override
	public String pressEjectButton() {
		return "Cannot eject. Sold Out";
		
	}

	@Override
	public Boolean dispenseACoke() {
		System.out.println("Can not dispense. Sold Out");
		return false;
		
	}
	
	/**
	 *  Refilling the vending machine
	 */
	@Override
	public String refillCoke(int noOfCoke) {
		simpleCVM.setCokeCount(noOfCoke);
		simpleCVM.setNewState(simpleCVM.getNoPoundState());
		return "Vending machine refilled";
		
	}


}
