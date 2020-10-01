
public class Stopwatch {
	// Private data fields startTime and endTime with getter methods
	private long startTime;
	private long endTime;

	//Getter Method for start time
	public long getStartTime() {
		return startTime;
	}

	//Getter Method for end time
	public long getEndTime() {
		return endTime;
	}

	// A no-arg constructor that initializes startTime with current time
	public Stopwatch() {
		startTime = System.currentTimeMillis();
	}

	// A method named start() that resets startTime with current time.
	public void start() {
		startTime = System.currentTimeMillis();
	}

	// A method named stop() that sets the endTime to current time.
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	/*
	 * A method named getElapsedTime that returns the elapsed time for the stop
	 * watch in milliseconds.
	 */
	public long getElapsedTime() {
		return getEndTime() - getStartTime();
	}

}
