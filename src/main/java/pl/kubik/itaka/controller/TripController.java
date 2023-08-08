package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.kubik.itaka.dto.CreateTripDto;
import pl.kubik.itaka.dto.TripResponseDto;
import pl.kubik.itaka.entity.Trip;
import pl.kubik.itaka.repository.TripRepository;
import pl.kubik.itaka.service.TripService;

@Controller
public class TripController {

    @Autowired
    private TripService tripService;
    @Autowired
    private TripRepository tripRepository;

    @PostMapping("/trips")
    ResponseEntity<?> crete(@RequestBody CreateTripDto dto) {
        Trip entity = tripService.create(dto);
        return new ResponseEntity<>(new TripResponseDto(entity), HttpStatus.CREATED);
    }

//    @GetMapping("/trips/{tripId}")
//    ResponseEntity<?> getOne(@PathVariable long cityId) {
//        Trip trip = tripService.getById(cityId);
//        return new ResponseEntity<>(trip, HttpStatus.OK);
//    }
}
