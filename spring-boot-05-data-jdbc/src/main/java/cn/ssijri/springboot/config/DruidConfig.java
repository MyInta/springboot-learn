package cn.ssijri.springboot.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.util.HashMap;
import java.util.Map;

/**
 * @author inta
 * @date 2019/3/15
 * @describe
 */
@Configuration
public class DruidConfig {

    //配置Druid的监控
    //1、配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();

        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("allow","");//默认就是允许所有访问
        initParams.put("deny","127.0.0.1");

        bean.setInitParameters(initParams);
        return bean;
    }
    //使用后者配置有一个奇怪现象，就是druid会直接登录，跳过账户密码验证
//        @WebServlet(urlPatterns = "/druid/*", initParams = {
//                // IP白名单
//                // (没有配置或者为空，则允许所有访问)
//                @WebInitParam(name = "allow", value = ""),
//                // IP黑名单 (存在共同时，deny优先于allow)
//                @WebInitParam(name = "deny", value = ""),
//                // 用户名
//                @WebInitParam(name = "loginUsername", value = "admin"),
//                // 密码
//                @WebInitParam(name = "loginPassword", value = "123456"),
//                // 禁用HTML页面上的“Reset All”功能
//                @WebInitParam(name = "resetEnable", value = "false")
//        })
//        public class DruidStatViewServlet extends StatViewServlet {
//            private static final long serialVersionUID = 1L;
//        }

        //2、配置一个web监控的filter
        @WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*", initParams = {
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
        })
        public class DruidStatFilter extends WebStatFilter {

        }

}
