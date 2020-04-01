package com.jenson.ecommerce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动入口
 *
 */
@SpringBootApplication
@MapperScan({"com.jenson.ecommerce.mapper","com.jenson.ecommerce.dao"})
public class ECommerceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ECommerceAdminApplication.class, args);
    }
}
