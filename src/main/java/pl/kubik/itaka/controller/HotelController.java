package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pl.kubik.itaka.repository.HotelRepository;
import pl.kubik.itaka.service.HotelService;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @Autowired
    HotelRepository hotelRepository;


}
