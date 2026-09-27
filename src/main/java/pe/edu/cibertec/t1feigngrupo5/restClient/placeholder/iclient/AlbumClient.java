package pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo5.restClient.config.FeignConfig;
import pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.model.AlbumsPlaceHolder;

import java.util.List;

@FeignClient(name = "albumClient", url = "https://jsonplaceholder.typicode.com", configuration = FeignConfig.class)
public interface AlbumClient {
    @GetMapping("albums")
    List<AlbumsPlaceHolder> getAlbums();
}
