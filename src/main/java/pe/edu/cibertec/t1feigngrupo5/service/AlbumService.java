package pe.edu.cibertec.t1feigngrupo5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.iclient.AlbumClient;
import pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.model.AlbumsPlaceHolder;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlbumService {
    private final AlbumClient albumClient;

    public List<AlbumsPlaceHolder> getAlbumsUserIdParIdImpar(){
        return albumClient.getAlbums().stream()
                .filter( album -> album.getUserId() % 2 == 0 && album.getId() % 2 != 0)
                .toList();
    }
}
