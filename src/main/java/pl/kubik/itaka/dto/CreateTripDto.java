package pl.kubik.itaka.dto;

import lombok.Getter;

@Getter
public class CreateTripDto {
    private Long cityId;
    private Long airportId;
    private String startDate;
    private String endDate;
    private String food;
    private double adultPrice;
    private double childPrice;
    private String isFeature;
    private int adultPlaces;
    private int childPlaces;
}
