
public class House {

	public static void main(String[] args) {
		Mouse myMouse = new Mouse();
		//myMouse.name = "Jerry";
		//System.out.println(myMouse.name);
			//variable now private
		myMouse.setName("Minnie");
		System.out.println(myMouse.getName());
		myMouse.eat();
		myMouse.goToSleep();
		myMouse.eat();
		myMouse.wakeup();
		myMouse.caughtInTrap();
		System.out.println(myMouse.cheeseEaten);
		//in listen method
		if(myMouse.getName().equals("Minnie")) {
			System.out.println("Chirp Chirp");
		}
		else {
			System.out.println("growl!");
		}
	}

}
