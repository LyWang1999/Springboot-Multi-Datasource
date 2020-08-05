package com.haitian.dynamic.modular.student.controller;

import com.haitian.dynamic.modular.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试多数据源是否能够调用
 * @author kuluo
 * @since 2020-08-05
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("all")
    private String testSelect() {
        return studentService.selectMysqlUsers() + "\n\n" +
               studentService.selectOracleStudents();
    }
}
