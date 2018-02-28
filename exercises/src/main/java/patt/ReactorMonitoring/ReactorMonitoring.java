package patt.ReactorMonitoring;

public class ReactorMonitoring {
	public static void main(String[] args) {
		// Install a sensor at Reactor A
		RadiationSensor sensor = new RadiationSensor("Reactor A", 10);

		// Create sensor observers
		RadiationMonitor control = new ControlRoom("Reactor A Control Room", 8.0);
		RadiationMonitor science = new ResearchCentre("Centre for Nuclear Research");

		// Attach observers to sensor
		sensor.addObserver(control);
		sensor.addObserver(science);

		// Simulate a scenario
		try {
			while (true) {
				sensor.readRadiation();
				Thread.sleep(4000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
