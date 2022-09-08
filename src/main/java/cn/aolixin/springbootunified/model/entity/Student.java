package cn.aolixin.springbootunified.model.entity;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * 实体学生类
 */
@Component
@AllArgsConstructor@NoArgsConstructor
public class Student {
    @Getter@Setter
    private String studentId;
    @Getter@Setter
    private String name;
    @Getter@Setter
    private Integer Gender;
    @Getter@Setter
    private String password;
}
