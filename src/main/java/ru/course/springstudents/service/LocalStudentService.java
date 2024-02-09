package ru.course.springstudents.service;

import org.springframework.stereotype.Service;
import ru.course.springstudents.model.Student;

import java.time.LocalDate;
import java.util.*;

@Service
public class LocalStudentService implements StudentService {
    private final Map<Integer, Student> STUDENTS = new HashMap();

    public LocalStudentService() {
        STUDENTS.put(20, new Student(
                "Ivan", "Torgun", LocalDate.now(), "ivan@mail.com", 20)
        );

        STUDENTS.put(43, new Student(
                "Petr", "Petrov", LocalDate.now(), "petr@mail.com", 43)
        );
    }

    @Override
    public List<Student> findAllStudents() {
        return STUDENTS.values().stream().toList();
    }

    @Override
    public Student saveStudent(Student student) {
        STUDENTS.put(student.getAge(), student);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        STUDENTS.put(student.getAge(), student);
        return STUDENTS.get(student.getAge());
    }

    @Override
    public Student findBySurname(String lastName) throws IllegalArgumentException{
        return STUDENTS.values().stream()
                .filter(student -> student.getLastName().equals(lastName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Can't find student: " + lastName));
    }

    @Override
    public void deleteStudent(String email) {
        Student student = STUDENTS.values().stream()
                .filter(s -> s.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Can't find student: " + email));;
        STUDENTS.remove(student.getAge());
    }
}
