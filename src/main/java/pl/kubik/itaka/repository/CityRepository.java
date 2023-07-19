package pl.kubik.itaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kubik.itaka.entity.City;

@Repository
public interface CityRepository extends JpaRepository <City, Long> {
}
