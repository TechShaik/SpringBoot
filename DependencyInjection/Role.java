package com.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Role {
	
	String role="Developer";
	
	public void showRole() {
		System.out.println("Role is:"+role);
	}

}
