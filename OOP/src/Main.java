
public class Main {

	public static void main(String[] args) {
		ShihTzu benny = new ShihTzu();
		benny.handstand();
		Car tesla = new Car();
		Car volvo = new Car();
		System.out.println("Tesla max load " + tesla.getMaxLoad() );
		System.out.println("Volvo max load " + volvo.getMaxLoad() );
		tesla.unlock(2);
		volvo.unlock(3);
		
		
		
		
/*		Dog Jim = new Dog();
		//Jim.setName("Jim");
		Dog Sam = new Dog("Sam");
		System.out.println(Sam.getName());
		Dog Pam = new Dog("Name", true);
		Pam.feed();
		Pam.feed();
		System.out.println(Pam.getFeed());
		*/
		
	}

}
