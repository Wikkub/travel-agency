package pl.kubik.itaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kubik.itaka.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository <Hotel, Long> {
}
