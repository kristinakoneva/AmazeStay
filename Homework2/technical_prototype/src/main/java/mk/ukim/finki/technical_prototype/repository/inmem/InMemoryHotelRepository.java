package mk.ukim.finki.technical_prototype.repository.inmem;

import mk.ukim.finki.technical_prototype.data.DataHolder;
import mk.ukim.finki.technical_prototype.model.Hotel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class InMemoryHotelRepository {
    public List<Hotel> listAllHotels(){
        return DataHolder.hotels;
    }

    public Hotel findById(Long hotelId){
        return DataHolder.hotels.stream().filter(hotel -> Objects.equals(hotel.getId(), hotelId)).findFirst().orElse(null);
    }

    public Hotel findByStringId(String hotelId){
        return DataHolder.hotels.stream().filter(hotel -> Objects.equals(hotel.getId().toString(), hotelId)).findFirst().orElse(null);
    }
}
