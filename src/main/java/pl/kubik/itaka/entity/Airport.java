package pl.kubik.itaka.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kubik.itaka.dto.CreateAirportDto;

@Entity
@Table(name = "airports")
@Getter
@Setter
@NoArgsConstructor
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne()
    private City city;

    public Airport (CreateAirportDto dto) {
        this.name = dto.getName();
        this.city = new City();
    }
}
