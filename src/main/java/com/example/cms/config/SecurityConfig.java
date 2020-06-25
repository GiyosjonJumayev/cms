package com.example.cms.config;

import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by Smart on 25.06.2020.
 */
@Configuration
public class SecurityConfig extends SpringBootWebSecurityConfiguration {

    @Bean
    protected UserDetailsService userDetailsService() {

        PasswordEncoder  encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        User.UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);

        UserDetails user1 = userBuilder
                .username("myuser1")
                .password("password")
                .roles("USER")
                .build();

        UserDetails user2 = userBuilder
                .username("myuser2")
                .password("password")
                .roles("USER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user1, user2);
    }

}
