package com.web.fashion.fashion.models.entities;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column
    private String firstName;

    @Column
    private String lastName;


    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column (columnDefinition = "LONGTEXT")
    private String avatar;

    @Column(nullable = false)
    private LocalDateTime dateRegister;

    @Column(nullable = false)
    private LocalDateTime lastLogin;

    @Column(nullable = false)
    private int status;

    @OneToOne(mappedBy = "user")
    private Account account;

    @ManyToMany
    @JoinTable(name = "user_role",
        joinColumns = @JoinColumn(name = "userId"),
        inverseJoinColumns = @JoinColumn(name = "roleId"))
    private List<Role> roles;


}
