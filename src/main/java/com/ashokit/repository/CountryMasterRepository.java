package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.model.CountryMaster;

public interface CountryMasterRepository extends JpaRepository<CountryMaster, Serializable>{

}
