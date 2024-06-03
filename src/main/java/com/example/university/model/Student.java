package com.example.university.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "student")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int studentId;

  @Column(name = "name")
  private String studentName;

  @Column(name = "email")
  private String email;

  @ManyToMany(mappedBy = "students")
  @JsonIgnoreProperties("students")

  private List<Course> courses;

  public Student() {
  }

  public Student(int StudentId, String studentName, String email, List<Course> courses) {
    this.studentId=studentId;
    this.studentName = studentName;
    this.email = email;
    this.courses = courses;
  }

  public int getStudentId() {
    return this.studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return this.studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName=studentName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Course> getCourses() {
    return this.courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }
}