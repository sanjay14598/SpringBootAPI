package com.andoridrest.Springboot.app.repository;

import com.andoridrest.Springboot.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from all_user where mobile = :mobile or password = :password", nativeQuery = true)
    public User validateUser(@Param("mobile") String phone,
                             @Param("password") String password);

    @Query(value = "SELECT * FROM all_user WHERE mobile = ?1", nativeQuery = true)
    User findByUserMobile(String mobile);

    @Query(value = "select all_user from all_user where all_user.mobile = :mobile", nativeQuery = true)
    public User getUserByUserName(@Param("mobile") String mobile);
}

