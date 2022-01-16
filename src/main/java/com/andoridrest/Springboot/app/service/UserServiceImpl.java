package com.andoridrest.Springboot.app.service;

import com.andoridrest.Springboot.app.entity.User;
import com.andoridrest.Springboot.app.repository.UserRepository;
import org.hibernate.criterion.Distinct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User getValidateUser(String phone, String password) {
        return userRepository.validateUser(phone,password);
    }

    @Override
    public boolean checkPhoneExits(String phone) {
        return false;
    }

    @Override
    public User deleteUser(Long id) {
        return null;
    }

    @Override
    public User findUserByPhone(String phone) {
        return null;
    }

    /*@Override
    public boolean checkPhoneExits(String phone) {
        userRepository.checkPhone(phone);
        if (phone != null){
            return true;
        }else {
            return false;
        }
    }*/

}

   /* Query query = new Query();
        query.addCriteria(Criteria.where("phone").is(userName).andOperator(Criteria.where("password").is(password)));
                User userTest2 = mongoTemplate.findOne(query, User.class);
        System.out.println("userTest2 - " + userTest2);
        // TODO Auto-generated method stub
        return userTest2;*/