package me.matteo.jersey.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloBean {
	
	String greeting;
	String from;
	String to;
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

}
