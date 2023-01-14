package com.example.ja6;

import com.example.ja6.dao.AccoutDAO;
import com.example.ja6.entity.Account;
import com.example.ja6.service.impl.AccoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
    @Autowired
    MyUserDetailsUntils userDetailsUntils;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsUntils);
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        http.csrf().disable().cors().disable();
//
//        // phan quyen
//        http.authorizeRequests()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .antMatchers(new String[]{"/account/cart/**","/account/newcart"}).authenticated()
//                .anyRequest().permitAll();
//
//        // fomr login
//        http.formLogin().loginPage("/account/signin")
//                .loginProcessingUrl("/account/login") // post url login
//                .defaultSuccessUrl("/product/index",true)
//                .failureUrl("/account/login/error")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .and()
//                .oauth2Login().defaultSuccessUrl("/product/index",true);
//
//
//        http.rememberMe().rememberMeParameter("remember");
//
//        // logout
//        http.logout().logoutUrl("/account/logoff").logoutSuccessUrl("/account/signin");
//
//        // dieu kiem loi tru cap khong dung quyen
//        http.exceptionHandling().accessDeniedPage("/account/signin");
//    }


}
