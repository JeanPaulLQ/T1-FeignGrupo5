package pe.edu.cibertec.t1feigngrupo5.restClient.github.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubEventDto {

    private String id;
    private String type;
    private ActorDto actor;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ActorDto {
        private Long id;

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public ActorDto getActor() { return actor; }
    public void setActor(ActorDto actor) { this.actor = actor; }
}