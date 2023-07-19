package pl.kubik.itaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kubik.itaka.entity.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
}
