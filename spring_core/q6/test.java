package spring_core3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String args[]) {
	ApplicationContext cxt=new ClassPathXmlApplicationContext("spring.xml");
	
	stud s1=cxt.getBean("st", stud.class);
	System.out.println(s1.id+","+s1.name);
}
}
