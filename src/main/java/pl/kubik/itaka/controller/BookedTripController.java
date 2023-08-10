package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.kubik.itaka.dto.CreateBookedTripDto;
import pl.kubik.itaka.entity.BookedTrip;
import pl.kubik.itaka.repository.BookedTripRepository;
import pl.kubik.itaka.service.BookedTripService;

import java.util.Optional;

public class BookedTripController {

    @Autowired
    private BookedTripService bookedTripService;
    @Autowired
    private BookedTripRepository bookedTripRepository;

    @PostMapping("/booked-trips")
    ResponseEntity<?> crete(@RequestBody CreateBookedTripDto dto) {
        BookedTrip entity = bookedTripService.create(dto);
        return new ResponseEntity<>(entity, HttpStatus.CREATED);
    }

    @GetMapping("/booked-trips/{bookedTripId}")
    ResponseEntity<?> getOne(@PathVariable long bookedTripId) {
        Optional<BookedTrip> bookedTrip = bookedTripService.getById(bookedTripId);
        return new ResponseEntity<>(bookedTrip, HttpStatus.OK);
    }
}
