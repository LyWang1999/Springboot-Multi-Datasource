package com.haitian.sample.modular.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * MySql数据库 实体生成
 *
 * @author kuluo
 * @date 2020-08-03 14:32
 */
public class MySqlEntityGenerator {

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        /*
         * 全局配置
         */
        GlobalConfig gc = new GlobalConfig();
        gc.setActiveRecord(true);
        // Java 文件夹路径
        gc.setOutputDir("H:\\SpringBoot\\multi-datasource\\multi-datasource-sample\\src\\main\\java");
        // 是否覆盖
        gc.setFileOverride(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columnList
        gc.setBaseColumnList(false);
        // 开发人员
        gc.setAuthor("kuluo");
        mpg.setGlobalConfig(gc);

        /*
         * 数据源配置
         */
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=Asia/Shanghai");
        mpg.setDataSource(dsc);

        /*
         * 策略配置
         */
        StrategyConfig strategy = new StrategyConfig();
        // 表前缀
        // strategy.setTablePrefix("haitian_");
        // 表名生成策略 —— 下划线转驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 添加要逆向生成的数据表
        strategy.setInclude(new String[]{"student"});
        mpg.setStrategy(strategy);

        /*
         * 包配置
         */
        PackageConfig pc = new PackageConfig();
        pc.setParent(null);
        pc.setEntity("com.haitian.database.mysql.model");
        pc.setMapper("com.haitian.database.mysql.mapper");
        pc.setXml("com.haitian.database.mysql.mapper");
        //本项目没用，生成之后删掉
        pc.setService("useless");
        //本项目没用，生成之后删掉
        pc.setServiceImpl("useless");
        //本项目没用，生成之后删掉
        pc.setController("useless");
        mpg.setPackageInfo(pc);

        /*
         * 执行生成
         */
        mpg.execute();
    }
}
