package day11_inner.method;

public class Bar {
	int a =100;	//	物件變數
	
	public void foo() {
		int b = 200;	//	區域變數 (Java7時代，要加上final才可以給方法內部類別使用)
		int c = 300;
		//	只要定義完之後就不可在變動
		
		//	方法內部類別
		class Inner {
			void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
		
		//	建立方法內部類別實體
		Inner inner = new Inner();
		inner.print();
	}
}
