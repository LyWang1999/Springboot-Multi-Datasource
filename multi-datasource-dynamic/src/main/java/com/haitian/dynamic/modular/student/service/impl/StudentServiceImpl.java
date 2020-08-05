package com.haitian.dynamic.modular.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haitian.dynamic.modular.student.mapper.MysqlStudentMapper;
import com.haitian.dynamic.modular.student.mapper.OracleStudentMapper;
import com.haitian.dynamic.modular.student.model.Student;
import com.haitian.dynamic.modular.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kuluo
 * @since 2020-08-20
 */
@Service
public class StudentServiceImpl extends ServiceImpl<MysqlStudentMapper, Student> implements StudentService {

    @Autowired
    private OracleStudentMapper oracleStudentMapper;

    @Override
    public List<Student> selectOracleStudents() {
        return baseMapper.selectList(null);
    }

    @Override
    public List<Student> selectMysqlUsers() {
        return oracleStudentMapper.selectList(null);
    }

    @Override
    public void addMysqlStudent(Student student) {
        baseMapper.insert(student);
    }
}
