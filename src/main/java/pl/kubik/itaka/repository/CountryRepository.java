package pl.kubik.itaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kubik.itaka.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository <Country, Long> {
}
