package pl.kubik.itaka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kubik.itaka.entity.Continent;

@Repository
public interface ContinentRepository extends JpaRepository <Continent, Long> {
}
