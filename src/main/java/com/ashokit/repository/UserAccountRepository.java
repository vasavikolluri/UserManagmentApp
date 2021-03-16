package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.model.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Serializable>{

}
