
public class Builder extends Person implements iBuildable, iLivable{
int bricksLaid = 0;
private static String message = "Your quote for this job is ";


public Builder() {
	
}
public Builder(int num) {
	this.bricksLaid = num;
}
public Builder(String name, int num) {
	
}
public void setMessage() {
	this.message = "new String";
}
	public void placeBrick(int num) {
		bricksLaid+=num;
	}
	public int getBricksLaid() {
		return bricksLaid;
	}
	

}
