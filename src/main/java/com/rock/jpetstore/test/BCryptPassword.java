package com.rock.jpetstore.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPassword {

	public static void main(String[] args) {
		String encoded = new BCryptPasswordEncoder().encode("ACID");
		
		System.out.println(encoded);
	}
	
}
