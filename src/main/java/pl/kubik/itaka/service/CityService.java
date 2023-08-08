package pl.kubik.itaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.kubik.itaka.dto.CreateCityDto;
import pl.kubik.itaka.entity.City;
import pl.kubik.itaka.entity.Country;
import pl.kubik.itaka.repository.CityRepository;

import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CountryService countryService;

    public City create(CreateCityDto dto) {
        City city = new City(dto);
        Country country = this.countryService.getById(dto.getCountryId());
        city.setCountry(country);
        cityRepository.save(city);
        return city;
    }


    public City getById(long cityId) {
        Optional<City> optionalCity = cityRepository.findById(cityId);
        if (optionalCity.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "City not found");
        }
        City city = optionalCity.get();
        return city;
    }
}
