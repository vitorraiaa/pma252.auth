package store.auth;

import lombok.Builder;

@Builder
public record LoginIn(
    String name,
    String email,
    String password
) {
    
}
