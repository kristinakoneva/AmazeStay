package mk.ukim.finki.amaze_stay.service;

import mk.ukim.finki.amaze_stay.model.Role;
import mk.ukim.finki.amaze_stay.model.User;
import org.bson.types.ObjectId;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User register(String username, String password, String repeatPassword,
                  String name, String surname, Role role);

    User findUserById(ObjectId id);
}
