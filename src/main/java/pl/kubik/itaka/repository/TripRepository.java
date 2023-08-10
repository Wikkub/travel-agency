package pl.kubik.itaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kubik.itaka.entity.Trip;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findAllByCityId(Long cityId);

    List<Trip> findAllByAirportId(Long airportId);
}
