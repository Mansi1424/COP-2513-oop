
public class Fan {



	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed = SLOW;
	boolean on = false;
	private double radius = 5;
	String color = "blue";

	Fan() {

	}

	public String getSpeed() {
		
		String s = " ";
		
		switch(speed) {
		case SLOW: s = "SLOW"; break;
		case MEDIUM: s = "MEDIUM"; break;
		case FAST: s = "FAST"; break;
		
		}
		return s;
		
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/** Sets fan on */
	public void turnOn() {
			on = true;
	}

	/** Sets fan off */ 
	public void turnOff() {
			on = false;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		if (on == true) {
			return "\nFan speed: " + getSpeed() + ", color: " + color + 
					 ", radius: " + radius + "\n";
		} else {
			return "\nfan is off";

		}

	}
}


