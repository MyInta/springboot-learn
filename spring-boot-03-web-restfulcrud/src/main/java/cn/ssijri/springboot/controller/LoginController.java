package cn.ssijri.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author inta
 * @date 2019/3/7
 * @describe
 */
@Controller
public class LoginController {

//    @DeleteMapping
//    @GetMapping
//    @PutMapping
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object>map,
                        HttpSession session){
        if(!StringUtils.isEmpty(username)&&"123".equals(password)){
            //登陆成功
            session.setAttribute("loginUser",username);
//            return "dashboard";
            //防止表单重复提交，需要重定向
            return "redirect:/main.html";
        }else {
            //登陆失败
            map.put("msg","用户密码失败");
            return "login";
        }
    }
}
