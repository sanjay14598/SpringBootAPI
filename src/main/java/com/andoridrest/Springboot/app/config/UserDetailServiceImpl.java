package com.andoridrest.Springboot.app.config;

import com.andoridrest.Springboot.app.entity.User;
import com.andoridrest.Springboot.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.getUserByUserName(s);
        if (user == null){
            throw new UsernameNotFoundException("Could not found user");
        }
        CustomerUserDetails customerUserDetails = new CustomerUserDetails(user);
        return customerUserDetails;
    }
}
