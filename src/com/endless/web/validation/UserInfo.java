package com.endless.web.validation;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

public class UserInfo {
	@Size(min=3,max=10,message="username should be at least 3 characters and no more than 15 characters")
	private String username;
	@Pattern(regexp="^[a-zA-Z]\\w{3,14}$",message="password should start with a letter,at least 4 characters and no more than 15 characters")
	private String password;
	@Email(message="invalid Email")
	private String email;
	private String phone;
	private String detail;
	
	private Genders gender;
	private Colors favoriateColor;
	private boolean programmer;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Genders getGender() {
		return gender;
	}
	public void setGender(Genders gender) {
		this.gender = gender;
	}
	public Colors getFavoriateColor() {
		return favoriateColor;
	}
	public void setFavoriateColor(Colors favoriateColor) {
		this.favoriateColor = favoriateColor;
	}
	public boolean isProgrammer() {
		return programmer;
	}
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	
}
