
public class Mouse {
private String name = "Mickey";
int cheeseEaten = 0;
boolean isInTrap = false, isSleeping = false;
public void goToSleep() {
	isSleeping = true;
	cheeseEaten = 0;
	System.out.println("ZZZZzzzzzzz...");
}
public void wakeup() {
	isSleeping = false;
	System.out.println("Yawn!");
}
public void caughtInTrap() {
	isInTrap = true;
	System.out.println("Squeal!!!");
}
public void eat() {
	if(isSleeping || isInTrap) {
		return;
	}
	else {
	cheeseEaten++;
	}
}
//Accessor, Getter(Java)
	//return the value of a state variable
public String getName() {
	return name;
}
//Mutator, Setter
	//changes value of state variable
public void setName(String n) {
	name = n;
}
}
