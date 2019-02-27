package package01;

import java.util.Random;

public class Example {

	public static void main(String[] args) {
		Animal animal = new Animal("dog", "run");

		System.out.println("--------------------method overload----------------------");
		animal.show();
		animal.show(true);

		System.out.println("--------------------method overwirte----------------------");
		animal = new Fish("fish", "swim", "5");
		animal.show();

		System.out.println("--------------------Polymorphism----------------------");
		animalShow();
	}

	private static void animalShow() {
		Random random = new Random();
		
		//initialize space for array
		Animal[] animalArray = new Animal[9];
		
		//initialize element in array
		for (int i = 0; i < animalArray.length; i++) {
			switch (random.nextInt(3)) {
			case 0:
				animalArray[i] = new Bird("bird" + i, "fly", "30");
				break;
			case 1:
				animalArray[i] = new Dog("dog" + i, "run", "60");
				break;
			case 2:
				animalArray[i] = new Fish("fish" + i, "fly", "10");
				break;
			}
		}
		
		//execute show method in element
		for (int j = 0; j < animalArray.length; j++) {
			animalArray[j].show();
		}		
	}

}
