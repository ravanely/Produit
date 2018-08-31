package alpha.org.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.httpBasic()
			.and().
			authorizeRequests()
				.antMatchers("/api/**").hasRole("USER")
				.antMatchers("/**").hasRole("ADMIN")
				.and()
				.csrf().disable().headers().frameOptions().disable();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("user").password("password1").roles("USER")
		.and()
		.withUser("admin").password("adm123").roles("USER","ADMIN");
	}
}
