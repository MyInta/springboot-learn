package cn.ssijri.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author inta
 * @date 2019/3/5
 */
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello Inta!";
    }

/*    @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }*/

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>张丽</h1>");
        map.put("users", Arrays.asList("LISA","xiaoming","<h1>积极</h1>"));
        return "success";
    }
}
