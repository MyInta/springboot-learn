package cn.ssijri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author inta
 * @date 2019/3/3
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
