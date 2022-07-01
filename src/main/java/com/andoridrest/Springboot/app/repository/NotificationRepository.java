package com.andoridrest.Springboot.app.repository;

import com.andoridrest.Springboot.app.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

   // List<Notification> findByUserId(int userid);
}
