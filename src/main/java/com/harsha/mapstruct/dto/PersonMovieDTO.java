package com.harsha.mapstruct.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PersonMovieDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Long personId;
	private String firstName;
	private String lastName;
	private String subscriptionType;
	private String age;
	private List<MovieDTO> movieList;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<MovieDTO> getMovieList() {
		return movieList;
	}
	public void setMovieList(List<MovieDTO> movieList) {
		this.movieList = movieList;
	}

	
}
