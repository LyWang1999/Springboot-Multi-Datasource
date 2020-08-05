package com.haitian.sample.modular.student.service;

import com.haitian.sample.mysql.model.MySqlStudent;
import com.haitian.sample.oracle.model.OracleStudent;

import java.util.List;

/**
 * @author kuluo
 */
public interface StudentServiceInterface {
    /**
     * 获取 Oracle数据库 Student表的所有记录
     * @return Oracle数据库 Student表的学生信息
     */
    List<OracleStudent> getOracleAllStudents();
    /**
     * 获取 MySql数据库 Student表的所有记录
     * @return MySql数据库 Student表的学生信息
     */
    List<MySqlStudent> getMySqlAllStudents();
}
