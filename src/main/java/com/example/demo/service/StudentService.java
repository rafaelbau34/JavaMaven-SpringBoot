package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();
    private Long currentId = 1L;

    public List<Student> findAll() {
        return students;
    }

    public void save(Student student) {
        if (student.getId() == null) {
            student.setId(currentId++);
            students.add(student);
        } else {
            deleteById(student.getId());
            students.add(student);
        }
    }

    public Student findById(Long id) {
        Optional<Student> student = students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();
        return student.orElse(null);
    }

    public void deleteById(Long id) {
        students.removeIf(s -> s.getId().equals(id));
    }
}
