package com.simsekonline.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All detail about model user")
public class User {
	private Integer id;

	@Size(min = 2, message = "Name should have at least 2 characters")
	@ApiModelProperty(notes="Name should be at least 2 characters")
	private String name;

	@Past
	@ApiModelProperty(notes="Birthdate should be in the past")
	private Date birtDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	protected User() {

	}

	public User(Integer id, String name, Date birtDate) {
		super();
		this.id = id;
		this.name = name;
		this.birtDate = birtDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birtDate=" + birtDate + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirtDate() {
		return birtDate;
	}

	public void setBirtDate(Date birtDate) {
		this.birtDate = birtDate;
	}

}
