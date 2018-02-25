package junit.Uber;

import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;

public class UberTests
{	
	// Set up testing helpers
	private static Random random = new Random();
	private static String[] names = new String[] {
		"Brittney Threet",
		"Ludivina Hensley",
		"Charlsie Beckstead",
		"Khadijah Geter",
		"Candelaria Truax",
		"Denice Lucero",
		"Abdul Creegan",
		"Jess Krebbs",
		"Eladia Duty",
		"Leanna Kyles",
		"Lester Anchondo",
	};
	
	private static String[] carModels = new String[] {
		"Dodge",
		"Audi",
		"Holden",
		"Suzuki",
		"BMW",
		"Aston Martin",
	};
	
	private static String randName() {
		return names[random.nextInt(names.length)];
	}
	
	private static String randCarModel() {
		return carModels[random.nextInt(carModels.length)];
	}

	private static long randWaitTime() {
		long scale = 500;		
		return (long) (1000 + random.nextDouble() * scale);
	}
	
	
	/*
	 * Test 0: Declaring Uber objects.
	 * [This test obliges you to create a class called "Uber".]
	 */
	Uber uber;
	
	// Clear the uber object before every test.
	@Before
	public void setUpUber() {
		uber = null;
	}
	
	/*
	 * Test 1: Constructing a basic Uber object.
	 * [This test obliges you to add a constructor with two parameters]
	 * 
	 */
	@Test
	public void testConstruction() {
		String driverName = randName();
		String carModel = randCarModel();
		uber = new Uber(driverName, carModel);
	}
	
	/*
	 * Test 2: Get the driver's name
	 * [This test obliges you to add a getter method for the driver's name]
	 */
	@Test
	public void tesDriverName() {
		String driverName = randName();
		String carModel = randCarModel();
		uber = new Uber(driverName, carModel);
		assertEquals(driverName, uber.getDriverName());
	}

	/*
	 * Test 3: Get the driver's car model.
	 * [This test obliges you to aadd a getter method for the driver's car model]
	 */
	@Test
	public void testCarModel() {
		String driverName = randName();
		String carModel = randCarModel();
		uber = new Uber(driverName, carModel);
		assertEquals(carModel, uber.getCarModel());
	}
	
	/*
	 * Test 4: Update the global fare rate.
	 * [This test obliges you to add a static field, static setter, and static getter for the fare rate] 
	 */
	@Test
	public void testSetFareRate() {
		double newFareRate = random.nextDouble() * 10;
		Uber.setFareRate(newFareRate);
		assertEquals(newFareRate, Uber.getFareRate(), 0.0);
	}
	
	/*
	 * Test 5: A simple job.
	 * [This test obliges you to add two methods for controlling jobs. The "setdownPassenger" method should
	 * return the cost of the job based on the fareRate and the time between pickup and setdown.]
	 */
	@Test
	public void testSimpleJob() throws InterruptedException {
		double fareRate = random.nextDouble() * 10;
		long waitTime = randWaitTime();
		double expectedFare = fareRate * (waitTime / 1000);
		
		// Run test
		Uber.setFareRate(fareRate);
		uber = new Uber(randName(), randCarModel());
		uber.pickupPassenger();
		Thread.sleep(waitTime);
		double actualFare = uber.setdownPassenger();
		
		// Check result
		assertEquals(expectedFare, actualFare, 2.0);
	}
	
	
	/*
	 * Test 6: A complex job.
	 * [This test obliges you to also consider a surge multiplier]
	 */
	@Test
	public void testComplexJob() throws InterruptedException {
		double surgeMultiplier = 1 + (random.nextDouble() * 10);
		double fareRate = random.nextDouble() * 10;
		long waitTime = randWaitTime();
		double expectedFare = fareRate * (waitTime / 1000) * surgeMultiplier;
		
		// Run test
		Uber.setFareRate(fareRate);
		uber = new Uber(randName(), randCarModel());
		uber.setSurgeMultiplier(surgeMultiplier);
		uber.pickupPassenger();
		Thread.sleep(waitTime);
		double actualFare = uber.setdownPassenger();
		


		// Check result
		assertEquals(expectedFare, actualFare, 2.0);
	}
}
