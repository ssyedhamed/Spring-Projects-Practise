package net.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String email;
	private String password;
	private Address address;
	private String course;
	private Long zip;
	private String check;
//	@DateTimeFormat(pattern = "dd-MM-yyyy")
//	private Date dob;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Long getZip() {
		return zip;
	}
	public void setZip(Long zip) {
		this.zip = zip;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
//	public Date getDob() {
//		return dob;
//	}
//	public void setDob(Date dob) {
//		dob.toString();
//		this.dob = dob;
//	}
	public User(String email, String password, Address address, String course, Long zip, String check /*Date dob*/) {
		super();
		this.email = email;
		this.password = password;
		this.address = address;
		this.course = course;
		this.zip = zip;
		this.check = check;
//		this.dob = dob;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", address=" + address + ", course=" + course
				+ ", zip=" + zip + ", check=" + check + "]";
	}
	
}
