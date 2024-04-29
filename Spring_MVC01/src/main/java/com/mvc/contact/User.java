package com.mvc.contact;

public class User {
	private String name1;
	private String email1;
	private String password1;
	private String check1;
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getCheck1() {
		return check1;
	}
	public void setCheck1(String check1) {
		this.check1 = check1;
	}
	@Override
	public String toString() {
		return "User [name1=" + name1 + ", email1=" + email1 + ", password1=" + password1 + ", check1=" + check1 + "]";
	}
	
}
