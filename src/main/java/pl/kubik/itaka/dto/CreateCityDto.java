package pl.kubik.itaka.dto;

import lombok.Getter;

@Getter
public class CreateCityDto {
    private String name;
    private Long countryId;
}
