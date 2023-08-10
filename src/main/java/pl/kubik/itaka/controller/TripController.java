package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.kubik.itaka.dto.CreateTripDto;
import pl.kubik.itaka.dto.TripResponseDto;
import pl.kubik.itaka.entity.Trip;
import pl.kubik.itaka.repository.TripRepository;
import pl.kubik.itaka.service.AirportService;
import pl.kubik.itaka.service.TripService;

import java.util.List;

@Controller
public class TripController {

    @Autowired
    private TripService tripService;
    @Autowired
    private TripRepository tripRepository;
    @Autowired
    private AirportService airportService;

    @PostMapping("/trips")
    ResponseEntity<?> crete(@RequestBody CreateTripDto dto) {
        Trip entity = tripService.create(dto);
        return new ResponseEntity<>(new TripResponseDto(entity), HttpStatus.CREATED);
    }

    @GetMapping("/trips")
    ResponseEntity<?> getTripsByCity(@RequestParam Long cityId) {
        List<Trip> trips = tripService.getTripsByCity(cityId);
        return new ResponseEntity<>(trips, HttpStatus.OK);
    }

//    @GetMapping("/trips")
//    ResponseEntity<?> getTripsByAirport(@RequestParam Long airportId) {
//        List<Trip> trips = this.tripService.getTripsByAirport(airportId);
//        return new ResponseEntity<>(trips, HttpStatus.OK);
//    }

//    @GetMapping("/trips")
//    ResponseEntity<?> getTripsByStartDate(@RequestParam Date startDate) {
//        List<Date> dateStart = tripService.getTripsByStartDate(startDate);
//        return new ResponseEntity<>(startDate, HttpStatus.OK);
//    }

    @GetMapping("/trips/{tripId}")
    ResponseEntity<?> getOne(@PathVariable long cityId) {
        Trip trip = tripService.getById(cityId);
        return new ResponseEntity<>(trip, HttpStatus.OK);
    }
}
