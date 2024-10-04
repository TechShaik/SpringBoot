package com.shaik.firstCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {
//	@Autowired
//	private laptop lap;  --Field injection
	
	
//	private laptop lap;
//	 Hello(laptop lap){      --constructor injection
//		 this.lap=lap;
//	 }
	
	@Autowired
	private laptop lap;
	public void setComplie(laptop lap) {
		this.lap=lap;
	}
	public void show() {
		lap.compile();
		System.out.println("Hello this is spring DI");
	}

}
