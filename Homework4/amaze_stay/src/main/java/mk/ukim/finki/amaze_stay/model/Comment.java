package mk.ukim.finki.amaze_stay.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import mk.ukim.finki.amaze_stay.DTO.HotelCommentDTO;

import java.time.LocalDateTime;

@Data
@Document(collection = "hotel_comments")
@NoArgsConstructor
public class Comment {

    @Id
    private ObjectId _id;

    private String comment;
    private String dateTime;
    private User user;
    private Hotel hotel;
    private float rating;

    public Comment(String comment, User user, Hotel hotel, float rating) {
        this._id = new ObjectId();
        this.comment = comment;
        this.user = user;
        this.hotel = hotel;
        this.dateTime = LocalDateTime.now().toString();
        this.rating = rating;
    }

    public static HotelCommentDTO convertToDTO(Comment comment){
        return new HotelCommentDTO(comment.getUser().getUsername(), comment.getDateTime(), comment.getComment(), comment.getHotel().getName(), comment.getRating());
    }

    public String getComment(){
        return this.comment;
    }

    public String getDateTime(){
        return this.dateTime;
    }

    public User getUser(){
        return this.user;
    }

    public Hotel getHotel(){
        return this.hotel;
    }

    public float getRating(){
        return this.rating;
    }
}
