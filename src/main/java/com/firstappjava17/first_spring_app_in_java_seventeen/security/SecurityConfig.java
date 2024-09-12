package com.firstappjava17.first_spring_app_in_java_seventeen.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.firstappjava17.first_spring_app_in_java_seventeen.security.filter.AuthenticationFilter;
import com.firstappjava17.first_spring_app_in_java_seventeen.security.filter.ExceptionHandlerFilter;
import com.firstappjava17.first_spring_app_in_java_seventeen.security.filter.JWTAuthorizationFilter;
import com.firstappjava17.first_spring_app_in_java_seventeen.security.manager.CustomAuthenticationManager;

import lombok.AllArgsConstructor;

import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@AllArgsConstructor
public class SecurityConfig {
    CustomAuthenticationManager customAuthenticationManager;

    @SuppressWarnings({ "deprecation", "removal" })
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        AuthenticationFilter authenticateFilter = new AuthenticationFilter(customAuthenticationManager);
        authenticateFilter.setFilterProcessesUrl("/authenticate");
        http
                .headers(headers -> headers.frameOptions().disable())
                .csrf(csrf -> csrf.disable())
                .authorizeRequests(requests -> requests
                        // .antMatchers("/h2/**").permitAll() // New Line: allows us to access the h2
                        // console without the need to authenticate. ' ** ' instead of ' * ' because
                        // multiple path levels will follow /h2.
                        .requestMatchers(HttpMethod.POST, SecurityConstants.REGISTER_PATH).permitAll()
                        // .requestMatchers(HttpMethod.GET, "/v3/api-docs").permitAll()
                        // .requestMatchers(HttpMethod.GET, "/swagger-ui/index.html").permitAll()
                        .anyRequest().authenticated())
                .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
                .addFilter(authenticateFilter)
                .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
                .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }

}