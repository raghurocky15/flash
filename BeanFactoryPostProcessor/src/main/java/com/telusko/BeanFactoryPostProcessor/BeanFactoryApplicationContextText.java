package com.telusko.BeanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApplicationContextText {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		DbConfig dbconfigObj = (DbConfig) context.getBean("dbconfigBean");
		dbconfigObj.greetCustomer();
		
		
}
}
