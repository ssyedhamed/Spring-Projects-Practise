package com.lifecycle;

public class HelloWorld {
	private String message;

	public String getMessage() {
		System.out.println("the message is : "+message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void initialize() {
		System.out.println("bean is initailizing");
	}
	public void destroyed () {
		System.out.println("the bean is getting destroy");
	}
}
