package com.endless.web.databind.services;

import java.util.ArrayList;
import java.util.List;

import com.endless.web.databind.beans.User;

public class UserService {
	private static List<User> users = new ArrayList<>();

	public static void addUser(User user) {
		users.add(user);
	}

	public static List<User> listUsers() {
		return users;
	}

	public static List<String> listCitys() {
		List<String> citys = new ArrayList<>();
		citys.add("Beijing");
		citys.add("Shanghai");
		citys.add("Shenzhen");
		citys.add("Nanjing");
		citys.add("Hangzhou");
		return citys;
	}

	public static Object listSkills() {
		List<String> skills = new ArrayList<>();
		skills.add("Java");
		skills.add("Python");
		skills.add("Scala");
		skills.add("Spring");
		skills.add("Spark");
		return skills;
	}
}
