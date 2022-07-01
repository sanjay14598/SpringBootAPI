package com.andoridrest.Springboot.app.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "all_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String name;
    private String mobile;
    private String password;
    private String age;
    private String appversion;
    private String devicetoken;
    private String devicetype;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payments_id")
    private Payment payment;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roles_id")
    private UserRole userRole;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;

    public User(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }

    //TODO: r&d jackson part
}
