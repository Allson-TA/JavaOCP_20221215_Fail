//	一般內部類別
package day11_inner.inner;

//	一般外部類別
public class Button {
	int x =666;
	
//	一般內部類別
	public class Click {
		int x =66;
		
		//	按下之後要做的事
		public void action(){
			int x =6;
			System.out.println("Button被按");
			System.out.println(x);
			System.out.println(this.x);	// 77
			System.out.println(Button.this.x);
		}
		
	}
	
	
}

//	內部類別 不可以有 static