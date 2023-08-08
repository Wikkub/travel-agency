package pl.kubik.itaka.dto;

import lombok.Getter;

@Getter
public class CreateAirportDto {
    private String name;
    private Long cityId;
}
