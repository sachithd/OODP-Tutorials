/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import vehicles.AirPlaneFactory;
import vehicles.Airplane;
import vehicles.FlyingFactory;
import vehicles.Flying;
import vehicles.HarrierFactory;

import vehicles.LiftOff;
import vehicles.LiftOffFactory;

/**
 * @author oded
 *
 */
public class AirplaneTest {

	/* Commented below Errors are due to these lines being commented
	 * 
	 * private static FlyingFactory flyingFactory;
	private static LiftOffFactory liftOffFactory;
	
	@BeforeClass
	public static void onlyOnce(){
		flyingFactory = new FlyingFactory();
		liftOffFactory = new LiftOffFactory();
	}*/


	@Test
	public void test1() {
		
		AirPlaneFactory harrierFactory= new HarrierFactory();
				
		String expectedOutput = "Like a fighter jet";
		String stringReturned = null;
		
		Flying fly = harrierFactory.createFlying();

		LiftOff liftOff = harrierFactory.createLiftOff();

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	
	@Test
	public void test2() {
				
		String expectedOutput = "I don't Fly";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Model Airplane");
		LiftOff liftOff = liftOffFactory.createLiftOff("Horizontally");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test3() {
				
		String expectedOutput = "Like a passenger airplane";
		String stringReturned = null;
		
		Flying fly = flyingFactory.createFlying("Passenger Airplane");
		LiftOff liftOff =  liftOffFactory.createLiftOff("Horizontally");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouFly();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	
	@Test
	public void test4() {
				
		String expectedOutput = "Vertically";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff =  liftOffFactory.createLiftOff("Vertically");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}
	
	@Test
	public void test5() {
				
		String expectedOutput = "I don't LiftOff";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = liftOffFactory.createLiftOff("don't");;

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}

	@Test
	public void test6() {
				
		String expectedOutput = "Horizontally";
		String stringReturned = null;

		Flying fly = flyingFactory.createFlying("Fighter Jet");
		LiftOff liftOff = liftOffFactory.createLiftOff("Horizontally");

		Airplane classUnderTest = new Airplane(liftOff,fly);

		stringReturned = classUnderTest.howDoYouLiftOff();

		assertEquals("Wrong Answer !", expectedOutput, stringReturned);

		}


}
