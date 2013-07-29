package test;


import static org.junit.Assert.*;

import org.junit.Test;

import pattern.SimpleCokeVendingMachine;


/**
 * Few test cases to test the application
 * @author Sachith Dassanayake
 * 
 * Please note that in some test cases 
 * I have printed messages on the Terminal to make it easier to understand the application
 */

public class VendingMachineTest {


	/**
	 * Test case for inserting a £1.00
	 */
	
	@Test
	public void test1() {
		
		SimpleCokeVendingMachine scvm = new SimpleCokeVendingMachine(2); //Initialise the coke machine with 2 coke bottles
		
		System.out.println("Test 1 results ..... ");
		String expectedOutput = "Inserted a £1 coin";
		String stringReturned = null;
		stringReturned = scvm.insertPound();
		System.out.println(stringReturned);
		assertEquals("Wrong Answer !", expectedOutput, stringReturned);
		
	}
	
	/**
	 * Test case if inserted another £1.00
	 */
	
	@Test
	public void test2() {
		
		SimpleCokeVendingMachine scvm = new SimpleCokeVendingMachine(2); //Initialise the coke machine with 2 coke bottles
		
		System.out.println("\n\nTest 2 results ..... ");
		
		String expectedOutput = "You have already inserted £1.00. Can not insert more";
		String stringReturned = null;
		
		stringReturned = scvm.insertPound();
		System.out.println(stringReturned);
		stringReturned = scvm.insertPound();
		System.out.println(stringReturned);
		assertEquals("Wrong Answer !", expectedOutput, stringReturned);
		
	}
	
	/**
	 * Test case for if pressed dispense button without a coin
	 */
	
	@Test
	public void test3() {
		
		SimpleCokeVendingMachine scvm = new SimpleCokeVendingMachine(5); //Initialise the coke machine with 5 coke bottles
		
		System.out.println("\n\nTest 3 results ..... ");
		
		Boolean expectedOutput = false;
		Boolean booleanReturned = null;
		booleanReturned = scvm.pressDispenseButton();
		
		assertEquals("Wrong Answer !", expectedOutput, booleanReturned);
		
	}
	
	/**
	 * Test case for successful transaction
	 * 
	 */
	
	@Test
	public void test4() {
		
		SimpleCokeVendingMachine scvm = new SimpleCokeVendingMachine(2); //Initialise the coke machine with 2 coke bottles

		System.out.println("\n\nTest 4 results ..... ");	
	
		Boolean expectedOutput = true;
		Boolean booleanReturned = null;
		
		scvm.insertPound();
		booleanReturned = scvm.pressDispenseButton();
		
		assertEquals("Wrong Answer !", expectedOutput, booleanReturned);
		
		
		
		
		
	}
	
	
	/**
	 * Test for refill coke
	 */
	
	@Test
	public void test5() {
		
		SimpleCokeVendingMachine scvm = new SimpleCokeVendingMachine(1); //Initialise the coke machine with 1 coke bottle

		System.out.println("\n\nTest 5 results ..... ");	
	
		Boolean expectedOutput = true;
		Boolean booleanReturned = null;
		
		scvm.insertPound();
		scvm.pressDispenseButton(); //After this there will be no more coke available
		
		System.out.println(scvm.refillCoke(5)); //Refills the machine with 5 bottles
		
		
		//Now we try to buy more
		scvm.insertPound();
		booleanReturned = scvm.pressDispenseButton();
		
		
		assertEquals("Wrong Answer !", expectedOutput, booleanReturned);
		
		
		
		
		
	}
	

}
