package pl.kubik.itaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kubik.itaka.entity.BookedTrip;

@Repository
public interface BookedTripRepository extends JpaRepository<BookedTrip, Long> {
}
