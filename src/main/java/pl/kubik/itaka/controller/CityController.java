package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kubik.itaka.dto.CityResponseDto;
import pl.kubik.itaka.dto.CreateCityDto;
import pl.kubik.itaka.entity.City;
import pl.kubik.itaka.repository.CityRepository;
import pl.kubik.itaka.service.CityService;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;
    @Autowired
    private CityRepository cityRepository;

    @PostMapping("/cities")
    ResponseEntity<?> crete(@RequestBody CreateCityDto dto) {
        City entity = cityService.create(dto);
        return new ResponseEntity<>(new CityResponseDto(entity), HttpStatus.CREATED);
    }

    @GetMapping("/cities/{cityId}")
    ResponseEntity<?> getOne(@PathVariable long cityId) {
        City city = cityService.getById(cityId);
        return new ResponseEntity<>(city, HttpStatus.OK);
    }

}
