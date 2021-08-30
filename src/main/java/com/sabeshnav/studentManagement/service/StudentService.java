package com.sabeshnav.studentManagement.service;

import com.sabeshnav.studentManagement.model.Student;

import java.util.List;

public interface StudentService
{
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student get(Integer id);
    public Student update(Integer id);
    public void delete(Integer id);
}
