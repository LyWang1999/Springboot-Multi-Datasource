package com.haitian.dynamic.modular.student.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.haitian.dynamic.modular.student.model.Student;

import java.util.List;

/**
 * @author kuluo
 * @since 2020-08-05
 */
public interface StudentService extends IService<Student> {
    /**
     * Oracle数据库查询所有学生
     * @return 所有学生信息
     */
    List<Student> selectOracleStudents();

    /**
     * Mysql数据库查询所有学生
     * @return 所有学生信息
     */
    List<Student> selectMysqlUsers();

    /**
     * Mysql数据库添加学生
     * @param student 学生
     */
    void addMysqlStudent(Student student);
}
