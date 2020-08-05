package com.haitian.sample.modular.student.service.impl;

import com.haitian.sample.modular.student.service.StudentServiceInterface;
import com.haitian.sample.mysql.mapper.MySqlStudentMapper;
import com.haitian.sample.mysql.model.MySqlStudent;
import com.haitian.sample.oracle.mapper.OracleStudentMapper;
import com.haitian.sample.oracle.model.OracleStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kuluo
 */
@Service
public class StudentServiceImpl implements StudentServiceInterface {

    @Autowired
    private MySqlStudentMapper mySqlStudentMapper;

    @Autowired
    private OracleStudentMapper oracleStudentMapper;

    @Override
    public List<OracleStudent> getOracleAllStudents() {
        return oracleStudentMapper.selectAll();
    }

    @Override
    public List<MySqlStudent> getMySqlAllStudents() {
        return mySqlStudentMapper.selectAll();
    }
}
