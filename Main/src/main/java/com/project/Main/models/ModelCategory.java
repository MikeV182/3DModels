package com.project.Main.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
@Table(name="model_categories")
@AllArgsConstructor
@NoArgsConstructor
public class ModelCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Long model_id;

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Category> categories;
}
