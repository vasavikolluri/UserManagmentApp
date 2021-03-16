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
@Table(name="CountryMaster")
public class CountryMaster {
	
	@Column(name="id")
	private Integer id;
	
	@Column(name="country_name")
	private String countryName;

}
