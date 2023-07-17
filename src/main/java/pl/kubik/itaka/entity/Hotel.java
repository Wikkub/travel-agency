package pl.kubik.itaka.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int standard;
    private String description;

    @ManyToOne()
    private City city;
}
