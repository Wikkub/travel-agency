package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kubik.itaka.dto.CountryResponseDto;
import pl.kubik.itaka.dto.CreateCountryDto;
import pl.kubik.itaka.entity.Country;
import pl.kubik.itaka.repository.CountryRepository;
import pl.kubik.itaka.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;
    @Autowired
    private CountryRepository countryRepository;

    @PostMapping("/countries")
    ResponseEntity<?> create(@RequestBody CreateCountryDto dto) {
        Country entity = countryService.create(dto);
        return new ResponseEntity<>(new CountryResponseDto(entity), HttpStatus.CREATED);
    }

    @GetMapping("/countries/{countryId}")
    ResponseEntity<?> getOne(@PathVariable long countryId) {
        Country country = countryService.getById(countryId);
        return new ResponseEntity<>(country, HttpStatus.OK);
    }

}
