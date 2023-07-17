package pl.kubik.itaka.entity;

import jakarta.persistence.*;

@Entity
@Table
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private Country country;
}
