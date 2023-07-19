package pl.kubik.itaka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kubik.itaka.repository.CountryRepository;
import pl.kubik.itaka.service.CountryService;

@RestController

public class CountryController {

    @Autowired
    private CountryService countryService;
    @Autowired
    private CountryRepository countryRepository;


}
