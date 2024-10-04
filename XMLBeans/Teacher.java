package com.XMLBeans;

public class Teacher {
  private String name;
  private String subject;
  Teacher(String name,String subject){
	  this.name=name;
	  this.subject=subject;
  }
  
  public String toString() {
	  return "Teacher[Name: "+name+" Subject: "+subject+"]";
  }
}
