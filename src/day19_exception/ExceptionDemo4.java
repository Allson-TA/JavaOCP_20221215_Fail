package day19_exception;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		try {
			boolean isPass = login("admin","1234");
			System.out.printf("登入資訊 : %b\n",isPass);
		} catch(Exception e) {
			System.out.printf("登入錯誤訊息= "+ e.getMessage());
		}
		
		try {
			boolean isPass2 = login("admin2","2222");
			System.out.printf("登入資訊 : %b\n",isPass2);
		} catch(Exception e) {
			System.out.printf("登入錯誤訊息= "+ e.getMessage());
		}
	}
	
	//	登入驗證
	public static boolean login(String username,String password) throws Exception{
		
		if(username.equals("admin") && password.equals("1234")) {
			return true;
		} else {
			//	RuntimeException 執行時期才要處理的例外
			//	Exception		 編譯時需要強迫處理的錯誤
			//	Exception		 要在main方法拋出
			Exception e = new Exception("您的使用者名稱或密碼不正確");
			throw e;
		}
	}

}
