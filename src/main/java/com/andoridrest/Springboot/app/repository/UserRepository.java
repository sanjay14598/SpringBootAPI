package com.andoridrest.Springboot.app.repository;

import com.andoridrest.Springboot.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.userMobile = :userMobile or u.userPassword = :userPassword")
    public User validateUser(@Param("userMobile") String phone,
                             @Param("userPassword") String password);


}

