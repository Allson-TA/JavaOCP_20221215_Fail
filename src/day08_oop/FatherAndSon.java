package day08_oop;


class Father {
	
	Father(int x){
		this();
		System.out.println("F");
	}
	
	Father(){
		System.out.println("A");
	}
}

class Son extends Father {
	Son( ) {
		this(1.5 , 2.5);
		System.out.println("B"); 
	}
	
	Son(int x ,int y ) {
		this();
		System.out.println("D");
	}
	
	Son(double x ,double y ) {
		super(10);
		System.out.println("E");
	}
	
	Son(int x) {
		this(10,20);
		System.out.println("C");
	}
	
}


public class FatherAndSon {

	public static void main(String[] args) {
		
		Son son = new Son(100);
		
		
		

	}

}
