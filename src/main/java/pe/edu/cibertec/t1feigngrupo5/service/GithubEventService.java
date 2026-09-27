package pe.edu.cibertec.t1feigngrupo5.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo5.restClient.github.iclient.GithubEventClient;
import pe.edu.cibertec.t1feigngrupo5.restClient.github.model.GithubEventDto;

import java.util.List;

@Service
public class GithubEventService {

    private final GithubEventClient githubEventClient;

    public GithubEventService(GithubEventClient githubEventClient) {
        this.githubEventClient = githubEventClient;
    }

    public List<GithubEventDto> obtenerPushEventsActorImpar() {
        return githubEventClient.getEvents().stream()
                .filter(e -> "PushEvent".equals(e.getType()))          // comparación de Strings
                .filter(e -> e.getActor() != null
                        && e.getActor().getId() != null
                        && e.getActor().getId() % 2 != 0)              // actor.id impar
                .toList();
    }
}