package day06_ocp;

public class PersonDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("John");
		student.setAge(10);
		student.setSocre(90);
		
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getSocre());
		
		Teacher teacher = new Teacher();
		teacher.setName("Bob");
		teacher.setAge(30);
		teacher.setSubject("Java");
		
		System.out.println(teacher.getName());
		System.out.println(teacher.getAge());
		System.out.println(teacher.getSubject());
		
		Employee employee = new Employee();
		employee.setName("Mary");
		employee.setAge(25);
		employee.setSalary(55000);
		
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getSalary());
		
	}

}
