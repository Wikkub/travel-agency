package pl.kubik.itaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pl.kubik.itaka.dto.CreateTripDto;
import pl.kubik.itaka.entity.Airport;
import pl.kubik.itaka.entity.City;
import pl.kubik.itaka.entity.Trip;
import pl.kubik.itaka.repository.TripRepository;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;
    @Autowired
    private CityService cityService;
    @Autowired
    private AirportService airportService;

    public Trip create(CreateTripDto dto) {
        Trip trip = null;
        try {
            trip = new Trip(dto);
        } catch (ParseException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Incorrect startDate or endDate format");
        }
        City city = this.cityService.getById(dto.getCityId());
        trip.setCity(city);
        Airport airport = this.airportService.getById((dto.getAirportId()));
        trip.setAirport(airport);
        tripRepository.save(trip);
        return trip;
    }

    public List<Trip> getTripsByCity(Long cityId) {
        return this.tripRepository.findAllByCityId(cityId);
    }

    public Trip getById(long tripId) {
        Optional<Trip> optionalTrip = tripRepository.findById(tripId);
        if (optionalTrip.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Trip not found");
        }
        Trip trip= optionalTrip.get();
        return trip;
    }

    public List<Date> getTripsByStartDate(Date startDate) {
        return null;
    }

    public List<Trip> getTripsByAirport(Long airportId) {
        return this.tripRepository.findAllByAirportId(airportId);
    }
}
