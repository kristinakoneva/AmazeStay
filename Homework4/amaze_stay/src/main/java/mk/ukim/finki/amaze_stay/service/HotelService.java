package mk.ukim.finki.amaze_stay.service;

import mk.ukim.finki.amaze_stay.model.Hotel;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel findHotelById(ObjectId id);

    List<Hotel> findHotelsByName(String name);

    List<Hotel> saveHotel(Hotel hotel);

    List<Hotel> listAll();

    void deleteHotelById(ObjectId id);

    List<Hotel> sortAscendingAlphabetic();
    Optional<Hotel> findHotelByName(String name);
    Hotel edit(ObjectId id, float latitude, float longitude, String name, String website, String address, String phoneNumber, String email, String description, String imagePath, String bookingLink);
}