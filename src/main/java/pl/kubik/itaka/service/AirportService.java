package pl.kubik.itaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.kubik.itaka.dto.CreateAirportDto;
import pl.kubik.itaka.entity.Airport;
import pl.kubik.itaka.entity.City;
import pl.kubik.itaka.repository.AirportRepository;

import java.util.Optional;

@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private CityService cityService;

    public Airport create(CreateAirportDto dto) {
        Airport airport = new Airport(dto);
        City city = this.cityService.getById(dto.getCityId());
        airport.setCity(city);
        airportRepository.save(airport);
        return airport;
    }


    public Airport getById(long airportId) {
        Optional<Airport> optionalAirport = airportRepository.findById(airportId);
        if (optionalAirport.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Airport not found");
        }
        Airport airport = optionalAirport.get();
        return airport;
    }
}
