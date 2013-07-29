package vehicles;

public class LiftOffFactory {

	public LiftOff createLiftOff(String string) {
		// TODO Auto-generated method stub
		if(string.equals("Fighter Jet"))
		{
			return new ILiftOffV();
		}
		else if(string.equals("Model Airplane"))
		{
			return new IDontLiftOff();
		}
		else if(string.equals("Passenger Airplane"))
		{
			return new ILiftOffH();
		}
		else
		{
			return null;
		}
	}

}
