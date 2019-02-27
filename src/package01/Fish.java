package package01;

public class Fish extends Animal {
	private String swimSpeed;

	public Fish(String name, String move, String swimSpeed) {
		super(name, move);
		this.swimSpeed = swimSpeed;
	}
	
	public void show() {
		System.out.println("This is " + super.getName() + ", and I can " + super.getMove() + " "+ this.swimSpeed + "km/h");
	}

	public String getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(String swimSpeed) {
		this.swimSpeed = swimSpeed;
	}

}
