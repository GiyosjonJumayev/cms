package com.example.cms.config;

import com.example.cms.filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Smart on 24.06.2020.
 */

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<MyNewFilter> registrationBean(){
        FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/customers");

         return registrationBean;

    }

}
