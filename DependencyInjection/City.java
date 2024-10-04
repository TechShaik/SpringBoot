package com.DependencyInjection;

import org.springframework.stereotype.Component;
@Component
public class City {
     
	String city="Hyderabd";
	String country="india";
	public void showCity() {
		System.out.println("City is :"+city);
	}
	
	public void showCounttry() {
		System.out.println("City is :"+country);
	}
}
