package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kubik.itaka.dto.CreateHotelDto;
import pl.kubik.itaka.dto.HotelResponseDto;
import pl.kubik.itaka.entity.Hotel;
import pl.kubik.itaka.repository.HotelRepository;
import pl.kubik.itaka.service.HotelService;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @Autowired
    HotelRepository hotelRepository;

    @PostMapping("/hotels")
    ResponseEntity<?> create(@RequestBody CreateHotelDto dto) {
        Hotel entity = hotelService.create(dto);
        return new ResponseEntity<>(new HotelResponseDto(entity), HttpStatus.CREATED);
    }

    @GetMapping("/hotels/{hotelId}")
    ResponseEntity<?> getOne(@PathVariable long hotelId) {
        Hotel hotel = hotelService.getById(hotelId);
        return new ResponseEntity<>(hotel, HttpStatus.OK);
    }

}
