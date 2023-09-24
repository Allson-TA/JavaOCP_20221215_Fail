package day09_oop;

import day09_oop.real.Chihuahua;
import day09_oop.real.Shiba;
import day09_oop.spec.Dog;

public class PetStore {

	public static void main(String[] args) {
		
		Dog dog1 = new Shiba();
		Dog dog2 = new Chihuahua();
		System.out.println(Dog.legs);		
		
		dog1.eat();
		dog1.skill();
		dog2.eat();
		dog2.skill();
		
		Dog[] dogs = {dog1,dog2};
		for(Dog dog : dogs) {
			dog.eat();
			dog.skill();
		}

	}

}
