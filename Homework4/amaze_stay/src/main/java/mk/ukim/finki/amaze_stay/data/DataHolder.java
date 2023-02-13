package mk.ukim.finki.amaze_stay.data;


import lombok.Getter;
import mk.ukim.finki.amaze_stay.model.Hotel;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {
    public static List<Hotel> hotels = new ArrayList<>();
}
