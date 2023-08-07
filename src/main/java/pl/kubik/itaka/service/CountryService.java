package pl.kubik.itaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.kubik.itaka.dto.CreateCountryDto;
import pl.kubik.itaka.entity.Continent;
import pl.kubik.itaka.entity.Country;
import pl.kubik.itaka.repository.CountryRepository;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private ContinentService continentService;

    public Country create(CreateCountryDto dto) {
        Country country = new Country(dto);
        Continent continent = this.continentService.getById(dto.getContinentId());
        country.setContinent(continent);
        countryRepository.save(country);
        return country;
    }

    public Country getById(Long countryId) {
        Optional<Country> optionalCountry = countryRepository.findById(countryId);
        if (optionalCountry.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found");
        }
        Country country = optionalCountry.get();
        return country;
    }
}
