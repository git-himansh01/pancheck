package com.example.pancheck.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@ToString

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String pan;
    private String address;

    public User(){
        this.firstName = "Himanshu";
        this.lastName = "Gupta";
        this.email = "waystohimanshu@gmail.com";
        this.password = "1234";
        this.phone = "9650228338";
        this.pan = "CHGPG2683E";
        this.address = "Rajouri Garden, New Delhi";
    }
}
