package com.project.Main.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="models")
@AllArgsConstructor
@NoArgsConstructor
public class MyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "thumbnail_url")
    private String thumbnail_url;

    @Column(name = "download_url")
    private String download_url;

    @Column(name = "description")
    private String description;
}
