package day09_oop.spec;

//	要定義抽象類別 (半成品) abstract
//	抽象類別不能new ， 成品才可以new
public abstract class ADog implements Dog {

	@Override
	public void eat() {
		System.out.println("狗糧");
		
	}

}
