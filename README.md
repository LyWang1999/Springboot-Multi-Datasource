# Springboot + MyBatis-Plus 配置多数据源简单示例

## multi-datasource-parent
父项目，集中管理maven依赖

## multi-datasource-sample
简单的原生实现
* 集成MyBatis-Plus增强工具
* 集成AutoGenerator代码生成器，提供代码生成类MySqlEntityGenerator和OracleEntityGenerator
* 集成Druid数据库连接池
* 配置MySql数据库和Oracle数据库的Jdbc连接

## multi-datasource-dynamic
基于[dynamic-datasource-spring-boot-starter](https://github.com/baomidou/dynamic-datasource-spring-boot-starter)的实现
* 集成MyBatis-Plus增强工具
* 集成AutoGenerator代码生成器，提供代码生成类EntityGenerator
* 集成Druid数据库连接池，开启后台监控
* 配置MySql数据库和Oracle数据库的Jdbc连接

**注意：**本项目仅仅只是多数据源配置，不是“读写分离”
