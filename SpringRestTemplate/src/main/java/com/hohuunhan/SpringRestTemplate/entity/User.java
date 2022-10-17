package com.hohuunhan.SpringRestTemplate.entity;

import java.util.Date;

public class User {

	private String userName;

	private String password;

	private String email;

	private Boolean statusActive;

	private Date createDate;

	private Date updateDate;

	public User() {
	}

	public User(String userName, String password, String email, Boolean statusActive, Date createDate,
			Date updateDate) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.statusActive = statusActive;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Boolean getStatusActive() {
		return statusActive;
	}

	public void setStatusActive(Boolean statusActive) {
		this.statusActive = statusActive;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", email=" + email + ", statusActive="
				+ statusActive + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

}
