
public class Car implements Drivable {
int wheels = 0;
static int maxLoad = 1500;//in lbs
static int numDoors = 4;
//applies and is the same for all Car objects
//method belongs to the CLASS, not any single object
public static void unlock(int buttonPress) {
	for(int x = 0; x < buttonPress; x++) {
		System.out.println("Beep-Beep");
	}
}
	public int getMaxLoad() {
		return maxLoad;
	}
	public void setWheels(int num) {
		this.wheels = num;
	}

	public int getWheels() {
		return wheels;
	}

	public void turnLeft() {
		System.out.println("Turning Left");
	}

	public void turnRight() {
		System.out.println("Turning Right");

	}

}
