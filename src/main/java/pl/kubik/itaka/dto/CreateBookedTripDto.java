package pl.kubik.itaka.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookedTripDto {
    private Long tripId;
    private String participants;
}
