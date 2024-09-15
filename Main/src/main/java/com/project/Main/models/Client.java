package com.project.Main.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="clientsTable")
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;
}
