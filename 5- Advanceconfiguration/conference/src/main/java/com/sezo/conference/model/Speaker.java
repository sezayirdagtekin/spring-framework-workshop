package com.sezo.conference.model;

import java.util.Date;

/**
 * 
 * @author Sezayir
 *
 */
public class Speaker {

	private String firstName;
	private String lastName;
	private Date date;

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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Speaker [firstName=" + firstName + ", lastName=" + lastName + ", date=" + date + "]";
	}


}
