package com.shaik.firstCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstCodeApplication {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(FirstCodeApplication.class, args);
		Hello ob=con.getBean(Hello.class);
		ob.show();
	}

}
