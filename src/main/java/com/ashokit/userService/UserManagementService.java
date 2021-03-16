package com.ashokit.userService;

import java.util.Map;

import com.ashokit.model.UnlockAccount;
import com.ashokit.model.UserAccount;

public interface UserManagementService {
	
	public boolean saveUser(UserAccount userAccount);
	
	public Map<Integer,String> getCountries();
	
	public Map<Integer,String> getStates(Integer countryId);
	
	public Map<Integer,String> getCity(Integer stateId);
	
	public boolean isEmailUnique(String email);
	
	public boolean loginCheck(String email,String password);
	
	public boolean isTempPwdValid(String email,  String tempPassword);
	
	public boolean unlockAccount(UnlockAccount unlockAcc);


}
