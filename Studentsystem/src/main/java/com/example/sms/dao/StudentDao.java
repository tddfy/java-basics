package com.example.sms.dao;

import com.example.sms.model.Student;
import java.util.*;

public class StudentDao {
    private List<Student> studentList = new ArrayList<>();

    public boolean addStudent(Student student) {
        return studentList.add(student);
    }

    public boolean deleteStudent(String id) {
        return studentList.removeIf(s -> s.getId().equals(id));
    }

    public boolean updateStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(student.getId())) {
                studentList.set(i, student);
                return true;
            }
        }
        return false;
    }

    public Student getStudentById(String id) {
        return studentList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(studentList);
    }
}