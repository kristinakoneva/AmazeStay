package mk.ukim.finki.amaze_stay.repository.mongorep;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import mk.ukim.finki.amaze_stay.model.Comment;
import mk.ukim.finki.amaze_stay.model.Hotel;

import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findCommentsByHotel(Hotel hotel);
}