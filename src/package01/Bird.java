package package01;

public class Bird extends Animal{
	private String flySpeed;

	public Bird(String name, String move, String flySpeed) {
		super(name, move);
		this.flySpeed = flySpeed;
	}
	
	public void show() {
		System.out.println("This is " + super.getName() + ", and I can " + super.getMove() + " "+ this.flySpeed + "km/h");
	}

	public String getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(String flySpeed) {
		this.flySpeed = flySpeed;
	}

}
