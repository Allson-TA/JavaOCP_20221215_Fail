package day06_oop;

public class PersonDemo2 {

	public static void main(String[] args) {
		Student student = new Student("John",18,90); 
		System.out.println(student);

	
		Teacher teacher = new Teacher("Bob",30,"Java");
		System.out.println(teacher);
		
		Employee employee = new Employee("Mary",25,55000);
		System.out.println(employee);
		
		Manager manager = new Manager("Jo",45,12_000,50_0000);
		System.out.println(manager);
	}
}
  