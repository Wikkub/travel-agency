package pl.kubik.itaka.dto;

import lombok.Getter;

@Getter
public class CreateHotelDto {
    private String name;
    private int standard;
    private String description;
    private Long cityId;

}
