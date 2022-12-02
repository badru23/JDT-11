package id.co.indivara.jdt11.demoauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ConfigurasiSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //MEMBUAT DAFTAR USER YANG BOLEH MENGAKSES APLIKASI
        auth.inMemoryAuthentication()
                .withUser("culun").password("{noop}passwordculun").roles("USER")
                .and()
                .withUser("boss").password("{noop}password").roles("USER","ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/v1/books/**").hasRole("USER")
                .antMatchers(HttpMethod.GET, "/api/v1/books/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/api/v1/books").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/v1/books/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/api/v1/books/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }
}