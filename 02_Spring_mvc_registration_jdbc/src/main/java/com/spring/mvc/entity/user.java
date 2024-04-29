package com.spring.mvc.entity;

public class user {
	private int ID;
	
	private String fullName;
	
	private String email;
	
	private String password;
	
	private String chake;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getChake() {
		return chake;
	}

	public void setChake(String chake) {
		this.chake = chake;
	}

	@Override
	public String toString() {
		return "user [ID=" + ID + ", fullName=" + fullName + ", email=" + email + ", password=" + password + ", chake="
				+ chake + "]";
	}

}
