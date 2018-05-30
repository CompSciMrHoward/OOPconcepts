
public class Car implements Drivable{
	private int wrecks = 0;
	private int carHP = 100;
	//every Car has this value
	private static String alarm = "Beep-Beep-Beep";
	private static int maxSeats = 4;
	public int getMaxSeats() {
		return maxSeats;
	}
	public void turnLeft() {
		
	}
	public void turnRight() {
		
	}
	public int getNumOfWrecks() {
		return wrecks;
	}
	public int inCollision(int dmg) {
		this.carHP -= dmg;
		return this.carHP;
	}
}
