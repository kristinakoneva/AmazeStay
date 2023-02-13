package mk.ukim.finki.amaze_stay.service;

import mk.ukim.finki.amaze_stay.model.User;

public interface AuthService {

    User login(String username, String password);
    //User register(String username, String password, String repeatPassword, String name, String surname);

}
