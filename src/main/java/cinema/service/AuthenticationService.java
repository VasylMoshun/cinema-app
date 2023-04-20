package cinema.service;

import mate.academy.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
