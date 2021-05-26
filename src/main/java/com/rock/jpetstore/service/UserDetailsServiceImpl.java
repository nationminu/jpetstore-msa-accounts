package com.rock.jpetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.rock.jpetstore.domain.AccountDetails;
import com.rock.jpetstore.domain.Signon;
import com.rock.jpetstore.repository.SignonRepository;
 
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private SignonRepository signonRepository;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
    	
        Signon signon = signonRepository.findByUsername(username);
          
        if (signon == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new AccountDetails(signon);
    }
}
 