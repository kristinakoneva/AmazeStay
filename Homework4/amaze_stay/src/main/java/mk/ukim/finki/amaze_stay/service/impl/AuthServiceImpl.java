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

//    @Override
//    public User register(String username, String password, String repeatPassword, String name, String surname) {
//        if (username==null || username.isEmpty()  || password==null || password.isEmpty()) {
//            throw new InvalidArgumentsException();
//        }
//        if (!password.equals(repeatPassword)) {
//            throw new PasswordsDoNotMatchException();
//        }
//
//        if (this.userRepository.findByUsername(username).isPresent() ||
//                !this.userRepository.findByUsername(username).isEmpty()) {
//            throw new UsernameAlreadyExistsException(username);
//        }
//
//        User user = new User(username,password,name,surname);
//        return userRepository.save(user);
//    }
}
