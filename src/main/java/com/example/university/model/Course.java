package com.example.university.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "course")
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int courseId;

  @Column(name = "name")
  private String courseName;

  @Column(name = "credits")
  private int credits;

  @ManyToOne
  @JoinColumn(name = "professorId")
  private Professor professor;

  @ManyToMany
  @JoinTable(name = "course_student", joinColumns = @JoinColumn(name = "courseid"), inverseJoinColumns = @JoinColumn(name = "studentid"))
  @JsonIgnoreProperties("courses")

  private List<Student> students;

  public Course() {
  }

  public Course(int courseid, String courseName, int credits, Professor professor, List<Student> students) {
    this.courseId = courseid;
    this.courseName = courseName;
    this.credits = credits;
    this.professor = professor;
    this.students = students;

  }

  public int getCourseId() {
    return this.courseId;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }

  public String getCourseName() {
    return this.courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public int getCredits() {
    return this.credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public Professor getProfessor() {
    return this.professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public List<Student> getStudents() {
    return this.students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }
}