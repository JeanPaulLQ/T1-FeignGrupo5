package pe.edu.cibertec.t1feigngrupo5.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo5.restClient.placeholder.model.FakeUserDto;
import pe.edu.cibertec.t1feigngrupo5.service.FakeUserService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/fake-user-client")
@RestController
public class FakeUserController {

    private final FakeUserService fakeUserService;

    // localhost:8080/api/v1/fake-user-client
    @GetMapping
    public ResponseEntity<List<FakeUserDto>> getUsers() {
        return ResponseEntity.ok(fakeUserService.getUsers());
    }
}