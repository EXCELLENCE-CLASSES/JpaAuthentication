package com.example.JpaAuthentication.JpaAuthentication;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="exc")
public class ExcellenceClass {
	
	@Id	
	@Column(name="excellenceId")
	private String excellenceId ;
	@Column(name="userName")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="active")
	private boolean active ;
	@Column(name="roles")
	private String roles;

	public String getExcellenceId() {
		return excellenceId;
	}

	public void setExcellenceId(String excellenceId) {
		this.excellenceId = excellenceId;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "ExcellenceClass [excellenceId=" + excellenceId + ", userName=" + userName + ", password=" + password
				+ ", active=" + active + ", roles=" + roles + "]";
	}
	
	

}
