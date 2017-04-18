package br.com.controllerservices.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	@Value("${token}")
    private String token;

	public boolean validateToken(String token) {

		if(token.equals(token)){
			return true;
		}

		return false;
	}

}
