package com.project.Main.repositories;

import com.project.Main.models.MyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelsRepository extends JpaRepository<MyModel, Long> {
}
