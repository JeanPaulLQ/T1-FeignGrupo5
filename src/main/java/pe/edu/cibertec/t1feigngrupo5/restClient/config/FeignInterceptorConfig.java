package pe.edu.cibertec.t1feigngrupo5.restClient.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignInterceptorConfig {
    @Bean
    public RequestInterceptor requestInterceptor(){
        return template -> template.header("Authorization", "Bearer ..");
    }
}
