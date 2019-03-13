package cn.ssijri.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author inta
 * @date 2019/3/13
 * @describe
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter process--- ---");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
