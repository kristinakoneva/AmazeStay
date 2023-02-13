package mk.ukim.finki.amaze_stay.repository.mongorep;

import mk.ukim.finki.amaze_stay.model.Hotel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, ObjectId> {
    List<Hotel> findAllByNameContains(String name);
    void deleteById(ObjectId id);
    Optional<Hotel> findByName(String name);
    Hotel findHotelById(ObjectId id);

}

