
public class Dog {
	boolean isSleeping = false;
	String name = "";
	int numTimesFed = 0;
	//default constructor
		//returnType is omitted
	public Dog() {
		
	}
	public Dog(String n) {
		this.name = n;
	}
	public Dog(String n, boolean is) {
		this.name = n;
		this.isSleeping = is;
	}
	public String getName() {
		return this.name;
	}
	public void feed() {
		if(!isSleeping)
			numTimesFed++;
	}
	public int getFeed() {
		return numTimesFed;
	}

}
