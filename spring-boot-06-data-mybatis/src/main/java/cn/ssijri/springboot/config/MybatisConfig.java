package cn.ssijri.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author inta
 * @date 2019/3/17
 * @describe
 */
@Configuration
public class MybatisConfig {

    //记得添加到容器
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer(){
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                //开启驼峰识别 department_name与departmentName统一了
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
