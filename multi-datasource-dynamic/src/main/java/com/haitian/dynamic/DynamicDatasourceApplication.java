package com.haitian.dynamic;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kuluo
 * @since 2020-08-20
 */
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScans({@MapperScan("com.haitian.dynamic.modular.student.mapper")})
public class DynamicDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDatasourceApplication.class, args);
    }

}
