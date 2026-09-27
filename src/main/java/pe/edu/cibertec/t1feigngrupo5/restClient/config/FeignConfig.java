package pe.edu.cibertec.t1feigngrupo5.restClient.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import pe.edu.cibertec.t1feigngrupo5.restClient.errorhandler.CustomErrorDecoder;

public class FeignConfig {
    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }
}
