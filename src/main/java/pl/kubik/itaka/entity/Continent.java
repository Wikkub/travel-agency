package pl.kubik.itaka.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kubik.itaka.dto.CreateContinentDto;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "continents")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;

    public Continent(CreateContinentDto dto) {
        this.name = dto.getName();
    }
}
