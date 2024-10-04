package com.JavaBasedBeans;

import java.io.IOException;

 import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
    
@SpringBootApplication
public class Main {
	public static void main(String[] args) throws IOException {
	 ApplicationContext con=SpringApplication.run(Main.class, args);
		EmpLocationn emp=con.getBean(EmpLocationn.class);
		 emp.show();
		 
		 
		 }

}
