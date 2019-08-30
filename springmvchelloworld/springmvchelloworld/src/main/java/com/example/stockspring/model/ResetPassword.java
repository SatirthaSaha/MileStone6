package com.example.stockspring.model;

public class ResetPassword {

	private String uname;
	private String oldpass;
	private String newpass;
	public String getOldpass() {
		return oldpass;
	}
	public void setOldpass(String oldpass) {
		this.oldpass = oldpass;
	}
	public String getNewpass() {
		return newpass;
	}
	public void setNewpass(String newpass) {
		this.newpass = newpass;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public ResetPassword(String uname, String oldpass, String newpass) {
		super();
		this.uname = uname;
		this.oldpass = oldpass;
		this.newpass = newpass;
	}
	public ResetPassword() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResetPassword [uname=" + uname + ", oldpass=" + oldpass + ", newpass=" + newpass + "]";
	}
	
}
