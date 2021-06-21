package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午4:55
 */
@Configuration
@ComponentScan({"com.aop"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
