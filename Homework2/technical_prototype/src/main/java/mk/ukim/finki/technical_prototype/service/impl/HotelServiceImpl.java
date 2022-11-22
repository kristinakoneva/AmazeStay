package mk.ukim.finki.technical_prototype.service.impl;

import mk.ukim.finki.technical_prototype.model.Hotel;
import mk.ukim.finki.technical_prototype.repository.inmem.InMemoryHotelRepository;
import mk.ukim.finki.technical_prototype.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    public final InMemoryHotelRepository hotelRepository;

    public HotelServiceImpl(InMemoryHotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> listAllHotels() {
        return hotelRepository.listAllHotels();
    }

    @Override
    public Hotel findHotelById(Long hotelId) {
        return hotelRepository.findById(hotelId);
    }

    @Override
    public Hotel findHotelByStringId(String hotelId) {
        return hotelRepository.findByStringId(hotelId);
    }
}
