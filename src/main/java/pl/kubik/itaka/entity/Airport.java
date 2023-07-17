package pl.kubik.itaka.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne()
    private City city;
}
