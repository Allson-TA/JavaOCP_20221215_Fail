package day11_inner.static_inner;

public class ButtonTest {

	public static void main(String[] args) {
		
		//	第一種寫法
		Button button = new Button();
		Button.Click click = button.new Click();
		click.action();

		//	第二種寫法
		Button.Click click2 = new Button().new Click();
		click2.action();
		
		//	內部類別
		Button.Dblclick dblclick = new Button.Dblclick();
		dblclick.action();
	}

}
