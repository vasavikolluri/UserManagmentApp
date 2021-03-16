package com.ashokit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="user_registration_details")
public class UserAccount {

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="ph_no")
	private long phno;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="CountryMaster")
	private String country;

	@Column(name="StateMaster")
	private String state;
	
	@Column(name="City")
	private String city;
	
	@Column(name="random_password")
	private String randomPassword;
	
	@Column(name="status")
	private String status;
	
	
}
