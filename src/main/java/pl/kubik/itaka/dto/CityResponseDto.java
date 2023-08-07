package pl.kubik.itaka.dto;

import lombok.Getter;
import lombok.Setter;
import pl.kubik.itaka.entity.City;
import pl.kubik.itaka.entity.Country;

@Getter
@Setter
public class CityResponseDto {
    private Long id;
    private String name;
    private Country country;

    public CityResponseDto(City city) {
        this.id = city.getId();
        this.name = city.getName();
        this.country = city.getCountry();
    }
}
