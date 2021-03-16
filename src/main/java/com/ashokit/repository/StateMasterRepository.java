package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.model.StateMaster;

public interface StateMasterRepository extends JpaRepository<StateMaster, Serializable>{

}
