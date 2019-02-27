package package01;

public class Dog extends Animal {
	
	private String runSpeed;

	public Dog(String name, String move, String runSpeed) {
		super(name, move);
		this.runSpeed = runSpeed;
	}
	
	public void show() {
		System.out.println("This is " + super.getName() + ", and I can " + super.getMove() + " "+ this.runSpeed + "km/h");
	}

	public String getRunSpeed() {
		return runSpeed;
	}

	public void setRunSpeed(String runSpeed) {
		this.runSpeed = runSpeed;
	}
	

}
