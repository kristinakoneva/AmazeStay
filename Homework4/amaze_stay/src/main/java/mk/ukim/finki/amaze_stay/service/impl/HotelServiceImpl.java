package mk.ukim.finki.amaze_stay.service.impl;

import mk.ukim.finki.amaze_stay.model.Hotel;
import mk.ukim.finki.amaze_stay.repository.mongorep.HotelRepository;
import mk.ukim.finki.amaze_stay.service.HotelService;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    public final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel findHotelById(ObjectId id) {
        if(hotelRepository.findById(id).isPresent()){
            return hotelRepository.findHotelById(id);
        }
        return hotelRepository.findHotelById(id);
    }

    @Override
    public List<Hotel> findHotelsByName(String name) {
        return hotelRepository.findAllByNameContains(name);
    }

    @Override
    public List<Hotel> saveHotel(Hotel hotel) {
        this.hotelRepository.save(hotel);
        return listAll();
    }

    @Override
    public List<Hotel> listAll() {
        return this.hotelRepository.findAll();
    }

    @Override
    public void deleteHotelById(ObjectId id) {
        this.hotelRepository.deleteById(id);
    }

    @Override
    public List<Hotel> sortAscendingAlphabetic() {
        return this.hotelRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    @Override
    public Optional<Hotel> findHotelByName(String name) {
        return this.hotelRepository.findByName(name);
    }

    @Override
    public Hotel edit(ObjectId id, float latitude, float longitude, String name, String website, String address, String phoneNumber, String email, String description, String imagePath, String bookingLink) {
        Hotel hotel = this.hotelRepository.findHotelById(id);

        hotel.setName(name);
        hotel.setLatitude(latitude);
        hotel.setLongitude(longitude);
        hotel.setName(name);
        hotel.setWebsite(website);
        hotel.setAddress(address);
        hotel.setPhoneNumber(phoneNumber);
        hotel.setEmail(email);
        hotel.setDescription(description);
        hotel.setImagePath(imagePath);
        hotel.setBookingLink(bookingLink);

        return this.hotelRepository.save(hotel);
    }
}
