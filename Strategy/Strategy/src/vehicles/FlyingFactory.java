package vehicles;

public class FlyingFactory {

	public Flying createFlying(String string) {
		// TODO Auto-generated method stub
		if(string.equals("Fighter Jet"))
		{
			return new IFlyLikeFJ();
		}
		else if(string.equals("Model Airplane"))
		{
			return new IDontFly();
		}
		else if(string.equals("Passenger Airplane"))
		{
			return new IFlyLikePP();
		}
		else
		{
			return null;
		}
	}

}
