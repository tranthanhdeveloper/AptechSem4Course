package com.tranthanh.sem4.demosession1.entities;

import java.util.Arrays;

public class Account {
	private String username;
	private String password;
	private String description;
	private boolean status;
	private String[] languages;
	private String gender;
	private String role;
	private String photo;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Account(String username, String password, String description, boolean status, String[] languages, String gender, String role, String photo) {
		this.username = username;
		this.password = password;
		this.description = description;
		this.status = status;
		this.languages = languages;
		this.gender = gender;
		this.role = role;
		this.photo = photo;
	}

	public Account() {
	}

	@Override
	public String toString() {
		return "Account{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", description='" + description + '\'' +
				", status=" + status +
				", languages=" + Arrays.toString(languages) +
				", gender='" + gender + '\'' +
				", role='" + role + '\'' +
				", photo='" + photo + '\'' +
				'}';
	}
}
