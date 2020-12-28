package com.lean.springcloud.config;

/**
 * Created by Administrator on 2020/12/28.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
//applicationContext.xml <bean id="" class=""/>
}
