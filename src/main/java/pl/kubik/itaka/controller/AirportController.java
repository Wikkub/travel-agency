package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kubik.itaka.dto.AirportResponseDto;
import pl.kubik.itaka.dto.CreateAirportDto;
import pl.kubik.itaka.entity.Airport;
import pl.kubik.itaka.repository.AirportRepository;
import pl.kubik.itaka.service.AirportService;

@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;
    @Autowired
    private AirportRepository airportRepository;

    @PostMapping("/airports")
    ResponseEntity<?> crete(@RequestBody CreateAirportDto dto) {
        Airport entity = airportService.create(dto);
        return new ResponseEntity<>(new AirportResponseDto(entity), HttpStatus.CREATED);
    }

    @GetMapping("/airports/{airportId}")
    ResponseEntity<?> getOne(@PathVariable long airportId) {
        Airport airport = airportService.getById(airportId);
        return new ResponseEntity<>(airport, HttpStatus.OK);
    }
}
