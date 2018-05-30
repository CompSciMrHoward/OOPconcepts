
public class Mouse {
//state variables
	//attributes of the class
private String name = "Mickey";
boolean isInTrap = false;
int cheeseEaten = 0;
boolean isSleeping = false; 
//Methods, what can a mouse do
	//change attributes of the mouse
public void caughtInTrap() {
	isInTrap = true;
	System.out.println("OOWWWHHHHHH!!!!!");
}
public void goToSleep() {
	isSleeping = true;
	System.out.println("SSSNNNNOOZZZEE");
    cheeseEaten = 0;
}
public void wakeUp() {
	isSleeping = false;
}
public void eat() {
	if(isSleeping || isInTrap) {
		return;
	}
	else {
	cheeseEaten++;
	System.out.println("Ate one piece of Cheese");
}}
//Getters, Accessors
	//return a state variables value
public String getName() {
	return name;
}
//Setters, Mutator
	//changes a state variables value
public void setName(String n) {
	this.name=n;
}


}
