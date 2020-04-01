package com.jenson.ecommerce.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 *
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.jenson.ecommerce.mapper","com.jenson.ecommerce.dao"})
public class MyBatisConfig {
}
