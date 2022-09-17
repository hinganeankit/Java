package model;

import java.util.Iterator;
import java.util.List;

public class Person {
	private int pid;
	private int age;
	private List<String> names;
 
	public Person() {
		// TODO Auto-generated constructor stub
	}
 
	public int getPid() {
		return pid;
	}
 
	public void setPid(int pid) {
		this.pid = pid;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	public List<String> getNames() {
		return names;
	}
 
	public void setNames(List<String> names) {
		this.names = names;
	}
 
	public Person(int pid, int age, List<String> names) {
		super();
		this.pid = pid;
		this.age = age;
		this.names = names;
	}
 
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", age=" + age + ", names=" + names + "]";
	}
	
	public void displayPerson() {
		System.out.println("ID  "+pid);
		System.out.println("Age  "+age);
		Iterator<String> itr=names.iterator();
   System.out.println("Names Of Person");
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	
	}

	

}