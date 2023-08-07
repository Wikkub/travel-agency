package pl.kubik.itaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kubik.itaka.dto.CreateHotelDto;
import pl.kubik.itaka.entity.Continent;
import pl.kubik.itaka.entity.Country;
import pl.kubik.itaka.entity.Hotel;
import pl.kubik.itaka.repository.HotelRepository;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

}
