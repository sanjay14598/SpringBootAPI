package com.andoridrest.Springboot.app.repository;

import com.andoridrest.Springboot.app.entity.Channel;
import com.andoridrest.Springboot.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

    @Query(value = "SELECT * FROM channel WHERE name = ?1", nativeQuery = true)
    Channel findByChannelName(String name);
}
