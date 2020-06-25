package com.example.cms.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Smart on 24.06.2020.
 */
@Component
public class MyNewFilter implements Filter{

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("The new filter is called...");
    }
}
