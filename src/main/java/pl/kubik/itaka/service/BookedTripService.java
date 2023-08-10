package pl.kubik.itaka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kubik.itaka.dto.CreateBookedTripDto;
import pl.kubik.itaka.entity.BookedTrip;
import pl.kubik.itaka.entity.Trip;
import pl.kubik.itaka.repository.BookedTripRepository;

import java.util.Optional;

@Service
public class BookedTripService {
    @Autowired
    private BookedTripRepository bookedTripRepository;
    @Autowired
    private TripService tripService;

    public BookedTrip create(CreateBookedTripDto dto) {
        Trip trip = this.tripService.getById(dto.getTripId());
        BookedTrip bookedTrip = new BookedTrip(dto);
        bookedTrip.setTrip(trip);
        return bookedTrip;
    }

    public Optional<BookedTrip> getById(long bookedTripId) {
        return this.bookedTripRepository.findById(bookedTripId);
    }
}
