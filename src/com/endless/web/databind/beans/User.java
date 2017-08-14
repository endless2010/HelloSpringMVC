package com.endless.web.databind.beans;

import java.util.List;

public class User {
	
	private String username;
	private Gender gender;
	private String birthday;	
	private List<String> skills;
	private String city;
	private String description;
	
	@Override
	public String toString(){
		return "username="+username+",gender="+gender+",birthday="+birthday+
				",skills="+skills+",city="+city+"description="+description;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}	
}
