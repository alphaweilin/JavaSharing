package package01;

public class Animal {
	
	//attribute
	private String name;
	private String move;
	
	//constructor method
	public Animal(String name, String move) {
		this.name = name;
		this.move = move;
	}
	
	//method
	public void show() {
		System.out.println("This is " + name + ", and I can " + move);
	}
	
	public void show(boolean isTired) {
		System.out.println("This is " + this.name + ", and I am tired");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}
	
	
}
