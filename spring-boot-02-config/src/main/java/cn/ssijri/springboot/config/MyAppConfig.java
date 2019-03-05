package cn.ssijri.springboot.config;

import cn.ssijri.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author inta
 * @date 2019/3/4
 * @Configuration: 指明当前类是一个配置类；用以替代之前的spring配置文件
 */
@Configuration
public class MyAppConfig {

    //将方法返回值添加到容器中；容器中默认组件id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加了组件。。。");
        return new HelloService();
    }
}
