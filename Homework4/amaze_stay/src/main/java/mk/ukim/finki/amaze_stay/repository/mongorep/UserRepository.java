package mk.ukim.finki.amaze_stay.repository.mongorep;

import mk.ukim.finki.amaze_stay.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUsername(String username);
    User findUserById(ObjectId id);
}
