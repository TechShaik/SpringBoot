package com.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
  String name="Shaik";
  int roll=556;
  
  @Autowired
  private Department department;
  
  private City city;
  
  public Employee(City city) {
	  this.city=city;
  }
  
  @Autowired
  private Role role;
  public void setRole(Role role) {
	  this.role=role;
  }
	  
  
    public void show() {
    	System.out.println("Name :"+name+ " Roll :"+roll);
    	department.showDep();
    	role.showRole();
    	city.showCity();
    	city.showCounttry();
    	 
    }
}
