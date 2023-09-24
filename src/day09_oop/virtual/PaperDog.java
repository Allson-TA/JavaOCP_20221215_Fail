package day09_oop.virtual;

import day09_oop.spec.TDog;

public class PaperDog extends TDog {

	
	
	@Override
	public void eat() {
		System.out.println("吃紙");
		super.eat();
	}

	@Override
	public void skill() {
		System.out.println("訓練腦力");
		
	}

	
}
