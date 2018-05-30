package com.telusko.BeanFactoryPostProcessor;

public class DbConfig {

	String  welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	
	public void greetCustomer(){
		System.out.println(welcomeNote);
	}
}
