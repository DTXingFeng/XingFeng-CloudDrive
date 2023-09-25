package xyz.xingfeng.CloudDrive.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

/*
* 不推荐static原因，因为springboot做了静态资源处理，会自动寻找static目录下的文件
* 但是如果后续想对springmvc进行修改，就会导致springboot中对springmvc的一些配置失效
*
* 推荐：设置静态资源映射类，直接将前端资源放到recourse包下，这是springboot是找不到资源的
* 所以我们设置静态资源映射*/
@Slf4j
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    /*实现其中一个方法*/

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("开始静态资源的映射。。。。");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

}
