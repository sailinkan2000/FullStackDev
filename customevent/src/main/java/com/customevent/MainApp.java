package com.customevent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ClassPathXmlApplicationContext context = 
         new ClassPathXmlApplicationContext();
	  
      CustomEventPublisher cvp = 
         (CustomEventPublisher) context.getBean("customEventPublisher");
      
      cvp.publish();  
      cvp.publish();
   }
}
