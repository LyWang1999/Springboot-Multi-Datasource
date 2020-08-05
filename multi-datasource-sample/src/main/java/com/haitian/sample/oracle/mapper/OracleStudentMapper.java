package com.haitian.sample.oracle.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.haitian.sample.oracle.model.OracleStudent;
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
public interface OracleStudentMapper extends BaseMapper<OracleStudent> {
    /**
     * 查询全部
     */
    List<OracleStudent> selectAll();
}
