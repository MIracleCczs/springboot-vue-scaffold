package com.miracle.springbootvue.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: springboot-vue-scaffold
 * @description: mybatis config
 * @author: miracle
 * @create: 2020-08-15 10:56
 **/
@Configuration
@EnableTransactionManagement
@MapperScan("com.miracle.springbootvue.mapper")
public class MybatisConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
