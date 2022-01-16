package com.andoridrest.Springboot.app.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Devices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deviceId;
    private String deviceModel;
    private String deviceName;
    private String deviceToken;
    private String deviceVersion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;


}
