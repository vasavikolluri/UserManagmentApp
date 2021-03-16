package com.ashokit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="StateMaster")
public class StateMaster {
	
	@Column(name="state_id")
	private Integer id;
	
	@Column(name="state_name")
	private String stateName;
	
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="country_id")
	private List<CountryMaster> countryid;

}
