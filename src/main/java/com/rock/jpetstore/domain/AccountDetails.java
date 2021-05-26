package com.rock.jpetstore.domain;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AccountDetails implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Signon signon;

	public AccountDetails(Signon signon) {
		this.signon = signon;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(signon.getRole());
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() { 
		return signon.getPassword();
	}

	@Override
	public String getUsername() { 
		return signon.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() { 
		return true;
	}

	@Override
	public boolean isAccountNonLocked() { 
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() { 
		return true;
	}

	@Override
	public boolean isEnabled() { 
		return true;
	}

}
