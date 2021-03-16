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
@Table(name="City")
public class CityMaster {

	@Column(name="city_id")
	private Integer id;
	
	@Column(name="city_name")
	private String cityName;
	
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="state_id")
	private List<StateMaster> stateId;
	
	
}
