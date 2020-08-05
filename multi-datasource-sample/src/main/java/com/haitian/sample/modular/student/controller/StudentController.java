package com.haitian.sample.modular.student.controller;

import com.haitian.sample.modular.student.service.StudentServiceInterface;
import com.haitian.sample.mysql.model.MySqlStudent;
import com.haitian.sample.oracle.model.OracleStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kuluo
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentServiceInterface studentService;

    @GetMapping("all")
    public String getStudents() {
        List<MySqlStudent> mySqlStudents = studentService.getMySqlAllStudents();
        List<OracleStudent> oracleStudents = studentService.getOracleAllStudents();

        return mySqlStudents.toString() + '\n' + oracleStudents.toString();
    }
}
