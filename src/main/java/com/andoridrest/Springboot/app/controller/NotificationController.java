package com.andoridrest.Springboot.app.controller;

import com.andoridrest.Springboot.app.entity.Notification;
import com.andoridrest.Springboot.app.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NotificationController {

    @Autowired
    private NotificationRepository notificationRepository;

    @PostMapping("/notification")
    public ResponseEntity<?> createNotification(@RequestBody Notification notification) {
        Map<Object, Object> objectMap = new HashMap<>();
        if (notification.getTitle() == null || notification.getTitle().equalsIgnoreCase("")) {
            objectMap.put("status", HttpStatus.NO_CONTENT);
            objectMap.put("message", "Please enter title");
        } else {
            objectMap.put("status", "Message sent");
            objectMap.put("message", "Notification sent successfully to all users");
        }
        return ResponseEntity.ok(objectMap);
    }

    @GetMapping("/notifications")
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @GetMapping("/notification/{id}")
    public Notification getNotificationById(@PathVariable("id") long id) {
        return notificationRepository.getById(id);
    }
//
//    @GetMapping("/notification/{userid}")
//    public ResponseEntity<List<Notification>> getNotificationsByUserId(@PathVariable("userid") int userid) {
//        try {
//            List<Notification> notifications = new ArrayList<Notification>();
//
//            if (userid == 0)
//                notifications.addAll(notificationRepository.findAll());
//            else
//                notifications.addAll(notificationRepository.findByUserId(userid));
//
//            if (notifications.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//            return new ResponseEntity<>(notifications, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

}
