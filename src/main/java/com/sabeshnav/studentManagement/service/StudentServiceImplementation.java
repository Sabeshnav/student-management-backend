package com.sabeshnav.studentManagement.service;

import com.sabeshnav.studentManagement.model.Student;
import com.sabeshnav.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student get(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student update(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
