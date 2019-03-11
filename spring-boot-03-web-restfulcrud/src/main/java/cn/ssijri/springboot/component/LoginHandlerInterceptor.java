package cn.ssijri.springboot.component;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author inta
 * @date 2019/3/7
 * @describe
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if(user==null){
            //未登录
            request.setAttribute("msg","未登陆成功没有权限访问该地址");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else {
            //登陆成功了的
            return true;
        }

    }
}
