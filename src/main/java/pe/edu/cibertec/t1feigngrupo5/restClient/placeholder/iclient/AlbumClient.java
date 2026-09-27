package pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import pe.edu.cibertec.t1feigngrupo5.restClient.config.FeignConfig;

@FeignClient(name = "albumClient", url = "https://jsonplaceholder.typicode.com", configuration = FeignConfig.class)
public interface AlbumClient {
}
