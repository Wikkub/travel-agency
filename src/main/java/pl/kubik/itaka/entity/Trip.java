package pl.kubik.itaka.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.kubik.itaka.dto.CreateTripDto;
import pl.kubik.itaka.enums.Food;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Entity
@Table(name = "trips")
@Getter
@Setter
@NoArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private City city;

    @ManyToOne()
    private Airport airport;

    private Date startDate;
    private Date endDate;

    @Enumerated(EnumType.STRING)
    private Food food;

    private double adultPrice;
    private double childPrice;
    private boolean isFeature;
    private int adultPlaces;
    private int childPlaces;

    public Trip(CreateTripDto dto) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

        this.city = new City();
        this.airport = new Airport();
        this.startDate = dateFormat.parse(dto.getStartDate());
        this.endDate = dateFormat.parse(dto.getEndDate());
        this.food = Food.valueOf(dto.getFood());
        this.adultPrice = dto.getAdultPrice();
        this.childPrice = dto.getChildPrice();
        this.isFeature = Boolean.parseBoolean(dto.getIsFeature());
        this.adultPlaces = dto.getAdultPlaces();
        this.childPlaces = dto.getChildPlaces();
    }
}
