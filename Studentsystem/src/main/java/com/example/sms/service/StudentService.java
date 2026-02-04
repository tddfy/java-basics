package com.example.sms.service;

import com.example.sms.dao.StudentDao;
import com.example.sms.model.Student;
import java.util.List;

public class StudentService {
    private StudentDao studentDao = new StudentDao();

    public boolean addStudent(String id, String name, int age, String gender,
                              String className, String major, double score) {
        Student student = new Student(id, name, age, gender, className, major, score);
        return studentDao.addStudent(student);
    }

    public boolean deleteStudent(String id) {
        return studentDao.deleteStudent(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public double getAverageScore() {
        List<Student> students = studentDao.getAllStudents();
        if (students.isEmpty()) return 0;

        double total = 0;
        for (Student s : students) {
            total += s.getScore();
        }
        return total / students.size();
    }
}