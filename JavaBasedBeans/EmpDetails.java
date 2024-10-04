package com.JavaBasedBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpDetails {
	String name="shaiksha";
     long mobile=6303833290L;
     
   
     @Bean
     public String show() {
		return name+" "+mobile;
		  
     }
     

}
