package cn.ssijri.springboot.controller;

import cn.ssijri.springboot.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author inta
 * @date 2019/3/12
 * @describe
 */
@ControllerAdvice
public class MyExceptionHandler {

//    @ResponseBody
//    @ExceptionHandler(UserNotExistException.class)
//    public Map<String,Object> handlerException(Exception e){
//
//        Map<String,Object> map =new HashMap<String, Object>();
//        map.put("code","user not exit");
//        map.put("msg",e.getMessage());
//        return map;
//    }
    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(Exception e, HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        //传入我们自己的错误状态码  4xx 5xx，否则就不会进入定制错误页面的解析流程
        /**
         * Integer statusCode = (Integer) request
         .getAttribute("javax.servlet.error.status_code");
         */
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user not exit");
        map.put("message","用户出错了~");

        request.setAttribute("ext",map);
        return "forward:/error";
    }
}
