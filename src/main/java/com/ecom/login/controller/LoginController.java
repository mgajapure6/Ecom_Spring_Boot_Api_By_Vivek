package com.ecom.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.common.model.CommonResponse;
import com.ecom.common.model.UserModel;
import com.ecom.common.repository.UserRepository;

@RestController
@RequestMapping(value="/api")	
public class LoginController {
   @Autowired
   UserRepository userRepository;
   @RequestMapping(value="/login", method=RequestMethod.POST)	
   public CommonResponse getLogin(@RequestBody UserModel userModel) {
	   String userName = userModel.getUserName();
	   String currentPassword = userModel.getCurrentPassword();
	   userModel = userRepository.findByUserNameAndCurrentPasswordAndActiveFlagAndDeleteFlag(userName, currentPassword,"Y" , "N");
	   if(userModel==null) {
		   return new CommonResponse("Data Not Found", 404, null);
	   }else {
		   return new CommonResponse("Data Found", 200, userModel);
	   }
   }
}
