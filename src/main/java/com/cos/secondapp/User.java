package com.cos.secondapp;

public class User {
	private String username;
	private String password;
	
	//접근제어자를 private를 쓰는 이유는 보안유지의 이유도 있지만. 객체지향의 1원칙이다.
	//
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
}
