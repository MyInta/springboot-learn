package cn.ssijri.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBoot05DataJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot05DataJdbcApplication.class, args);
    }

}
