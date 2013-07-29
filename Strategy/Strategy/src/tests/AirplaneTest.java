/**
 * 
 */
package tests;

import static org.junit.Assert.*; 

import org.junit.BeforeClass;
import org.junit.Test;

import vehicles.Airplane;
import vehicles.FlyingFactory;
import vehicles.IFlyLikeFJ;
import vehicles.Flying;
import vehicles.IDontLiftOff;
import vehicles.ILiftOffH;
import vehicles.LiftOff;
import vehicles.IFlyLikePP;
import vehicles.ILiftOffV;
import vehicles.IDontFly;
import vehicles.LiftOffFactory;

/**
 * @author oded
 *
 */
public class AirplaneTest {

	private static FlyingFactory flyingFactory;
	private static LiftOffFactory liftOffFactory;
	
	@BeforeClass
	public static void onlyOnce(){
	flyingFactory= new FlyingFactory();
	liftOffFactory = new LiftOffFactory();
	}

	
	
	
	@Test
	public void test1() {
			
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		//Flying fly = new IFlyLikeFJ();
		Flying fly = flyingFactory.createFlying("Fighter Jet");
		//LiftOff liftOff = new ILiftOffV();

		LiftOff liftOff = liftOffFactory.createLiftOff("Fighter Jet");
		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		
		//Flying fly = new IDontFly();
		Flying fly = flyingFactory.createFlying("Model Airplane");
		//LiftOff liftOff = new ILiftOffV();
		LiftOff liftOff = liftOffFactory.createLiftOff("Model Airplane");
		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
		//Flying fly = new IFlyLikePP();
		Flying fly = flyingFactory.createFlying("Passenger Airplane");
		//LiftOff liftOff = new ILiftOffV();
		LiftOff liftOff = liftOffFactory.createLiftOff("Passenger Airplane");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Flying fly = new IFlyLikeFJ();
		//LiftOff liftOff = new ILiftOffV();
		LiftOff liftOff = liftOffFactory.createLiftOff("Fighter Jet");
		
		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Flying fly = new IFlyLikeFJ();
		//LiftOff liftOff = new IDontLiftOff();
		LiftOff liftOff = liftOffFactory.createLiftOff("Model Airplane");
		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;

		Flying fly = new IFlyLikeFJ();
		//LiftOff liftOff = new ILiftOffH();
		LiftOff liftOff = liftOffFactory.createLiftOff("Passenger Airplane");
		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
