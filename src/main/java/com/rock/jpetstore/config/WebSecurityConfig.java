package com.rock.jpetstore.config;

import org.springframework.context.annotation.*;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.rock.jpetstore.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImpl();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService()); 
			authProvider.setPasswordEncoder(passwordEncoder()); 

		return authProvider;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/live","/delay","/actuator/**").permitAll()
        .antMatchers(HttpMethod.POST,"/accounts").permitAll()
        .anyRequest().authenticated()
        .and()
        .httpBasic()
        .and().csrf().disable();
		
		// form login
		//http.authorizeRequests(). 
		//anyRequest().authenticated().
		//and().formLogin().permitAll().and().logout().permitAll();
		
		// permitAll
//		http.authorizeRequests()
//		.antMatchers("/**").permitAll()
//		.and().csrf().disable();
		
	} 
}