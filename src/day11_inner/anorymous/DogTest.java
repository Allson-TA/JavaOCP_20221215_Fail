package day11_inner.anorymous;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog() {
			
			public void eat() {
				System.out.println("牛肉罐頭");
			}
		};
		
		dog.eat();
		
		Dog dog2 = new Dog() {
			
			@Override
			public void eat() {
				System.out.println("豬肉條");
			}
		};
		
		dog2.eat();
		
		//	Lambda語法
		//	這裡的() = interface裡的()，方法如果有放參數也要跟著放
		Dog dog3 = () ->System.out.println("吃水果");
		dog3.eat();
	}

}
