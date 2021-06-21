package com.yang.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description:
 * @Author: huyang
 * @Date: 2021/6/16 下午3:13
 */
@Configuration
@PropertySource({"classpath:jdbc.properties"})
public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driverClass;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public ComboPooledDataSource dataSource() throws Exception{
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass(driverClass);
        ds.setJdbcUrl(url);
        ds.setUser(username);
        ds.setPassword(password);
        return ds;
    }
}
