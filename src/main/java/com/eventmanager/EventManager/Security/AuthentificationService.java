package com.eventmanager.EventManager.Security;

import org.springframework.stereotype.Service;

@Service
public class AuthentificationService {
	
	public boolean authenticate(String username,String password) {
		boolean isValidUsername= username.equalsIgnoreCase("admin");
		boolean isValidPassword = password.equalsIgnoreCase("abcd");
		
		return isValidUsername && isValidPassword;
	}
}
