package com.XMLBeans;

public class Student {
private String name;
private int age;
  public Student(String name,int age){
	  this.name=name;
	  this.age=age;
  }
  
    private Teacher teacher;
  Student(Teacher teacher){
	  this.teacher=teacher;
  }
  
  
   public String toString() {
	return "Name :"+name+ "  Age :"+age+(teacher!=null?teacher.toString():"");
	 
  }
  }
