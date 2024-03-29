package day06_oop;

import java.util.Arrays;

public class PersonDemo4 {

	public static void main(String[] args) {
		Person p1 = new Person("John",18);
		Person p2 = new Person("Jack",19);
		Person p3 = new Person("Anita",17);
		Person p4 = new Person("Bobo",21);
		Person p5 = new Person("Candy",16);
		
		//	建立Person陣列
		Person[] persons = {p1,p2,p3,p4,p5};
		
		//	印出成年的學生: 傳統Java寫法
		for(Person person : persons) {
			if(person.getAge()>=18) {		//	過濾條件
				System.out.println(person);
			}
			
		}
		
		//	印出成年的學生: Modern Java 串流寫法
		Arrays.stream(persons)
				//	拿到	person -> 你要幹嘛
				.filter(person -> person.getAge()>=18)
				.forEach(System.out :: println);
		
		//	印出未成年的學生: 傳統Java寫法
		for(Person person : persons) {
			if(person.getAge()<18) {		//	過濾條件
				System.out.println(person);
			}
			
		}
		
		//	印出未成年的學生: Modern Java 串流寫法
		Arrays.stream(persons)
				//	拿到	person -> 你要幹嘛
				.filter(person -> person.getAge()<18)
				.forEach(System.out :: println);
	}

}
