package mk.ukim.finki.amaze_stay.service.impl;

import mk.ukim.finki.amaze_stay.model.User;
import mk.ukim.finki.amaze_stay.model.exceptions.InvalidArgumentsException;
import mk.ukim.finki.amaze_stay.model.exceptions.InvalidUserCredentialsException;
import mk.ukim.finki.amaze_stay.model.exceptions.PasswordsDoNotMatchException;
import mk.ukim.finki.amaze_stay.model.exceptions.UsernameAlreadyExistsException;
import mk.ukim.finki.amaze_stay.repository.mongorep.UserRepository;
import mk.ukim.finki.amaze_stay.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }
        return userRepository.findByUsername(username)
                .orElseThrow(InvalidUserCredentialsException::new);
    }

}
