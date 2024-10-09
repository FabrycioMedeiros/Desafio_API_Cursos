package com.desafio_crud.desafio_rocketseat.repository;

import com.desafio_crud.desafio_rocketseat.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
