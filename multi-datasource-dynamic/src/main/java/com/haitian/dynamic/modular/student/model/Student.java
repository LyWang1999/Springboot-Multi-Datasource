package com.haitian.dynamic.modular.student.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生实体类
 * @author kuluo
 * @since 2020-08-05
 */
@Data
@NoArgsConstructor
public class Student extends Model<Student> {

    private Long id;

    private String name;

    private Boolean sex;

    private Integer age;

    private Long departmentId;
}
