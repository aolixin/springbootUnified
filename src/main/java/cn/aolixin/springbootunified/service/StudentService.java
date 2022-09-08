package cn.aolixin.springbootunified.service;

import cn.aolixin.springbootunified.mapper.StudentMapper;
import cn.aolixin.springbootunified.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private  StudentMapper studentmapper;

    public List<Student> getAllStudent(){
        return studentmapper.getAllStudent();
    }

    public void deleteStudent(String studentId){
        studentmapper.deleteStudent(studentId);
    }

    public void addStudent(Student student){
        studentmapper.addStudent(student);
    }
}
