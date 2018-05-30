
public class Builder {
	public static String mine = "String";
public static void main(String[] args) {
	Builder bob = new Builder();
	bob.setMine("Now");
	System.out.println(bob.mine);
}
public void setMine(String n) {
	this.mine = n;
}
}
