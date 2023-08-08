package pl.kubik.itaka.dto;

import lombok.Getter;
import lombok.Setter;
import pl.kubik.itaka.entity.Airport;
import pl.kubik.itaka.entity.City;
import pl.kubik.itaka.entity.Trip;
import pl.kubik.itaka.enums.Food;

import java.util.Date;

@Getter
@Setter
public class TripResponseDto {

    private Long id;
    private City city;
    private Airport airport;
    private Date startDate;
    private Date endDate;
    private Food food;
    private double adultPrice;
    private double childPrice;
    private Boolean isFeature;
    private int adultPlaces;
    private int childPlaces;

    public TripResponseDto(Trip trip) {
        this.id = trip.getId();
        this.city = trip.getCity();
        this.airport = trip.getAirport();
        this.startDate =trip.getStartDate();
        this.endDate = trip.getEndDate();
        this.food = trip.getFood();
        this.adultPrice = trip.getAdultPrice();
        this.childPrice = trip.getChildPrice();
        this.isFeature = trip.isFeature();
        this.adultPlaces = trip.getAdultPlaces();
        this.childPlaces = trip.getChildPlaces();
    }
}
