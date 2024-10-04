package com.JavaBasedBeans;

import org.springframework.stereotype.Component;

@Component
public class EmpLocationn {
String city="banglore";
int pin=560029;
    
   private EmpDetails emp;
   EmpLocationn(EmpDetails emp){
	   this.emp=emp;
   }

   public void show() {
	   System.out.println(emp.show());
	  System.out.println(city+" "+pin);
   }
}
