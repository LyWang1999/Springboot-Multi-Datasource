package com.haitian.sample.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haitian.sample.mysql.model.MySqlStudent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kuluo
 * @since 2020-08-03
 */
@Repository
public interface MySqlStudentMapper extends BaseMapper<MySqlStudent> {
    /**
     * 查询全部
     */
    List<MySqlStudent> selectAll();
}
