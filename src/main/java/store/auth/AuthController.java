package store.auth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "auth", url = "http://auth:8080")
public interface AuthController {
    
    @PostMapping("/auth/register")
    public ResponseEntity<TokenOut> register(
        @RequestBody RegisterIn in
    );

    @PostMapping("/auth/login")
    public ResponseEntity<TokenOut> login(
        @RequestBody LoginIn in
    );

}
