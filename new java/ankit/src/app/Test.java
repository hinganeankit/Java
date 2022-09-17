package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		
		Student s1=(Student) ctx.getBean("stud");
		
		System.out.println(s1);
		
	}
}
