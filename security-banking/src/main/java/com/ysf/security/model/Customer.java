package com.ysf.security.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/* Created by yusufulku,1.06.2025 */
@Entity
@Table(name = "customer")
@Getter @Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String pwd;
    @Column(name = "role")
    private String role;


}
