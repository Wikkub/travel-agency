package pl.kubik.itaka.dto;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import pl.kubik.itaka.entity.Airport;
import pl.kubik.itaka.entity.City;

@Getter
@Setter
public class AirportResponseDto {
    private Long id;
    private String name;
    private City city;

    public AirportResponseDto(Airport airport) {
        this.id = airport.getId();
        this.name = airport.getName();
        this.city = airport.getCity();
    }
}
