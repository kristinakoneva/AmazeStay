package mk.ukim.finki.technical_prototype.service;

import mk.ukim.finki.technical_prototype.model.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> listAllHotels();
    Hotel findHotelById(Long hotelId);
    Hotel findHotelByStringId(String hotelId);
}
