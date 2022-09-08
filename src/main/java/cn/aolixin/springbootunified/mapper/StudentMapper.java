package cn.aolixin.springbootunified.mapper;

import cn.aolixin.springbootunified.model.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Mapper
public interface StudentMapper {
    //获取所有学生
    @Select("select * from student")
    public List<Student> getAllStudent();

    //根据学号删除学生
    @Delete("delete from student where studentId = #{StudentId}")
    public void deleteStudent(String studentId);

    //新增学生
    @Insert("insert into student(studentId , name ,gender , password) values (#{studentId},#{name},#{gender},#{password})")
    public void addStudent(Student student);
}
