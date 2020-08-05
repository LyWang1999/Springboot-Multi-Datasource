package com.haitian.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kuluo
 */
@SpringBootApplication
@MapperScans({
    @MapperScan(value = "com.haitian.database.mysql.mapper", sqlSessionFactoryRef = "mysqlSqlSessionFactory"),
    @MapperScan(value = "com.haitian.database.oracle.mapper", sqlSessionFactoryRef = "oracleSqlSessionFactory")
})
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
