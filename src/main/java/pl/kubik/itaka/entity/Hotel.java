package pl.kubik.itaka.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int standard;
    private String description;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;
}
