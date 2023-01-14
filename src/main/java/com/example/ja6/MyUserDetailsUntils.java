package com.example.ja6;

import com.example.ja6.dao.AccoutDAO;
import com.example.ja6.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsUntils implements UserDetailsService{

    @Autowired
    AccoutDAO accoutDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            Account users = accoutDAO.findById(username).get();
            BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
            return User.withUsername(users.getUsername())
                    .password(pe.encode(users.getPassword()))
                    .authorities(users.getRole())
                    .build();

        }catch (Exception e){
            throw new UsernameNotFoundException(username);
        }
    }
}
