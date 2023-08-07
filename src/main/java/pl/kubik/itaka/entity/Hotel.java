package pl.kubik.itaka.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kubik.itaka.dto.CreateHotelDto;

@Entity
@Table(name = "hotels")
@Setter
@Getter
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int standard;
    private String description;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    public Hotel(CreateHotelDto dto) {
        this.name = dto.getName();
        this.standard = dto.getStandard();
        this.description = dto.getDescription();
        this.city = new City();
    }
}
