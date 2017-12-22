package com.earyant.config.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 10:56 : .
 * idc  com.earyant.idc.config.filter
 */
@WebFilter(filterName = "globalFilter", urlPatterns = "/*")
public class GlobalFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("执行过滤操作");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}