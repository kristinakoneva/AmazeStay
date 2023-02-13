package mk.ukim.finki.amaze_stay.service;

import mk.ukim.finki.amaze_stay.model.User;

public interface AuthService {

    User login(String username, String password);

}
