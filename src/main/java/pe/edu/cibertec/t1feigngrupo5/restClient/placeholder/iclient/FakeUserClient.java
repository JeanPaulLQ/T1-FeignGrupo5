package pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.model.FakeUserDto;

import java.util.List;

@FeignClient(
        name = "fakeUserClient",
        url = "https://fakestoreapi.com"
)
public interface FakeUserClient {

    @GetMapping("users")
    List<FakeUserDto> getUsers();
}
