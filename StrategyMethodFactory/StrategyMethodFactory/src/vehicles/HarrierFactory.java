package vehicles;

public class HarrierFactory implements AirPlaneFactory {

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createFlying()
	 */
	@Override
	public Flying createFlying() {
		// TODO Auto-generated method stub
		FlyingFactory flyingFactory= new FlyingFactory();
		return flyingFactory.createFlying("Fighter Jet");
	}

	/* (non-Javadoc)
	 * @see vehicles.AirPlaneFactory#createLiftOff()
	 */
	@Override
	public LiftOff createLiftOff() {
		LiftOffFactory liftOffFactory = new LiftOffFactory();
		return liftOffFactory.createLiftOff("Fighter Jet");
	}

}
