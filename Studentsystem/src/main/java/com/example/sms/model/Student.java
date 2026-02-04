package com.example.sms.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String className;
    private String major;
    private double score;

    public Student() {}

    public Student(String id, String name, int age, String gender,
                   String className, String major, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.className = className;
        this.major = major;
        this.score = score;
    }

    // Getter 和 Setter 方法
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
}