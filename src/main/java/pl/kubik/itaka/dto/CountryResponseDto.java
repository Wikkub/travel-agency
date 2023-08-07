package pl.kubik.itaka.dto;

import lombok.Getter;
import lombok.Setter;
import pl.kubik.itaka.entity.Continent;
import pl.kubik.itaka.entity.Country;

@Getter
@Setter
public class CountryResponseDto {
    private Long id;
    private String name;
    private Continent continent;

    public CountryResponseDto(Country country) {
        this.id = country.getId();
        this.name = country.getName();
        this.continent = country.getContinent();
    }
}
