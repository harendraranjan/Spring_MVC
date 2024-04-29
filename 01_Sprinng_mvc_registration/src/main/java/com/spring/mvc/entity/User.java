package com.spring.mvc.entity;

public class User {
	private int ID;
	private String FullName;
	private String Email;
	private String Password;
	private String Chake;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		this.FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	public String getChake() {
		return Chake;
	}
	public void setChake(String chake) {
		this.Chake = chake;
	}
	@Override
	public String toString() {
		return "user [ID=" + ID + ", fullName=" + FullName + ", email=" + Email + ", password=" + Password + ", chake="
				+ Chake + "]";
	}
	
	
}
