package pl.kubik.itaka.dto;

import lombok.Getter;

@Getter
public class CreateCountryDto {
    private String name;
    private Long continentId;
}
