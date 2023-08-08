package pl.kubik.itaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.kubik.itaka.dto.CreateHotelDto;
import pl.kubik.itaka.entity.City;
import pl.kubik.itaka.entity.Hotel;
import pl.kubik.itaka.repository.HotelRepository;

import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    private CityService cityService;

    public Hotel create(CreateHotelDto dto) {
        Hotel hotel = new Hotel(dto);
        City city = this.cityService.getById(dto.getCityId());
        hotel.setCity(city);
        hotelRepository.save(hotel);
        return hotel;
    }

    public Hotel getById(Long hotelId) {
        Optional<Hotel> optionalHotel = hotelRepository.findById(hotelId);
        if (optionalHotel.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Hotel not found");
        }
        Hotel hotel = optionalHotel.get();
        return hotel;
    }


}
