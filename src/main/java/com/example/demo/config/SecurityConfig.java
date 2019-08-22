package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		
		  http
          .authorizeRequests()
              
              .anyRequest().authenticated()
          .and()
          .formLogin()
              .loginPage("/login").
		  defaultSuccessUrl("/home").permitAll()
		  .failureUrl("/login-error")
              .permitAll()
          .and()
          .logout()
              .invalidateHttpSession(true)
              .clearAuthentication(true)
              .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
              .logoutSuccessUrl("/login?logout")
              .permitAll().and().csrf().disable()
;
          
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())

				.withUser("UniqSoft").password("LicenseUniq123").roles("MANAGER")

				.and().withUser("UniqSoft1")

				.password("LicenseUniq").credentialsExpired(true).accountExpired(true).accountLocked(true)
				.authorities("WRITE_LICENSE", "READ_LICENSE").roles("MANAGER");
	}
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/*.css");
		web.ignoring().antMatchers("/*.js");
	}

}
