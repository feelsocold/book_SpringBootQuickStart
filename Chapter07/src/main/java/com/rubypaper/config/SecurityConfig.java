package com.rubypaper.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity	// 이 클래스로부터 생성된 객체가 시큐리티 설정 파일임을 의미하면서, 동시에 시큐리티를 사용하는 데 필요한 수많은 객체를 생성한다.
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BoardUserDetailService boardUserDetailService;
	
	@Override
	protected void configure(HttpSecurity security) throws Exception{
		/*
		security.authorizeRequests().antMatchers("/").permitAll();
		security.authorizeRequests().antMatchers("/member/**").fullyAuthenticated();
		security.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
		security.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN"); */
		
		security.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/member/**").fullyAuthenticated()
			.antMatchers("/manager/**").hasRole("MANAGER")
			.antMatchers("/admin/**").hasRole("ADMIN");
		
		security.csrf().disable();
//		security.formLogin();
		security.formLogin().loginPage("/login").defaultSuccessUrl("/loginSuccess", true);
		security.exceptionHandling().accessDeniedPage("/accessDenied");
		security.logout().invalidateHttpSession(true).logoutSuccessUrl("/login");
		
		security.userDetailsService(boardUserDetailService);
	}
	
	/*
	@Autowired
	public void authenticate(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("manager")
			.password("{noop}manager")
			.roles("MANAGER");
		
		auth.inMemoryAuthentication()
		.withUser("admin")
		.password("{noop}admin"f
		.roles("ADMIN");
	} */
	
	/*
	@Autowired
	public void authenticate(AuthenticationManagerBuilder auth) throws Exception{
		String query1 = "SELECT id username, concat('{noop}', password)	password, '1' enabled FROM member WHERE id=?";
		String query2 = "SELECT id, role FROM MEMBER WHERE ID = ?";
		
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery(query1)			// 사용자 정보 조회
		.authoritiesByUsernameQuery(query2);	// 권한 정보 조회
	}
	*/
	
	
	
}
