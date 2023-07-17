package pl.kubik.itaka.entity;

import jakarta.persistence.*;
import pl.kubik.itaka.demo.enums.Food;

import java.time.LocalDate;

@Entity
@Table
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private City city;

    @ManyToOne()
    private Airport airport;

    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private Food food;

    private double adultPrice;
    private double childPrice;
    private boolean isFeature;
    private int adultPlaces;
    private int childPlaces;
}
