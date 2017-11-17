package com.closer.jxls.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by closer on 2016/1/3.
 */
@Configuration
@EnableWebMvc
@ComponentScan(value = "com.closer", includeFilters = @ComponentScan.Filter(Controller.class))
public class WebConfig extends WebMvcConfigurerAdapter {

}
