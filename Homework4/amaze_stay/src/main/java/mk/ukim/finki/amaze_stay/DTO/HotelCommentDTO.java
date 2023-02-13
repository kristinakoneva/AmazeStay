package mk.ukim.finki.amaze_stay.DTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelCommentDTO {

    private String username;
    private String time;
    private String comment;
    private String hotelName;
    private float rating;

    public HotelCommentDTO(String username, String time, String comment, String hotelName, float rating) {
        this.username = username;
        this.time = time;
        this.comment = comment;
        this.hotelName = hotelName;
        this.rating = rating;
    }
}