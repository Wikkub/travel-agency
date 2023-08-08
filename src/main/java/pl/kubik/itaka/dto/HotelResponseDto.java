package pl.kubik.itaka.dto;

import lombok.Getter;
import lombok.Setter;
import pl.kubik.itaka.entity.City;
import pl.kubik.itaka.entity.Hotel;

@Getter
@Setter
public class HotelResponseDto {

    private Long id;
    private String name;
    private int standard;
    private String description;
    private City city;

    public HotelResponseDto(Hotel hotel) {
        this.id = hotel.getId();
        this.name = hotel.getName();
        this.standard = hotel.getStandard();
        this.description = hotel.getDescription();
        this.city = hotel.getCity();
    }
}
