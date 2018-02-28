package patt.ReactorMonitoring;

import java.util.Observable;

public class RadiationSensor extends Observable {

	/**
	 * Constructs a RadiationSensor object
	 * 
	 * @param location.
	 *            An arbitrary location.
	 * @param seed.
	 *            A seed for the random number generator used to simulate radiation
	 *            readings.
	 */
	public RadiationSensor(String location, int seed) {

	}

	/**
	 * Gets the location
	 * 
	 * @return location
	 */
	public String getLocation() {
		return null;
	}

	/**
	 * Gets the radiation
	 * 
	 * @return radiation
	 */
	public double getRadiation() {
		return 0;
	}

	/**
	 * Updates radiation, changes the state to true, and notifies all observers of
	 * the change.
	 */
	public void readRadiation() {

	}

}
