package com.ecom.common.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.common.model.UserModel;
import java.lang.String;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer> {
	
	UserModel findByUserNameAndCurrentPasswordAndActiveFlagAndDeleteFlag(String userName, String currentPassword, String activeFlag, String deleteFlag);
	
	
	
}
