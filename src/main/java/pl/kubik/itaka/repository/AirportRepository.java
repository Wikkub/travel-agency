package pl.kubik.itaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kubik.itaka.entity.Airport;


@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

}
