package com.yang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午3:12
 */
@Configuration
@ComponentScan({"com.yang"})
@Import({JdbcConfig.class})
public class SpringConfig {


}
