package cn.aolixin.springbootunified.controller;

import cn.aolixin.springbootunified.model.entity.Student;
import cn.aolixin.springbootunified.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private Student student;

    //获取所有学生
    @RequestMapping("/getAllStudent")
    @ResponseBody
    public List<Student> getAllStudent() throws Exception {
        return studentService.getAllStudent();
    }

    //删除学生
    @RequestMapping("/delete")
    public String delete(@Param("StudentId") String StudentId) throws Exception {
        studentService.deleteStudent(StudentId);
        return "你已经删掉了id为"+StudentId+"的用户";
    }

    //增加用户
    @RequestMapping("/StudentLogin")
    @ResponseBody
        public String addStudent(@RequestBody Map map) throws Exception {

        student.setStudentId((String) map.get("studentId"));
        student.setName((String) map.get("name"));
        student.setGender((Integer) map.get("gender"));
        student.setPassword((String) map.get("password"));

        studentService.addStudent(student);

        return "增加用户";
    }
}
