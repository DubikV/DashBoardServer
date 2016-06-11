package ua.com.avatlantik.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;


@Configuration
@EnableJpaRepositories("ua.com.avatlantik.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("ua.com.avatlantik.server")
public class DataBaseConfig {

    @Resource
    private Environment env;



}
