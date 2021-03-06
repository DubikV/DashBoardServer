package ua.com.avatlantik.dashboard.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("ua.com.avatlantik.dashboard.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
