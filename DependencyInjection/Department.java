package com.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Department {
      String dep="It";
      public void showDep() {
    	  System.out.println("Department is: "+dep);
      }
      
}
