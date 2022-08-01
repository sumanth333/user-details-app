package com.example.userdetailsapp.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Getter
@Entity
@Table(name = "user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
}