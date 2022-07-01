package com.andoridrest.Springboot.app.service;

import com.andoridrest.Springboot.app.entity.Notification;
import com.andoridrest.Springboot.app.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;


}
