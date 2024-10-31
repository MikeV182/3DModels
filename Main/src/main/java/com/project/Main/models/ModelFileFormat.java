package com.project.Main.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Entity
@Table(name="model_file_formats")
@AllArgsConstructor
@NoArgsConstructor
public class ModelFileFormat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Long model_id;

    @OneToMany
    @JoinColumn(name = "file_format_id")
    private List<FileFormat> file_formats;
}
