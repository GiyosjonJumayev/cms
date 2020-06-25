package com.example.cms.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Smart on 24.06.2020.
 */

@Component
@Order(2)
public class MyFilter_1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Filter 1 is called ...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
