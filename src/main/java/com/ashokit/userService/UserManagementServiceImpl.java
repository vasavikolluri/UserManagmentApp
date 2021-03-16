package com.ashokit.userService;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.ashokit.model.UnlockAccount;
import com.ashokit.model.UserAccount;
@Service
public class UserManagementServiceImpl implements UserManagementService{

	@Override
	public boolean saveUser(UserAccount userAccount) {
		return false;
		
	}

	@Override
	public Map<Integer, String> getCountries() {
		return null;
	}

	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		return null;
	}

	@Override
	public Map<Integer, String> getCity(Integer stateId) {
		return null;
	}

	
	@Override
	public boolean loginCheck(String email, String password) {
		return false;
	}

	@Override
	public boolean isTempPwdValid(String email, String tempPassword) {
		return false;
	}

	@Override
	public boolean unlockAccount(UnlockAccount unlockAcc) {
		return false;
	}

	@Override
	public boolean isEmailUnique(String email) {
		return true;
	}

}
