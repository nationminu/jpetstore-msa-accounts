package com.rock.jpetstore.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPassword {

	public static void main(String[] args) {
		
		String encoded = null;
		
		encoded = new BCryptPasswordEncoder().encode("j2ee");
		
		System.out.println("j2ee : " + encoded);
		
		encoded = new BCryptPasswordEncoder().encode("ACID");
		
		System.out.println("ACID : " + encoded);
		
		if(args.length > 0) {
			encoded = new BCryptPasswordEncoder().encode(args[0]);			
			System.out.println(args[0] + " : " + encoded);
		}
	}
	
}
