package day05_oop;

public class Author {	//	作者

	private String name;
	private int age;
	
	public Author() {
		
		
	}
	
	public Author (String name,int age) {
		this.name = name;
		setAge(age);;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 0 && age < 150) {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", age=" + age + "]";
	}	
		

}
