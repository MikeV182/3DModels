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
    @Column(name = "id")
    private Long id;

    @Column(name = "thumbnail_url")
    private String thumbnail_url;

    @Column(name = "download_url")
    private String download_url;

    @Column(name= "category")
    private String category;

    @Column(name = "file_format")
    private String file_format;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;
}
