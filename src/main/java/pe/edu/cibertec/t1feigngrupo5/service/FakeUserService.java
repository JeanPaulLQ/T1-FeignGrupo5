package pe.edu.cibertec.t1feigngrupo5.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.iclient.FakeUserClient;
import pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.model.FakeUserDto;


import java.util.List;

@RequiredArgsConstructor
@Service
public class FakeUserService {

    private final FakeUserClient fakeUserClient;

    public List<FakeUserDto> getUsers() {
        return fakeUserClient.getUsers()
                .stream()
                .filter(user -> user.getId() % 2 == 0)
                .filter(user -> user.getUsername().length() > 6)
                .toList();
    }
}
