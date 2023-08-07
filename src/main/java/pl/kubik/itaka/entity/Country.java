package pl.kubik.itaka.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kubik.itaka.dto.CreateCountryDto;

@Entity
@Table(name = "counties")
@Setter
@Getter
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne()
    private Continent continent;

    public Country(CreateCountryDto dto) {
        this.name = dto.getName();
        this.continent = new Continent();
    }
}
