package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kubik.itaka.dto.CreateContinentDto;
import pl.kubik.itaka.entity.Continent;
import pl.kubik.itaka.repository.ContinentRepository;
import pl.kubik.itaka.service.ContinentService;

import java.util.List;

@RestController
public class ContinentController {

    @Autowired
    private ContinentService continentService;

    @Autowired
    private ContinentRepository continentRepository;

    @PostMapping("/continents")
    ResponseEntity<?> create(@RequestBody CreateContinentDto dto) {
        Continent continent = continentService.create(dto);
        return new ResponseEntity<>(continent, HttpStatus.CREATED);
    }

    @GetMapping("/continents")
    ResponseEntity<?> getAll() {
        List<Continent> continents = continentService.getAll();
        return new ResponseEntity<>(continents, HttpStatus.OK);
    }

    @GetMapping("/continents/{continentId}")
    ResponseEntity<?> getOne(@PathVariable long continentId) {
        Continent continent = continentService.getById(continentId);
        return new ResponseEntity<>(continent, HttpStatus.OK);
    }

    @DeleteMapping("/continents/{continentId}")
    ResponseEntity<?> deleteOne(@PathVariable long continentId) {
        continentService.removeById(continentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
