package com.haitian.dynamic.modular.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haitian.dynamic.modular.student.model.Student;
import org.springframework.stereotype.Repository;

/**
 * 学生实体类 mysql 数据库 Mapper 接口
 * @author kuluo
 * @since 2020-08-05
 */
@Repository
public interface MysqlStudentMapper extends BaseMapper<Student> {

}
