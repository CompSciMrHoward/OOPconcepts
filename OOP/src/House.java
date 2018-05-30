
public class House {

	public static void main(String[] args) {
		Mouse myMouse = new Mouse();
		//myMouse.name = "Minnie";
		//System.out.println(myMouse.name);
		//no inaccesable due to being private
		myMouse.setName("Minnie");
		System.out.println(myMouse.getName());
		myMouse.eat();
		myMouse.goToSleep();
		myMouse.eat();
		myMouse.eat();
		myMouse.wakeUp();
		myMouse.caughtInTrap();
		myMouse.eat();
		System.out.println(myMouse.cheeseEaten);
		if(myMouse.getName().equals("Minnie")) {
			System.out.println("Squeal!");
		}
	}

}
