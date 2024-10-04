package com.XMLBeans;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
	 ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
	 Student stud=(Student)con.getBean("student");
	 System.out.println(stud);
	 Student stud2=(Student)con.getBean("student2");
	 System.out.println(stud2);
	 Student stud3=(Student)con.getBean("student3");
	 System.out.println(stud3);
	 Teacher teacher=(Teacher)con.getBean("teacher");
	 System.out.println(teacher);
	
	}

}
