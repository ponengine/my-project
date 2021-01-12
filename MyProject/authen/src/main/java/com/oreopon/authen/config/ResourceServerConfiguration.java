package com.oreopon.authen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
        .authorizeRequests()
        .antMatchers("/", "/public/**").permitAll() 
        .anyRequest().authenticated()
 //               .antMatchers("/password/**").permitAll()
 //               .antMatchers(HttpMethod.POST, "/profiles").permitAll()
         .and()
         .csrf().disable()
         .formLogin().disable();
    }
}
