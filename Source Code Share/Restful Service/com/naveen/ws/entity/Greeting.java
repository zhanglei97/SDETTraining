package com.naveen.ws.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {
	private String name;
	private String message;
	
	public Greeting(){}
	public Greeting(String name, String message){
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}




	@Override
	public String toString() {
		return "Greeting [name=" + name + ", message=" + message + "]";
	}

}
