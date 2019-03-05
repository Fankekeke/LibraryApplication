package com.library.library.util;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/users/*", filterName = "logFilter2")
public class FirstFilter implements Filter {
    @Override
    public void destroy() {
    // TODO Auto-generated method stub
    }
    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
        System.out.println("进入过滤器");
        long start = System.currentTimeMillis();
        arg2.doFilter(arg0, arg1);
        System.out.println("LogFilter2 Execute cost=" + (System.currentTimeMillis() - start));
        System.out.println("离开过滤器");
    }
    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

}