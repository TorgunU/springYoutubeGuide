package ru.course.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.course.springstudents.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    void deleteByEmail(String email);

    Student findByLastName(String lastName);

}
