package mk.ukim.finki.amaze_stay.repository.inmem;

import mk.ukim.finki.amaze_stay.data.DataHolder;
import mk.ukim.finki.amaze_stay.model.Hotel;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Objects;

@Repository
public class InMemoryHotelRepository {
    public List<Hotel> listAllHotels() {
        return DataHolder.hotels;
    }

    public Hotel findById(Long hotelId) {
        return DataHolder.hotels.stream().filter(hotel -> Objects.equals(hotel.getId(), hotelId)).findFirst().orElse(null);
    }
}
