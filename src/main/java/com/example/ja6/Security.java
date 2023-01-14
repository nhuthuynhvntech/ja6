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

import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
@Autowired
    AccoutService accoutService;
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//    @Autowired
//    private BCryptPasswordEncoder pe;
//
//
//    @Autowired
//    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(username -> {
//            try{
//                Account user = accoutService.findById(username);
//                String pass = pe.encode(user.getPassword());
//                String[]roles = user.getAuthorities().stream()
//                        .map(er->er.getRole().getId())
//                        .collect(Collectors.toList()).toArray(new String[0]);
//                return User.withUsername(username).password(pass).roles(roles).build();
//
//            }catch (NoSuchElementException e){
//                throw new UsernameNotFoundException(username+ "sai");
//            }
//        });
//    }

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

    @Bean
    public BCryptPasswordEncoder getPass(){
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        BCryptPasswordEncoder pc = new BCryptPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser("a").password("a").roles("admin")
//                .and()
//                .withUser("user2").password(pc.encode("abc")).roles("admin","user")
//                .and()
//                .withUser("user3").password(pc.encode("abc")).roles("user");
                auth.userDetailsService(username -> {
            try{
                Account user = accoutService.findById(username);
                String pass = pc.encode(user.getPassword());
                String[]roles = user.getAuthorities().stream()
                        .map(er->er.getRole().getId())
                        .collect(Collectors.toList()).toArray(new String[0]);
                return User.withUsername(username).password(pass).roles(roles).build();

            }catch (NoSuchElementException e){
                throw new UsernameNotFoundException(username+ "sai");
            }
        });

    }
        @Override
    protected void configure(HttpSecurity http) throws Exception{
      http.csrf().disable().cors().disable();
      http.authorizeRequests()

//                .antMatchers("/order/checkout").hasRole("CUST")
//            	.antMatchers("/home/user").hasAnyRole("user","admin")
//            	.antMatchers("/home/au").authenticated()
//                .antMatchers("/rest/hs").authenticated()
            	.anyRequest().permitAll();
    http.httpBasic();}
}
