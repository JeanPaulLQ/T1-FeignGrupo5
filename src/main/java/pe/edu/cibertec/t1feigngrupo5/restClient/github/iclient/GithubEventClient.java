package pe.edu.cibertec.t1feigngrupo5.restClient.github.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo5.restClient.github.model.GithubEventDto;

import java.util.List;

@FeignClient(name = "githubEventClient", url = "https://api.github.com")
public interface GithubEventClient {

    @GetMapping(value = "/events", headers = {
            "Accept=application/vnd.github+json",
            "User-Agent=T1-FeignGrupo5"
    })
    List<GithubEventDto> getEvents();
}