package com.haitian.dynamic.modular.student.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haitian.dynamic.modular.student.model.Student;
import org.springframework.stereotype.Repository;

/**
 * 学生实体类 oracle 数据库 Mapper 接口
 * @author kuluo
 * @since 2020-08-05
 */
@DS("oracle")
@Repository
public interface OracleStudentMapper extends BaseMapper<Student> {

}
