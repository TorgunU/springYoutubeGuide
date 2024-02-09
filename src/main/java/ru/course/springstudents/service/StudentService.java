package ru.course.springstudents.service;

import ru.course.springstudents.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student findBySurname(String lastName);
    void deleteStudent(String email);
}
