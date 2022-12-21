package mk.ukim.finki.amaze_stay.service;

import mk.ukim.finki.amaze_stay.model.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> listAllHotels();

    Hotel findHotelById(Long hotelId);
}
