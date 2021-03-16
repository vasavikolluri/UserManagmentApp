package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.model.CityMaster;
@Repository
public interface CityMasterRepository extends JpaRepository<CityMaster, Serializable>{

}
